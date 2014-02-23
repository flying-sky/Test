package com.rihui.ioc.HelloWorld.factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rihui/ioc/HelloWorld/applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("小爱");
		helloWorld.say();
	}
	
	@Test
	public void testFatory(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rihui/ioc/HelloWorld/factory/applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld.say();
	}
	
}
