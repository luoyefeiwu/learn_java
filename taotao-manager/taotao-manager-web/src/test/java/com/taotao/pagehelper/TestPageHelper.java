package com.taotao.pagehelper;

import org.junit.Test;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPageHelper {
	@Test
	public void testPageHelper() {
		// 1.获得mapper代理对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/applicationContext-*.xml");
		TbItemMapper itemMapper = applicationContext.getBean(TbItemMapper.class);
		// 2.设置分页
		PageHelper.startPage(1, 30);
		// 3.执行查询
		List<TbItem> list = itemMapper.selectByExample(new TbItemExample());
		// 4.取分页后的结果
		// 取查询结果
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		System.out.println(total);
		System.out.println(list.size());
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}

	}
}
