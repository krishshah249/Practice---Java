package com.cg.eis.exceptions;

public class InvalidOption extends Exception {

		public InvalidOption(){
			
			
		}

		public InvalidOption(String msg){
			
			super(msg);
		}

		public String toString() {
			
			return "Invalid Option:"+super.getMessage();
			
		}
}
