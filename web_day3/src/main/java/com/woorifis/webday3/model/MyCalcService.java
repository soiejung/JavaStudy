package com.woorifis.webday3.model;

public class MyCalcService {

	private static MyCalcService service = new MyCalcService();

	private MyCalcService() {
	}

	public static MyCalcService getService() {
		return service;
	}

	public int add(int a, int b) {
		return a + b;
	}

}
