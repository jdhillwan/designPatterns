package com.poc.pattern.creational.singleton.obj;

public class ThreadSafeSingletonInitialization {

	private static ThreadSafeSingletonInitialization instance;

	private ThreadSafeSingletonInitialization() {

	}

	public static synchronized ThreadSafeSingletonInitialization getInstance() {

		if (instance == null) {
			instance = new ThreadSafeSingletonInitialization();
		}
		return instance;
	}

	public static ThreadSafeSingletonInitialization getInstanceUsingDoubleLocking() {

		if (instance == null) {
			synchronized (ThreadSafeSingletonInitialization.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletonInitialization();
				}
			}
		}
		return instance;
	}

}
