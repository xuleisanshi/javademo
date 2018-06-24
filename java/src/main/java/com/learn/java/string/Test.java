package com.learn.java.string;
/*
 * learn string function
 */

public class Test {
	public static void main(String[] args) {

		String text = "abcdefghijklmnopqrstuvwxyz abc0123";
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
		System.out.println(string1.compareToIgnoreCase(string1));

		System.out.println(string1.concat(string2));

		CharSequence cs1 = "ab";
		CharSequence cs2 = "dsa";
		CharSequence cs3 = "ABC";
		System.out.println(string1.contains(cs1));
		System.out.println(string1.contains(cs2));
		System.out.println(string1.contains(cs3));

		System.out.println(string1.contentEquals(cs1));
		System.out.println(string1.contentEquals(cs2));
		System.out.println(string1.contentEquals("abc"));

		CharSequence cs4 = "abc";
		CharSequence cs5 = "ac";

		System.out.println(string1.contentEquals(cs4));
		System.out.println(string1.contentEquals(cs5));

		StringBuffer sb1 = new StringBuffer();
		sb1.append("abc");
		StringBuffer sb2 = new StringBuffer();
		sb2.append("ac");

		System.out.println(string1.contentEquals(sb1));
		System.out.println(string1.contentEquals(sb2));

		char[] data = { 'a', 'b', 'c', 'd' };
		System.out.println(String.copyValueOf(data));
		System.out.println(String.copyValueOf(data, 0, 2));

		System.out.println(string1.endsWith("d"));
		System.out.println(string1.endsWith("bc"));

		System.out.println(string1.equals("abc"));

		System.out.println(string1.getBytes());
		
		System.out.println(string1.hashCode());
		
		System.out.println(text.indexOf(1));
		
		System.out.println(text.intern());
		System.out.println(text.isEmpty());
		System.out.println(text.lastIndexOf("a"));
		System.out.println(text.replace("a", "y"));
		
		
		System.out.println(text.toCharArray()[0]);
		
		System.out.println("BFW".toLowerCase());
		System.out.println(String.valueOf("a"));
		
		System.out.println(text.substring(0, 4));
		
		String test1 = "abcdabcd";
		System.out.println("====================replace==================");
		System.out.println(test1.replace("a", "1"));
		//正则表达式
		//TODO
		
		
		int a = 0;
		Object ob = new Object(); 
		
		System.out.println(String.valueOf(ob));
		System.out.println(ob.toString());
		System.out.println(Integer.toString(a));
		
		
		Integer i = 10;
		System.out.println(Integer.valueOf(i));


	}

}
