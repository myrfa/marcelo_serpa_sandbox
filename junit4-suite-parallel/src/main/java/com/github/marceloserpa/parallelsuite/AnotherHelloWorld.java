package com.github.marceloserpa.parallelsuite;

public class AnotherHelloWorld {
	
	public String sayA() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "A";
	}

	
	public String sayB() {
		return "B";
	}
	
}
