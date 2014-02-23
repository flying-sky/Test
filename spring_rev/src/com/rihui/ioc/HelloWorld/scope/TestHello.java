package com.rihui.ioc.HelloWorld.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rihui/ioc/HelloWorld/scope/applicationContext.xml");
		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld1);
		System.out.println(helloWorld2);
		
	}
	
}
