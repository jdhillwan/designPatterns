package com.poc.pattern.demo;

import com.poc.pattern.creational.factories.ShapeFactory;
import com.poc.pattern.creational.factory.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape rectShape = shapeFactory.getShape("RECTANGLE");

		rectShape.draw();

		Shape circShape = shapeFactory.getShape("CIRCLE");

		circShape.draw();

		Shape squShape = shapeFactory.getShape("SQUARE");

		squShape.draw();

	}

}
