package com.rihui.proxy2jdk;

import java.lang.reflect.Proxy;

import org.junit.Test;


public class ClientTest {

	@Test
	public void test(){
		
		Logger logger = new Logger();
		Privilege privilege = new Privilege();
		privilege.setAccess("admin0");
		Security security = new Security();
		SalaryService target = new SalaryServiceImpl();
		Interceptor interceptor = new Interceptor(target, logger, security, privilege);
		
		SalaryService salaryService = (SalaryService) Proxy.newProxyInstance(SalaryServiceImpl.class.getClassLoader(), SalaryServiceImpl.class.getInterfaces(), interceptor);
		salaryService.showSalary();
		
	}
	
}
