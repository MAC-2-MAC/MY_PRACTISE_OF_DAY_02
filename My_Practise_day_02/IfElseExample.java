package com.My_Practise_day_02;
import java.util.Scanner;//importing Scanner class 

public class IfElseExample {//driver class
	public static void main(String[]args) {//main method
    int sumitSalary = 12000;//assiging value of sumitSalary
	Scanner sc = new Scanner(System.in);//successfully created new scanner object
	System.out.println("Can you guess summit's montly salary");//asking question to user
	int salary = sc.nextInt();//taking input from the user by using scanner class
	
	if (salary==sumitSalary) {//applying if condition
		System.out.println("Absolutely Perfect!!!");//if condition result
	}
	else if(salary != sumitSalary) {//applying else if condition
		System.out.println("your guess is wrong!!!");//else if result
	}
	else {//else condition
		System.out.println("Error!!!");// else result
	}
	
	System.out.println("\n"
			+ "we successfully completed our 5th program of day 02 of ifelse program example using scanner class");
	sc.close();
  }
}
