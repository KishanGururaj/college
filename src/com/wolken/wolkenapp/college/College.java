package com.wolken.wolkenapp.college;

import com.wolken.wolkenapp.DTO.StudentDTO;

public class College {
	public StudentDTO[] studentDTO;
	int index;
	public College(int size) {
		studentDTO=new StudentDTO[size];
	}
	public void addStudentDetails(StudentDTO studentDTO) {
		if (studentDTO!=null) {
			System.out.println("adding student details");
			this.studentDTO[index++]=studentDTO;
		}
		else {
			System.out.println("no student can't be added");
		}
	}
	public  void getDetails() {
		for(int i=0;i<this.studentDTO.length;i++) {
			System.out.println(studentDTO[i].getStudentName()+" "+studentDTO[i].getUsn()+" "
					+studentDTO[i].getStudentFees());
		}
	}
	public void updateFeebyUsn(String usn,int fee) {
		for(int i=0;i<studentDTO.length;i++) {
			if(studentDTO[i]!=null) {
				if(studentDTO[i].getUsn().equalsIgnoreCase(usn)) {
					this.studentDTO[i].setStudentFees(fee);
				}
			}
		}
	}
	public void deleteByUsn(String usn) {
		for(int i=0;i<studentDTO.length;i++) {
			if(studentDTO[i]!=null) {
				if(studentDTO[i].getUsn().equalsIgnoreCase(usn)) {
					this.studentDTO[i]=null;
				}
			}
		}
	}


}
