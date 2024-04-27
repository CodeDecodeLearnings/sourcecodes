package com.lambda;

interface Drawable {
	public void draw();

}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width = 8;
		Drawable withLambda = () -> {
			System.out.println("Drawing " + width);
		};
		withLambda.draw();
	}

}
