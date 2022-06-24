package com.My_Practise_day_02;

public class IfEsleCondition {//driver class

	public static void main(String[] args) {//main method
    
		String str = "sumit";// if we enter the string value as "Mehdi" then else if statement will be printed
       
		
		if(str == "sumit") {//if condition
			System.out.println("hii sumit this is the starting point for if else loop");
			
		}
		else if(str == "Mehdi") {//else if condition
			System.out.println("i am your practising partner");
		}
		else {//else condition
			System.out.println("error!!!");
		}
		
		System.out.println("we successfully completed our 4th program on day 02 of if else condition program");
	}
}