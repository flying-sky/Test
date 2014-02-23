package com.rihui.proxy2;

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
