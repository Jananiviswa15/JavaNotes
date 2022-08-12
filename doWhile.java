package com.loops;

import java.util.Scanner;

public class doWhile {
/*
 * dowhile --> exit checking, condition is comp
 * while , for loop --> ll work only when the cond is true
 * 
 */
	public static void main(String args[]) {
		Scanner scannerObj= new Scanner(System.in);
		System.out.print("Enter the number (1-127) :- ");
		byte userInput = scannerObj.nextByte();
		System.out.println("Entered value is :" + userInput);

	/*do{
		for the 1st time it ll never check the condition
		it execute this block 
		AFTER EXECUTION IT WILL CHK FOR COND
	}while(condition);
	*/
	int ctr = userInput;	
	do {
		//System.out.println("hi i am do while");
		//System.out.println(ctr);
	}while(ctr > 20);

	do {
		System.out.println("hi i am do while");
		System.out.println(ctr);
ctr++;		
	}while(ctr <= 5);
}
}