package com.lambda;
interface Addable{
	int add(int a,int b);
}
public class JLEmultipleparameters {

	public static void main(String[] args) {
		Addable addable=(a,b)->(a+b);
		System.out.println(addable.add(10, 20));
		// Multiple parameters with data type in lambda expression  
        Addable withLambdaD = (int a,int b) -> (a+b);  
        System.out.println(withLambdaD.add(100,200));  
	}

}
