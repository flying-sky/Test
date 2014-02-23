package com.rihui.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExtendTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rihui/extend/applicationContext.xml");
		Student student = (Student) context.getBean("student");
		student.say();
	}
	
}
