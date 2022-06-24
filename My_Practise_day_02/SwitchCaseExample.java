package com.My_Practise_day_02;
import java.util.*;//importing Scanner class by using *

public class SwitchCaseExample {//driver class
	static String college = "Great Learning"; //data variable
	static String working = "warehouse"; //data variable
	static String fond  = "poetry"; //data variable

	public static void main(String[] args) {//main method
		Scanner sc = new Scanner(System.in);//successfully created scanner class
		System.out.println("please enter the name of the student");//asking question to user
	    
		String studentName = sc.next();// we have enter our value here we created this by using the scanner class
		
		switch(studentName){//switch case implementation
		
		case "Mehdi"://if user enter Mehdi as a value then this will be implemented
			System.out.println("Student name is Mehdi and he is from"+ college);break;
			
		case "sumit"://if user enter sumit as a value then this will be implemented
			System.out.println("Student name is sumit and he is working in a "+ working);break;
			
		case "Rishita": //if user enter rishita as a value then this will be implemented
			System.out.println("Student name is rishita and she is fond in "+fond);break;
			
		case "Shalini Mittal"://if user enter shalini mittal as a value then this must be implemented
			System.out.println("She is our mentor in great learning");break;
		
		default ://this default case is used to display when an unassigned value is given as input
                System.out.println("Error!!!");	    
	    	
			
		}
		System.out.println("\n we have successfully completed our 7th program on day 02  "
				+ "here we implemented a switch case by taking the value from the user");

        sc.close();
	}

}
