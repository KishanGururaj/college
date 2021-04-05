package com.wolken.wolkenapp.DTO;

public class StudentDTO {
	private String studentName;
	private String usn;
	private int studentFees;
	public StudentDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public int getStudentFees() {
		return studentFees;
	}
	public void setStudentFees(int studentFees) {
		this.studentFees = studentFees;
	}
	
}
