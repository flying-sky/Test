package com.rihui.ioc.HelloWorld.factory;

public class HelloWorld {

	public void say(){
		
		System.out.println("Hello World!");
		
	}
	
	public static HelloWorld getInstance(){
		return new HelloWorld();
	}
}
