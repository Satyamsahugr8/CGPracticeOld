package com.javaApril;

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {

		System.out.println("Rectangle[___]");

	}
}

class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Square[_]");

	}

}

public class FactoryDemo {

	public Shape getShape(String shapeType) {

		if (shapeType == null) {

			return null;

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {

			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {

			return new Square();

		} else
			return null;
	}

	public static void main(String[] args) {

		FactoryDemo factory = new FactoryDemo();

		Shape shapeRectangle = factory.getShape("rectangle");
		Shape shapeSquare = factory.getShape("square");
		Shape shapeNull = factory.getShape("s");
		
		try {
		shapeNull.draw();
		shapeRectangle.draw();
		shapeSquare.draw();
		} catch (Exception e) {
//			System.out.println(e);
		}
		

	}

}
