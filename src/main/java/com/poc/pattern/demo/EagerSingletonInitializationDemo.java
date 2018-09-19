package com.poc.pattern.demo;

import com.poc.pattern.creational.singleton.obj.EagerSingletonInitialization;

public class EagerSingletonInitializationDemo {

	public static void main(String[] args) {
		EagerSingletonInitialization obj = EagerSingletonInitialization.getInstance();
		obj.showMessage();
	}

}
