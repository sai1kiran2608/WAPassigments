//21-03-2025

package com.saikiran.WAPassigments;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group employees by department and by experience level.
class Employee {

	private String name;
	private String dept;
	private int exp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Employee() {

	}

	public Employee(String name, String dept, int exp) {
		this.name = name;
		this.dept = dept;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", exp=" + exp + "]";
	}
}

public class WAP_33 {

	public static String expLevel(int exp) {
		if (exp < 5)
			return "Junior";
		else if (exp < 10)
			return "Mid";
		else
			return "Senior";
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", "IT", 2));
		employees.add(new Employee("Bob", "IT", 6));
		employees.add(new Employee("Charlie", "HR", 1));
		employees.add(new Employee("David", "HR", 4));
		employees.add(new Employee("Eve", "Sales", 8));
		employees.add(new Employee("Frank", "Sales", 3));
		employees.add(new Employee("Grace", "IT", 10));

		Map<String, Map<String, List<Employee>>> empStream = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.groupingBy(n -> expLevel(n.getExp()))));
		System.out.println(empStream);

	}

}
