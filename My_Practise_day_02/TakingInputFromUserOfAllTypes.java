package com.My_Practise_day_02;
import java.util.Scanner;

public class TakingInputFromUserOfAllTypes {//driver class
	
	int weeks;//data variable
	String from;//data variable
	float marks;//data variable
	double attendance;//data variable
	boolean status;//data variable

	public static void main(String[] args) {//main method
		Scanner sc = new Scanner(System.in);//scanner class imported
		
		System.out.println("\n please enter from where you enrolled for full stack development");
		String from = sc.next();//asking input
		
		System.out.println("\n please enter from how many weeks classes are conducted?");
		int weeks = sc.nextInt();//asking input
		
		System.out.println("\n how much attendance have got till now in whole training period");
		double attendance = sc.nextDouble();//asking input
		
		System.out.println("\n how many did you gain in last assessment test ?");
		float marks = sc.nextFloat();//asking input
		
		System.out.println("\n the above provided information about is correct ?");
		boolean status = sc.nextBoolean();//asking input
		
		
		System.out.println("\n My name is mehdi \n I have enrolled for full stack development course in "+from+"\n"
				+" I have attended "+weeks+"weeks of classes\n"
						+ "My attendance percentage is "+attendance+" \n My marks in the last assesment test are "+marks+""
								+ "\n The above given details about are "+status);
		
		sc.close();
		
		System.out.println("we successfully completed our 10th program of day 02 on switch on taking inputs from users");
	
		}
		
		

	}


