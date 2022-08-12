package com.loops;
import java.util.*;

public class oddAndEven {
	public static void main (String args[]) {

		Scanner scannerObj= new Scanner(System.in);
		System.out.print("Enter the number (1-127) :- ");
		byte userInput = scannerObj.nextByte();
		System.out.println("Entered value is :" + userInput);
		for (byte ctr = 1; ctr <= userInput; ctr++) {
			System.out.println(ctr);
		}

		System.out.println("========================");
		for (byte ctr = 1; ctr <= userInput; ctr++) {
			if(ctr % 2 == 0) {
				System.out.println("Even "+ctr);
			}
			else {
				System.out.println("Odd "+ctr);
			}
		}
		System.out.println("========================");
		System.out.println("Even numbers are:");
		for (byte ctr = 1; ctr <= userInput; ctr++) {
			if(ctr % 2 == 0) {
				System.out.println(ctr);
			}
		}

		System.out.println("Odd numbers are:");
		for (byte ctr = 1; ctr <= userInput; ctr++) {
			if(ctr % 2 != 0) {
				System.out.println(ctr);
			}
		}
	}
}