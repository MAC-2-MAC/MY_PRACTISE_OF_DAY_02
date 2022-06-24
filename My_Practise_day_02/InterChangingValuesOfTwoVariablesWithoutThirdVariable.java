package com.My_Practise_day_02;
import java.util.Scanner;

public class InterChangingValuesOfTwoVariablesWithoutThirdVariable {
	int total1;
	int total2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your total marks in intermediate sumit");
		int total1 = sc.nextInt();
		
		System.out.println("i am entering my intermediate marks here");
		int total2 = sc.nextInt();
		
		System.out.println("\n These are the marks of the sumit in intermediate: "+total1);
		System.out.println("\n These are the marks of the my marks in intermediate: "+total2);
		
		//now i am going to inter-change marks of mine and sumit
		
		total1 = total1 + total2;
	    total2 = total1 - total2;
		total1 = total1 - total2;
		
		System.out.println("\n i inter changed mine and sumits marks here");
		
		System.out.println("\n now these are the marks of the sumit in intermediate: "+total1);
		System.out.println("\n now these are my marks in intermediate: "+total2);
		
		System.out.println("\n i am enjoying by playing the data haha in these type of coding ");
		

		System.out.println("\n we successfully completed our 6th program of day 02 of interchanging the values of two variables which were taken "
				+"from the users with the help of Scanner class and inter changing them with some logic ");
		sc.close();
	}

}
