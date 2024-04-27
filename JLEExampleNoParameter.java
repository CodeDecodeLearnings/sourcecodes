package com.lambda;
interface Sayable{
	public String say();
}
public class JLEExampleNoParameter {

	public static void main(String[] args) {
Sayable sayable=()->"Return something";
sayable.say();
	}

}
