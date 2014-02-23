package com.rihui.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

@SuppressWarnings("unchecked")
public class TestAnnotation {

	@Test
	public void test() throws ClassNotFoundException{
		
		Class stuClass = Class.forName("com.rihui.annotation.Student");
		if(stuClass.isAnnotationPresent(Description.class)){
			
			Description description = (Description) stuClass.getAnnotation(Description.class);
			System.out.println(description.desc());
		}
		
		Method[] methods = stuClass.getMethods();
		if(methods != null)
			for(Method method : methods){
				System.out.println("------------------");
				System.out.println(method.getName());
				if(method.isAnnotationPresent(Name.class)){
					Name name = method.getAnnotation(Name.class);
					System.out.println(name.desc());
				}
				System.out.println("-------------------");
			}
		
	}
	
}
