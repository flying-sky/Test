package com.rihui.proxy2;

public class SalaryProxy implements SalaryService{

	private Logger logger;
	private Security security;
	private Privilege privilege;
	private SalaryService target;
	
	public SalaryProxy(Logger logger, Security security, Privilege privilege,
			SalaryService target) {
		super();
		this.logger = logger;
		this.security = security;
		this.privilege = privilege;
		this.target = target;
	}


	@Override
	public void showSalary() {
		this.logger.logging();
		this.security.checkSecurity();
		if(this.privilege.access()){
			this.target.showSalary();
		}else{
			System.out.println("您没有权限查看");
		}
	}

}
