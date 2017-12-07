package com.jerry.scope;

import java.util.*;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

public class SingletonBeanRegister implements SingletonBeanRegistry {

	//单例Bean缓存池，此处不考虑并发
	private final Map<String, Object> BEANS = new HashMap<String, Object>();  
	public boolean containsSingleton(String beanName) {
		return BEANS.containsKey(beanName);
	}

	public Object getSingleton(String beanName) {
		return BEANS.get(beanName);
	}

	public int getSingletonCount() {
		return BEANS.size();
	}

	public Object getSingletonMutex() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] getSingletonNames() {
		return BEANS.keySet().toArray(new String[0]);
	}

	public void registerSingleton(String beanName, Object bean) {
		if(BEANS.containsKey(beanName)){
			throw new RuntimeException("["+beanName+"]已存在");
		}
		BEANS.put(beanName, bean);
	}
}
