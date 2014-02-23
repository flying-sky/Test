package com.rihui.proxy2jdk;

public class Privilege {

	private String access;

	public void setAccess(String access) {
		this.access = access;
	}
	
	public boolean access(){
		if(access.equals("admin")){
			return true;
		}
		return false;
	}
	
}
