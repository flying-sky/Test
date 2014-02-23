package com.rihui.mvc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	@Test
	public void testXmlMvc(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rihui/mvc/annotation/applicationContext.xml");
		PersonAction personAction = (PersonAction) context.getBean("personAction");
//		personAction.savePerson();
		personAction.updatePerson();
	}
	
}
