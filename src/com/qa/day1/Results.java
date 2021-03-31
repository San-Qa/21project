package com.qa.day1;

public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		physics = 120;
		chemistry = 100;
		biology = 85;
		
		///
		displayList();
		method2();
				
				
		 
	 
	}
	
	    static int physics;
		static int chemistry;
		static int biology;
		
		static int sum;
		static int percent;
		
		
	public static void displayList() {
		sum = physics + chemistry + biology;
		
       String display = "Physics :" + physics +	"Chemistry: " + chemistry + "Biology :" + 
		biology + "Total :" + sum;
       
       System.out.println(display);
	}
	
	public static void method2() {
		 
		sum = physics + chemistry + biology;
		
		percent = (sum * 100) /450;
		
		System.out.println("Percentage :" + percent);
		
	}
}



