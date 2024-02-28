package com.cg.service;

public interface Validator {
	
	String aidpattern = "[1-9]{1}[0-9]{2}";
	String mobilepattern = "[1-9]{1}[0-9]{9}";
	String namepattern = "([A-Z]|[a-z]){3}([A-Z]|[a-z])* ([A-Z]|[a-z]){3}([A-Z]|[a-z])*";
	
	public static boolean validatedata(String data,String pattern) {
		
		return data.matches(pattern);
		
	}
	
}

