package com.rihui.di.constructor;

import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testProperty(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rihui/di/constructor/applicationContext.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.getPid());
		System.out.println(person.getPname());
		person.getStudent().say();
	}
}
