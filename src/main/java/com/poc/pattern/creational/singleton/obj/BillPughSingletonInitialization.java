package com.poc.pattern.creational.singleton.obj;

public class BillPughSingletonInitialization {

	private BillPughSingletonInitialization() {

	}

	private static class staticInnerHelper {
		private static final BillPughSingletonInitialization instance = new BillPughSingletonInitialization();
	}

	public static BillPughSingletonInitialization getInstance() {
		return staticInnerHelper.instance;
	}

}
