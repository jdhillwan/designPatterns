package com.poc.pattern.creational.factories;

import com.poc.pattern.creational.factory.impls.Blue;
import com.poc.pattern.creational.factory.impls.Green;
import com.poc.pattern.creational.factory.impls.Red;
import com.poc.pattern.creational.factory.interfaces.Color;
import com.poc.pattern.creational.factory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {

		if (color == null) {
			return null;
		} else if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

}
