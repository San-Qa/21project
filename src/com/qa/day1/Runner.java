package com.qa.day1;

public class Runner {
	
	
	
	public static void hello(String san){
	//	String hell = "BOB";
		//int number = 25;
	 System.out.println("your name" + san);
	 
	 
	}
	
	public static String h4() {
		System.out.println("hi");
		return "Hello";
	}

	public static int add (int num1, int num2) {
		int result = num1 + num2; 
		return result;
	}
	public static double mult (double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	public static int sub (int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static double div (double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	
	public static int method1 (int phy, int che, int bio) {
		int total = phy + che + bio;
		return total;
	}
	
	public static double method2(double phy, double che, double bio) {
		 double total = phy + che + bio;
		 double percent = (total * 100) / 450; 
		 return percent;
	}
	
}
