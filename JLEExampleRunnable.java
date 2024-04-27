package com.lambda;

public class JLEExampleRunnable {

	public static void main(String[] args) {
		Runnable withLmbda=()->System.out.println("Runnable Example");
	Thread thread=new Thread(withLmbda);
	thread.start();
	}

}
