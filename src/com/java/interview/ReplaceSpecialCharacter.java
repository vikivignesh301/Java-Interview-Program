package com.java.interview;

public class ReplaceSpecialCharacter {

	
	private static void subMethod() {
		String s = "For#The@People(By^The&People%of€The)People";
		String replace = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(replace);
	}
	public static void main(String[] args) {
		subMethod();
	}
	
	
	
}
