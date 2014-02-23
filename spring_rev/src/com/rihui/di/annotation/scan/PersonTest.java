package com.rihui.di.annotation.scan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonTest {
	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rihui/di/annotation/scan/applicationContext.xml");
		Person person = (Person) applicationContext.getBean("person");
		person.say();
		
	}
}
