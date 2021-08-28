package com.full.classes;

import com.full.interfaces.Performable;

public class Student extends Person implements Performable{
	
	private int marks;
	private String grade;


	public Student(String name, String phno,String email, String idno, int marks){
		
	super(name,phno, email,idno);
	this.marks=marks;
		
		
	}
	public String checkGrade() {
		if(marks<50)
		{
			grade="F";
		}
		else if(marks<60) {
			grade="E";
			
		}
		else if(marks<70) {
			grade="D";
			
		}
		else if(marks<80) {
			grade="C";
		
		}
		else if(marks<90) {
			grade="B";
		}	
		else{		
			grade ="A";
		}
		return grade;
		}
	
	public void display() {
		super.display();
		System.out.println("Marks:"+marks);
		System.out.println("Grade:"+grade);
	}

	@Override
	public String checkPerformance() {
		// TODO Auto-generated method stub
		if(this.grade.equals("A")||this.grade.equals("B"))
			return "Outstanding Performance";
		else if(this.grade.equals("C")||this.grade.equals("D"))
			return "Good Performance";
		else
			return "Poor Performance";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	
	
}
