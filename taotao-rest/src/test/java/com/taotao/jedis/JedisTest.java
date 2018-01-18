package com.taotao.jedis;

import java.util.HashSet;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taotao.rest.component.impl.JedisClientCluster;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class JedisTest {
	@Test
	public void testJedis() throws Exception {
		Jedis jedis = new Jedis("192.168.3.7", 6379);
		jedis.set("hello", "1000");
		String string = jedis.get("hello");
		System.out.println(string);
		jedis.close();
	}

	@Test
	public void testJedisPool() throws Exception {
		// 创建jedis连接池
		JedisPool pool = new JedisPool("192.168.3.7", 6379);
		// 从连接池中获得redis连接
		Jedis jedis = pool.getResource();
		String string = jedis.get("hello");
		System.out.println(string);
		// 操作结束关闭连接
		jedis.close();
		// 程序结束，关闭连接池
		pool.close();

	}

	@Test
	public void testJedisCluster() throws Exception {
		// 创建集群的节点
		HashSet<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort("192.168.3.7", 7001));
		nodes.add(new HostAndPort("192.168.3.7", 7002));
		nodes.add(new HostAndPort("192.168.3.7", 7003));
		nodes.add(new HostAndPort("192.168.3.7", 7004));
		nodes.add(new HostAndPort("192.168.3.7", 7005));
		nodes.add(new HostAndPort("192.168.3.7", 7006));
		// 在Nodes中 指定每个节点
		JedisCluster jedisCluster = new JedisCluster(nodes);
		jedisCluster.set("name", "张三");
		jedisCluster.set("value", "100");
		String name = jedisCluster.get("name");
		String value = jedisCluster.get("value");
		System.out.println(name);
		System.out.println(value);
		jedisCluster.close();
	}

	@Test
	public void testJedisClusterSpring() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-*.xml");
		JedisClientCluster jedisClientCluster = applicationContext.getBean(JedisClientCluster.class);
		jedisClientCluster.set("hello", "1000");
		String result = jedisClientCluster.get("hello");
		System.out.println(result);
	}
}
