package com.remote.impl;

import com.caucho.hessian.server.HessianServlet;

public class HessianHelloWorldImpl extends HessianServlet implements
		HessianHelloWorld {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2735866694850667735L;

	public String target() {
		
		return "hello world";
	}


}
