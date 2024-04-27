package com.lambda;
interface Printable{
	void print(String msg);
}

public class JLEExampleSingleParameter {

	public static void main(String[] args) {
	Printable printable=msg->System.out.println(msg);	
printable.print("print message to console");
	}

}
