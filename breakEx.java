package com.loops;

import java.util.Scanner;

public class breakEx {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		//break --> case, default(optional) --> it will come out of the switch
		System.out.println("how many numbers you would like to enter?");
		int noOfvalues = obj.nextInt();
		int arr[] = new int[noOfvalues];
		System.out.println("Enter "+noOfvalues+ " numbers to the array...");
		for(int ctr = 0; ctr <= noOfvalues-1 ; ctr++) {
			arr[ctr] = obj.nextInt();
		}
		System.out.println("The entered elements are....");
		/*for(int ctr = 0; ctr <= noOfvalues-1 ; ctr++) {
			System.out.println(	arr[ctr]);
		}*/
		for(int value : arr) {
			System.out.println(value);
		}
		
		//arr[] = {12,13,78,101,98,76}
		for(int ctr = 0; ctr <= arr.length ; ctr++) {
			if(arr[ctr] > 100 ) {
				System.out.println("i am inside for loop");
				System.out.println("i am inside if cond..");
				
				
				
				
				break;
				//used to break the current loop
				
				
			}
			System.out.println(	arr[ctr]);
		}
		System.out.println("i encountered break stmt...");
	}
}
