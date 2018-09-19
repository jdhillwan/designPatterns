package com.poc.pattern.demo;

import com.poc.pattern.creational.prototype.Employees;

public class PrototypePatternDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();

		Employees emp1 = (Employees) emps.clone();
		emp1.getEmployees().add("Sukhi");
		Employees emp2 = (Employees) emps.clone();
		emp2.getEmployees().remove("Shiv");

		System.out.println("emps List: " + emps.getEmployees());
		System.out.println("emp1 List: " + emp1.getEmployees());
		System.out.println("emp2 List: " + emp2.getEmployees());
	}
}
