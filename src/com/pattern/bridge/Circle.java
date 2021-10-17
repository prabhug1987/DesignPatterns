package com.pattern.bridge;

public class Circle extends Shape {

	int x, y, radius;

	public Circle(int x, int y, int radius, Drawable drawable) {
		super(drawable);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		drawable.drawCircle(radius, x, y);

	}
}
