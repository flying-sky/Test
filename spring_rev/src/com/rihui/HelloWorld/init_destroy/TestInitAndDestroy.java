package com.rihui.HelloWorld.init_destroy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInitAndDestroy {

	@Test
	public void test(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/rihui/HelloWorld/init_destroy/applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) classPathXmlApplicationContext.getBean("helloWorld");
		helloWorld.say();
		classPathXmlApplicationContext.destroy();
	}
	
}
