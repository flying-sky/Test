package com.rihui.di.annotation.scan;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("person")
public class Person {
	@Resource(name = "student")
	private Student student;

	
	public void say(){
		this.student.say();
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init ... ");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy ... ");
	}
	
	
}
