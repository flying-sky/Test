package com.rihui.di.annotation;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
public class Person {
	@Resource(name = "student")
//	@Autowired
//	@Qualifier("student")
	private Student s;

	
	public void say(){
		this.s.say();
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
