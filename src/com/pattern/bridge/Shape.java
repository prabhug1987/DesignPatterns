package com.pattern.bridge;

public abstract class Shape {

	Drawable drawable;

	public Shape(Drawable drawable) {
		// TODO Auto-generated constructor stub
		this.drawable = drawable;
	}

	abstract void draw();

}
