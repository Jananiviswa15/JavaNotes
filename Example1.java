package com.controlFlow;

public class Example1 {
	/*Control / conditional state
	 *good understand in DT(PDT , NPDT), operators
	 * 1.Decision state
	 * 			simple if 
	 * 			if else
	 * 			Ladder if
	 * 			nested if
	 *          switch case
	 * 2.Loop stmts
	 * 			do while loop
	 *          for loop
	 *          while loop
	 *          for each loop
	 * 3. Jump stmts
	 * 			break, continue
	 */
	
public static void main(String args[]) {
	//1.simple if 
	//when cond is TRUE things inside {} will work
	/*if(condi) {
		//how many ever lines it may be it will wrk
	}*/
	
	int num1 = -45454;
	byte num2 = 45;
	/*if(num1 > num2  || num1 == 0  || num1 > 0) {
		System.out.println("num1 is greater than num2");
		System.out.println("val of greater num is "+num1);
	}*/
	System.out.println("hi ...");
	
	/*2. if else --> if(cond) cond evaluated --> TRUE {
		when cond is true this blk ll execute
	}
	else {
		when cond is false this blk ll execute
	}*/
if(num1 > num2) {  //cond is false
	System.out.println("num1 is greater");
}
else {
	System.out.println("num2 is greater");
}

byte age = -45;
boolean isSalaryPerson = false;
if (age >= 18 && isSalaryPerson) {
	System.out.println("eligible for licesnce");
	System.out.println("eligilbe for personal loan");
}
else {
	System.out.println("you are not eligible");
}


long number = -454346666;

if(number < 0) {
	System.out.println("it is negative");
	
	String name = "janani";
	System.out.println(name);
	
	
}
else {
	//System.out.println(name);
	System.out.println("it is positive");
}
	





}
}
