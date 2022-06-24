package com.My_Practise_day_02;

public class GivenNumberIsEvenOrOdd { //driver class

	public static void main(String[] args) { //main method
		
		int num = 105268; // number to be checked whether even or odd
		
		/* we can also check the an array is even or odd by using loops we will do that in future */
		
		String result = (num%2==0)?"even":"odd"; // using ternary operator with using the modulo
		
		System.out.println("The given array : "+num + " is "+ result); //desired output
		
		System.out.println("\n we successfully completed our 3rd program on day 02 whether the  number is even or odd by using the ternary operator");

	}

}
