package com.loops;
import java.util.*;
public class Factorial {

	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to check the factorial:");
	int number = scan.nextInt();
	int product = 1;
	int ctr = number;
	while(ctr > 1) { //5 4 3 2 
		product *= ctr;   //120
		ctr-=1;  //1
	}
	System.out.println("The factorial of "+number+"! is:"+ product);
	
	for(int ctr2 = 2; ctr2 <= number; ctr2++) {
		product *= ctr2;
	}
	}
}
