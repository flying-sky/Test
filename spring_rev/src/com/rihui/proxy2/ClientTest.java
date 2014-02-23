package com.rihui.proxy2;

import org.junit.Test;

public class ClientTest {

	@Test
	public void test(){
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		privilege.setAccess("aaa");
		SalaryService target = new SalaryServiceImpl();
		SalaryProxy salaryProxy = new SalaryProxy(logger, security, privilege, target);
		salaryProxy.showSalary();
	}
	
}
