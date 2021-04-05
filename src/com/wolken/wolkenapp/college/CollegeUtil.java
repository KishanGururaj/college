package com.wolken.wolkenapp.college;

import java.util.Scanner;

import com.wolken.wolkenapp.DTO.StudentDTO;

public class CollegeUtil {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		College college=new College(size);
		for (int i=0;i<size;i++) {
		StudentDTO studentDTO=new StudentDTO();
		System.out.println("enter the student name");
		studentDTO.setStudentName(scanner.next());
		System.out.println("enter the student usn");
		studentDTO.setUsn(scanner.next());
		System.out.println("enter the student fees ");
		studentDTO.setStudentFees(scanner.nextInt());
		college.addStudentDetails(studentDTO);
		}
		scanner.close();
		college.getDetails();
		college.updateFeebyUsn("1rn17ec067", 10000);
		college.deleteByUsn("1rn17ec066");
		
		
		
	}

}
