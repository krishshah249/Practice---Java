package com.cg.eis.service;

public interface Validator {
	
	String aidpattern = "(0)*[1-9]{1}[0-9]{2}";
	String salarypattern="((0)*[1-9][0-9]+)|((0)*[1-9][0-9]+.[0-9]*)";
	
	String designationpattern="(system associate)|(programmer)|(manager)|(clerk)";
	//String namepattern = "((\\w){3}(\\w)* (\\w){3}(\\w)*)|(\\w+'\\w* \\w+)";
	String namepattern = "([A-Za-z]{3}([A-Za-z])* [A-Za-z]{3}([A-Za-z])*)|(([A-Za-z])+'([A-Za-z])* [A-Za-z]{3}([A-Za-z])*)|([A-Za-z]{3}([A-Za-z])* ([A-Za-z])+'([A-Za-z])*)";
	
	public static boolean validatedata(String data,String pattern) {
		
		return data.matches(pattern);
		
	}
	
}



//