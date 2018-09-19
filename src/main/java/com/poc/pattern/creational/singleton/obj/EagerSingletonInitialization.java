package com.poc.pattern.creational.singleton.obj;

public class EagerSingletonInitialization {

	public static EagerSingletonInitialization instance = new EagerSingletonInitialization();

	private EagerSingletonInitialization() {
		// TODO Auto-generated constructor stub
	}

	public static EagerSingletonInitialization getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("message has been printed");
	}

}
