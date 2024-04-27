package com.lambda;

interface IVvarage {
	double avg(int[] array);
}

public class JLEExampleMultipleStatements {

	public static void main(String[] args) {
		IVvarage withLambda = (withlambdaArray) -> {
			double sum = 0;
			int arraySize = withlambdaArray.length;
			System.out.println("ArraySize : " + arraySize);
			for (int i = 0; i < withlambdaArray.length; i++) {
				sum = sum + withlambdaArray[i];
			}
			System.out.println("sum : " + sum);
			return (sum / arraySize);
		};
		int[] withLambdaArray = { 1, 4, 6, 8, 9 };
		System.out.println(withLambda.avg(withLambdaArray));
	}

}
