package com.poc.pattern.demo;

import com.poc.pattern.creational.builder.Computer;

public class ComputerBuilderDemo {

	public static void main(String[] args) {
		
		Computer computer = new Computer.ComputerBuilder("10 GB","2 GB").setBluetoothEnabled(true).setGraphicCardEnabled(false).build();
		
		
	}
	
}
