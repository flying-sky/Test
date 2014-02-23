package com.rihui.proxy;

public class Proxy implements Target{

	private Target targetObj;
	public Proxy(Target targetObj){
		this.targetObj = targetObj;
	}
	@Override
	public void bussiness() {
		System.out.println("xxxxxxxxxxxxxxxxxxxx");
		this.targetObj.bussiness();
		System.out.println("yyyyyyyyyyyyyyyyyyyy");
	}
}
