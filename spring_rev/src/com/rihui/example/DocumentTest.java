package com.rihui.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentTest {

	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rihui/example/applicationContext.xml");
		ReadDocument readDocument = (ReadDocument) applicationContext.getBean("readDocument");
		readDocument.read();
	}
	
}
