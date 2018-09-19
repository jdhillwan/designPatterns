package com.poc.pattern.creational.singleton.obj;

public class LazySingletonInitialization {

	private static LazySingletonInitialization instance;

	private LazySingletonInitialization() {

	}

	public LazySingletonInitialization getInstance() {
		if (instance == null) {
			instance = new LazySingletonInitialization();
		}

		return instance;
	}

}
