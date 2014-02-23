package com.rihui.ioc.HelloWorld.init;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rihui/ioc/HelloWorld/init/applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.say();
	}
	
}
