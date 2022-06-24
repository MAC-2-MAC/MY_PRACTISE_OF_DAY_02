package com.My_Practise_day_02;

public class ExampleOfTernaryOperator { //driver class
	
    static	int Redmi = 8000; //data variable with assigned value and static keyword
    static	int Samsung = 15000;//data variable
    static 	int Oneplus = 25000;//data variable
    static  String myfav = "ONEPLUS";//data variable

	public static void main(String[] args) {//main method
		/*here we are going to compare 3 mobile prices with the help of declared data variables
		   by using static keyword the reaso why we are using the static keyword is that we dont have
		   to declare the variable everytime when create another object*/
		
		System.out.println("which mobile are you going to buy sumit ? "
				+ "\n here are some mobile prices that i know hope it will be useful for sumit in buying a mobile"
				+ "\n"
				+ "1) Redmi mobile are coming under a reasonable price its starting price is RS: "+Redmi+""
						+ "\n 2) Samsung mobiles are better when you dont use a lot but want a branded mobile its starting price is RS: "+Samsung+""
								+ "\n 3) Oneplus mobiles are very good in performance and as well as in brand value its Starting price is: "+Oneplus+""
										+ "\n My suggetion for you is to buy "+myfav);
		
	//now we are going to use ternary operator here
     
		int HighestMobilePrice = (Redmi<Samsung )?(Samsung<Oneplus?Oneplus:Redmi):(Samsung);
		/*here we are first checking if condition with (Remdi<Samsung)?if this true then 
         it will check another condition it can used in else if statment
         (Redmi<Oneplus? if this is true then oneplus will be printed and if is false then Redmi will be printed
         if this condition is false then samsung will be printed		
		*/
		System.out.println("The highest mobile price in the above given mobiles is RS: "+HighestMobilePrice+" by Oneplus brand");
		
		System.out.println("\n we successfully completed 2nd program on day 02 example for ternary operation");
		
		
		

		
	}

}
