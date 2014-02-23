package com.rihui.proxy2jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Interceptor implements InvocationHandler{

	private Object target;
	private Logger logger;
	private Security security;
	private Privilege privilege;
	
	
	public Interceptor(Object target, Logger logger, Security security,
			Privilege privilege) {
		super();
		this.target = target;
		this.logger = logger;
		this.security = security;
		this.privilege = privilege;
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		this.logger.logging();
		this.security.checkSecurity();
		if(this.privilege.access()){
			return method.invoke(target, args);
		}else{
			System.out.println("您没有权限查看");
		}
		return null;
	}

}
