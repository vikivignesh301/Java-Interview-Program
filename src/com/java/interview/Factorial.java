package com.java.interview;

public class Factorial {
	private static void subMethod() {
		int a = 5;
		int sum = 1;
		for (int i = 1; i <=5; i++) {
			 sum = sum*i;
		}
		System.out.println("the factorial of 5 :"+sum);
	}

	public static void main(String[] args) {
		subMethod();
	}
}
