package com.My_Practise_day_02;

public class SwitchCaseBasic {//driver class

	public static void main(String[] args) {//main method
		
		int num =0; //assigned value
		
		switch(num) { //switch case implementation
		
		case 0: //here we have to write case and after that we have to give the value to check
			System.out.println("0 is a natural number");break;//desired output for the given value
			
		case 1:
			System.out.println("1 is neither prime nor composite");break;
			
		case 2:
			System.out.println("2 is an even number");break;
		
		case 3:
			System.out.println("3 is an odd number");break;
		}
		
		

	}

}
