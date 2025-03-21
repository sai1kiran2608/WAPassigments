//21-03-2025

package com.saikiran.WAPassigments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to count the employees grouped by department and experience level
class EmployeeCount {

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

	public EmployeeCount() {

	}

	public EmployeeCount(String name, String dept, int exp) {
		this.name = name;
		this.dept = dept;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", exp=" + exp + "]";
	}
}

public class WAP_35 {

	public static String expLevel(int exp) {
		if (exp < 5)
			return "Junior";
		else if (exp < 10)
			return "Mid";
		else
			return "Senior";
	}

	public static void main(String[] args) {

		List<EmployeeCount> employees = new ArrayList<>();
		employees.add(new EmployeeCount("Alice", "IT", 2));
		employees.add(new EmployeeCount("Bob", "IT", 6));
		employees.add(new EmployeeCount("Charlie", "HR", 1));
		employees.add(new EmployeeCount("David", "HR", 4));
		employees.add(new EmployeeCount("Eve", "Sales", 8));
		employees.add(new EmployeeCount("Frank", "Sales", 3));
		employees.add(new EmployeeCount("Grace", "IT", 10));

		Map<String, Map<String, Long>> empStreamCount = employees.stream()
				.collect(Collectors.groupingBy(n -> n.getDept(), Collectors.groupingBy(s -> expLevel(s.getExp()), Collectors.counting())));
		System.out.println(empStreamCount);

	}

}

