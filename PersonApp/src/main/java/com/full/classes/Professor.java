package com.full.classes;

import com.full.interfaces.Performable;

public class Professor extends Person implements Performable{
	private String clss;
	private String subject;
	int rating;
	
	public Professor(String name, String phno, String email, String id,String classid,String sub) {
		super(name, phno, email, id);
		this.clss=classid;
		this.subject=sub;
		
		
		// TODO Auto-generated constructor stub
	}

	
	public String getSubject()
	{
		return subject;
	}
	public String getClss() {
		return clss;
	}
	public void setClss(String clss) {
		this.clss = clss;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void display() {
		super.display();
		System.out.println("Class:"+clss);
		System.out.println("Subject:"+subject);
	
	}
	public int getRating() {
		return 5;
	}
	@Override
	public String checkPerformance() {
		// TODO Auto-generated method stub
		if(this.getRating()==5) {
			return "Outstanding Performance";
		}
		else
			return "Keep it up!";
	}
	
}
