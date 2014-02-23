package com.rihui.annotation;
@Description(desc="这是一个学生类")
public class Student {
	
	@Name(desc="学生的姓名")
	public void sayName(){
		System.out.println("student name ... ");
	}
	
	@Name(desc="学生的来源")
	public void saySource(){
		System.out.println("student source ... ");
	}
}
