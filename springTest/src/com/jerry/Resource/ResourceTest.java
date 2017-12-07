package com.jerry.Resource;

import org.junit.Test;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

public class ResourceTest {

	@Test
	public void testByteArrayResource(){
		Resource resource=new ByteArrayResource("Hello World".getBytes());
		if(resource.exists()){
			
		}
	}
}
