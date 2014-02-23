package com.rihui.proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void test(){
		Target target = new TargetObject();
		Proxy proxy = new Proxy(target);
		proxy.bussiness();
	}
	
}
