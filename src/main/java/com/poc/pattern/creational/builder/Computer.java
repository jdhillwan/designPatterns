package com.poc.pattern.creational.builder;

public class Computer {

	private final String  hdd, ram;

	private boolean isGraphicCardEnabled, isBluetoothEnabled;

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public static class ComputerBuilder {
		private String hdd, ram;

		private boolean isGraphicCardEnabled, isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
