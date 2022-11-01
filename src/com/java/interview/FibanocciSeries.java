package com.java.interview;

public class FibanocciSeries {

	private static void subMethod() {

		int a = 0;
		int b = 1;
		
		System.out.print(a + "," + b + ",");
		for (int i = 0; i < 10; i++) {

			int c = a + b;
			System.out.print(c + ",");
			a = b;
			b = c;

		}
	}

	public static void main(String[] args) {
		subMethod();
	}

}
