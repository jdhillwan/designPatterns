package com.poc.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		// TODO Auto-generated constructor stub
		empList = new ArrayList<>();
	}

	public void loadData() {
		empList.add("Jatin");
		empList.add("Rohit");
		empList.add("Shiv");
		empList.add("Vivek");
	}

	public List<String> getEmployees() {
		return empList;
	}

	public Employees(List<String> employees) {
		this.empList = employees;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> temp = new ArrayList<>();
		for (String s : this.getEmployees()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
