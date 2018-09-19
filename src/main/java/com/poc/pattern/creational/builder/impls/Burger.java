package com.poc.pattern.creational.builder.impls;

import com.poc.pattern.creational.builder.interfaces.Item;
import com.poc.pattern.creational.builder.interfaces.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
