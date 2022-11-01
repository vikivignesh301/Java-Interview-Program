package com.java.interview;

import java.util.Iterator;

public class PrimeNumber {

	private static void singleNumber() {
		int a = 7;
		int count = 0;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {

				count++;
			}

		}
		if (count == 0) {
			System.out.println("It is prime Number :" + a);
		} else {
			System.out.println("It is Not a Prome Number :" + a);
		}
	}

	private static void for1To100Number() {

		for (int n = 2; n <= 100; n++) {
			boolean flag = true;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println(n + " is a Prime Number");
			}
		}
	}

	public static void main(String[] args) {

		for1To100Number();

	}

}
