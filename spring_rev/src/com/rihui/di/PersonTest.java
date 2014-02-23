package com.rihui.di;

import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testProperty(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/rihui/di/applicationContext.xml");
		Person person = (Person) applicationContext.getBean("person");
//		System.out.println(person.getPid());
//		System.out.println(person.getPname());
//		person.getStudent().say();
//		List list = person.getLists();
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		((Student)list.get(2)).say();
//		System.out.println(person.getSets().size());
		System.out.println(person.getMaps().size());
	}
}
