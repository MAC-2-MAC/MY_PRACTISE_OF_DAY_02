package com.My_Practise_day_02;

public class TernaryOperatorUse{//driver class
	
	static int sumit = 20; // here static keyword is used because i am using this variable value in whole class if didnt write static here then we have declare separately another variable for printing the values
	static int Mehdi =10; // if we declare another static int pencil = 40 in main method then the last static values will be removed from the memory new static value 40 will be saved 
	//int pen;// data variable
	//int pencil;//data variable 
	/* if we assign the values of this variables here it self then we have to create an object to 
	 * use them in the main method so we assign the values of the data varibles in the main method    */
	
	public static void main(String[] args) {//main method
		 
		
	int result =  (sumit>Mehdi)?(sumit):(Mehdi);/*Ternary operator this is used instead of if else case
	as this ternary operator will give the same result it also reduces the space of the code    */
	
	System.out.println("How much money does sumit have RS: "+sumit+"\n How much money does Mehdi have RS: "+Mehdi+
	"\n who is having the more money in this scenario\n"
	+ "obviously Sumit because he is having RS: "+result);// desired output
	
	System.out.println("\n we have completed our 1st program of day 02 on ternary operator how to use ternary operator");
		
		
	}
	
}