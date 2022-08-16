package com.loops;

import java.util.Scanner;

public class continueEx {
	public static void main(String args[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter how many names you want enter..");
	byte count = obj.nextByte();
	String[] arr = new String[count];
	
	for(byte ctr = 0 ; ctr <= count-1; ctr++) {
		arr[ctr] = "janani";
	}
	
	System.out.println("===========");
	for(String strVar : arr) {
		System.out.println(strVar);
	}
	
	for(byte ctr = 0 ; ctr <= count-1; ctr++) {
		if(arr[ctr].equals("janani") && ctr ==2) {
			System.out.println(arr[ctr]);
			continue;
		}
		System.out.println(arr[ctr] + ctr);
	}
}
}
