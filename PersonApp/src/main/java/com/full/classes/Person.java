package com.full.classes;

public class Person {
	private String name;
	private String phno;
	private String email;
	private String id;
	
	Person(String name,String phno, String email, String id){
		this.name=name;
		this.phno=phno;
		this.email=email;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getphno()
	{
		return phno;
	}
	public String getEmail() {
		return email;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhno(String phno) {
		this.phno=phno;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setId(String idno) {
		this.id=idno;
	}
	public void display() {
		
		System.out.println("Name: " + name);
		System.out.println("Phone Number: "+ phno);
		System.out.println("Email: "+email);
		System.out.println("ID: "+id);
	}
	
		
	}
	

