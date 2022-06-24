package com.My_Practise_day_02;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		int year = 2022;
		
		if(year%400==0) {
			System.out.println("The given year: "+year+" is a leap year");	
		}
		else if(year%100==0) {
			System.out.println("The given year: "+year+" is not a leap year");
		}
		else if(year%4==0) {
			System.out.println("The given year: "+year+"is a leap year");
		}
		else{
			System.out.println("The given year: "+year+" is not a leap year");
		}
		
		System.out.println("we successfully completed our 8th program on day 02 finding whether the "
				+ "the given year is leap year or not with the help of % operator");
		

	}

}

