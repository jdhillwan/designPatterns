package com.poc.pattern.creational.singleton.obj;

public class StaticBlockInitialization {

	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public StaticBlockInitialization getInstance() {
		return instance;
	}

}
