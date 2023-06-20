package com.woorifis.webday3.model;

public class LoginService {
	
	private static LoginService service = new LoginService();
	
	private LoginService() {}
	
	public static LoginService getService() {
		return service;
	}
	public boolean login(String id, String pass) {
		
		if ("hong".equals(id) & "1234".equals(pass)) {
			return true;
		}else {
			return false;
		}
		
	}

}
