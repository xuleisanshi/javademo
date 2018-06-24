package com.learn.java.string;
/*
 * learn string function
 */

public class Test {
	public static void main(String[] args) {

		String text = "abcdefghijklmnopqrstuvwxyz abc";
		// string length function
		int len = text.length();
		System.out.println("text length is" + len);

		// char at function
		char charat;
		charat = text.charAt(1);
		System.out.println("chat at index 1 is : b ===" + charat);

		int codepointat;
		codepointat = text.codePointAt(1);
		System.out.println("code point at index 1 is : ???===" + codepointat);

		int codepointbefore;
		codepointbefore = text.codePointBefore(2);
		System.out.println("code point before index 2 is : ???===" + codepointbefore);
		

		int codepointcount;
		codepointcount = text.codePointCount(1, 28);
		System.out.println("code point count index 1 - 6 is : ???===" + codepointcount);
		
		String string1 = "abc";
		String string2 = "ABC";
		System.out.println(string1.compareTo(string2));
		
	}

}
