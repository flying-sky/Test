package com.rihui.HelloWorld.init_destroy;

public class HelloWorld {

	public HelloWorld(){
		System.out.println("创建对象");
	}
	
	public void say(){
		System.out.println("say() method ...");
	}
	
	public void init(){
		System.out.println("init() ...");
	}
	
	public void destroy(){
		System.out.println("destroy() ...");
	}
}
