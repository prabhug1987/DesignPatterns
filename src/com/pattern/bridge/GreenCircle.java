package com.pattern.bridge;

public class GreenCircle implements Drawable {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle [ color: green, radius :  " + radius + "x : " + x + ", y:" + y);
	}

}
