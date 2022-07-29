package com.revature;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] ints = new int[4];
		
		ints[0] = 1;
		ints[1] = 2;
		ints[2] = 3;
		ints[3] = 4;
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		
		String[] colors = {"red", "blue", "green"};
		
		System.out.println(colors.length);
		System.out.println(Arrays.toString(colors));
		
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		for (String s:colors) {
			System.out.println(s);
		}

		System.out.println("============Strings============");
		
		String red = "red";
		String blue =  new String("blue");
		char[] g = {'g', 'r','e', 'e', 'n'};
		String green = new String((g));
		
		System.out.println("red");
		System.out.println("blue");
		System.out.println("green");
		
		boolean test = red == colors[0];
		System.out.println("red == red: " + test);
		
		test = blue == colors[2];
		System.out.println("blue == blue: " + test);
		
		test = green == colors[1];
		System.out.println("green == green: " + test);
		
		test = blue.equals(colors[2]);
		System.out.println("blue.equals(blue): " + test);
		
		test = green.equals(colors[1]);
		System.out.println("green.equals(green): " + test);
		
	

	System.out.println("=============StringBuilder/Buffer Examples=================");
	
	//reverse string without builder/buffer
	String s1 = "Hello snake!";
	String s2 = "";
	
	for(int i = (s1.length()-1); i >= 0; i--){
		s2 = s2 + s1.charAt(i);
		System.out.println(s2);
	}
	
	//reverse string iteration with builder/buffer
		StringBuilder sb = new StringBuilder(s1);
		sb.reverse();
		String s3 = new String(sb);
		System.out.println(s3);
		
		//adding characters using builder/buffer
		
		sb.append(" ");
		sb.append(s1);
		System.out.println(sb);
		
	//reverse string single line
		String s4 = "rat";
		StringBuilder sb2 = new StringBuilder(s4);
		System.out.print(sb2);
		System.out.print(" " + sb2.reverse());
		
		
		
		
	}
}