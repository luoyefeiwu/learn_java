package com.jerry.dom4j;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestDom4j {

	@Test
	public void Test1() throws DocumentException {
		// 创建xml解析对象
		SAXReader reader = new SAXReader();
		// 将xml 文档加载到内存中
		Document doc = reader.read("src/Book.xml");
		Element root = doc.getRootElement();
		Element bookNode = root.element("书");
		System.out.println(bookNode.getName());
	}
	
	@Test // 2、遍历所有元素节点
	public void test2() throws DocumentException{
		SAXReader reader = new SAXReader();//创建一个xml解析对象
	     Document document = reader.read("src/Book.xml");//把xml文档加载到document对象中
	     Element root = document.getRootElement();
	     treeWalk(root);
	}

	private void treeWalk(Element ele) {
		System.out.println(ele.getName());//输出当前节点的名子
		for (int i = 0; i < ele.nodeCount(); i++) {//ele.nodeCount()得到当前节点的所有子节点的数量
			Node node = ele.node(i);//取出下标为i的节点 
			if(node instanceof Element){//判断当前节点是否为标签
				treeWalk((Element)node);//把node强转为标签(Element)
			}else{
				System.out.println(node.getText());
			}
		}
	}
}
