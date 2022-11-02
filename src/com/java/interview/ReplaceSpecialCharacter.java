package com.java.interview;

public class ReplaceSpecialCharacter {

	
	private static void subMethod() {
		String s = "For#The@People(By^The&People%of€The)People";
		String replace = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(replace);
	}
	
	public static void subMethod1() {
		
		String s = "selenium123";
		String re = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(re);
	}
	public static void main(String[] args) {
		subMethod();
		subMethod1();
	}
	
	
	
}
