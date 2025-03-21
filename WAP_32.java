//21-03-2025

package com.saikiran.WAPassigments;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of students by Grade
class StudentAcad {

	private String name;
	private String rollNum;
	private char grade;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getRollNum() { return rollNum; }
	public void setRollNum(String rollNum) { this.rollNum = rollNum; }

	public char getGrade() { return grade; }
	public void setGrade(char grade) { this.grade = grade; }
	
	public StudentAcad() {

	}

	public StudentAcad(String name, String rollNum, char grade) {
		this.name = name;
		this.rollNum = rollNum;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return " [Name : " + name + "," + " Roll Number : " + rollNum + "," + " Grade : " + grade + "]";
	}
}

public class WAP_32 {

	public static void main(String[] args) {
		
		List<StudentAcad> students = new ArrayList<>();
		students.add(new StudentAcad("Sai kiran", "1003-21-103-003", 'O'));
		students.add(new StudentAcad("Vinod", "1003-21-103-010", 'F'));
		students.add(new StudentAcad("Srikanth", "1003-21-103-008", 'A'));
		students.add(new StudentAcad("Pavan", "1003-21-103-021", 'A'));
		
		Map<Character, List<StudentAcad>> studByGrade = students.stream()
				.collect(Collectors.groupingBy(name -> name.getGrade()));
		System.out.println(studByGrade);

	}

}
