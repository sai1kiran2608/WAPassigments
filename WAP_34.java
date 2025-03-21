//21-03-2025

package com.saikiran.WAPassigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to count the students grouped by grade.
class StudentAcads {

	private String name;
	private String rollNum;
	private char grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public StudentAcads() {

	}

	public StudentAcads(String name, String rollNum, char grade) {
		this.name = name;
		this.rollNum = rollNum;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return " [Name : " + name + "," + " Roll Number : " + rollNum + "," + " Grade : " + grade + "]";
	}
}

public class WAP_34 {

	public static void main(String[] args) {

		List<StudentAcads> students = new ArrayList<>();
		students.add(new StudentAcads("Sai kiran", "1003-21-103-003", 'O'));
		students.add(new StudentAcads("Vinod", "1003-21-103-010", 'F'));
		students.add(new StudentAcads("Srikanth", "1003-21-103-008", 'A'));
		students.add(new StudentAcads("Pavan", "1003-21-103-021", 'A'));

		Map<Character, Long> studByGradeCount = students.stream()
				.collect(Collectors.groupingBy(n -> n.getGrade(), Collectors.counting()));
		System.out.println(studByGradeCount);

	}
}
