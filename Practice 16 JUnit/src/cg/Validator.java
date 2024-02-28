package cg;

public class Validator {
	
	public boolean validateNo(String data) {
	
		return data.matches("\\d+");
		
		
	}
	
	public boolean isPalindrome(String data) {
		
		StringBuffer sb= new StringBuffer(data);
		String reverse=sb.reverse().toString();
		return data.equals(reverse);
		
	}
	
	public int getSizeMl(Size size) {
		
		System.out.println(size.getMl());
		return size.getMl();
		
	}
}
