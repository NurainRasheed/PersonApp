package com.full.services;



public class LoginMethodClass {

	
		public boolean validateUser(String name) 
		{
	    	if(name.equals(" ") || name.length()<6) {
	    		return false;
	    	}
	    		return true;
	    }
		 public boolean validatePassword(String password) 
		    {
		    	if("abc1234".equals(password)) {
		    		return true;
		    	}
		    		return false;
		    }
		
	}

