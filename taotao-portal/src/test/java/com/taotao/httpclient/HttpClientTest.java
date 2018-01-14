package com.taotao.httpclient;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpClientTest {

	@Test
	public void testHttpGet() throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet get = new HttpGet("http://www.baidu.com");
		CloseableHttpResponse response = httpClient.execute(get);
		HttpEntity entity = response.getEntity();
		String html = EntityUtils.toString(entity);
		System.out.println(html);
		httpClient.close();
		response.close();
	}

	@Test
	public void testHttpPost() throws Exception {
		// 第一步 创建一个 httpclient 对象
		CloseableHttpClient httpClient = HttpClients.createDefault();
		// 第二步 创建一个httppost对象 需要指定 一个url
		HttpPost post = new HttpPost("http://localhost:8082/posttest");
		// 第三步 创建一个 list模拟表单，list中每个元素是一个NameValuePair对象
		List<NameValuePair> formList = new ArrayList<>();
		formList.add(new BasicNameValuePair("name", "张三"));
		formList.add(new BasicNameValuePair("pass", "1234"));
		// 第四步 需要把 表单 包装到Entity对象中，StringEntity
		StringEntity entity = new UrlEncodedFormEntity(formList);
		post.setEntity(entity);
		// 第五步 执行请求
		CloseableHttpResponse response = httpClient.execute(post);
		// 第六步 接收返回结果
		HttpEntity httpEntity = response.getEntity();
		String result = EntityUtils.toString(httpEntity);
		System.out.println(result);
		// 第七步 关闭流
		response.close();
		httpClient.close();
	}
}
