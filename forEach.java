package com.loops;

public class forEach {
public static void main(String args[]) {
	
	int arr[] = {45,6767,90,-324,890};
	String arr1[] = {"janani", "java", "aniket", "golu"};
	
	for (int ctr = 0 ; ctr <= arr.length - 1; ctr++) {
		System.out.println(arr[ctr]);
	}
	System.out.println("-------------------");
	for(int dummy : arr) {
		System.out.println(dummy);
	}	
	int ctr = 0;
	while(ctr  <= arr1.length - 1) {
		System.out.println(arr1[ctr]);
		ctr++;
	}
	for(String strVar : arr1) {
		//strVar =arr1[1] = "janani"
		System.out.println(strVar);
	}
	
	//for each loop ---> use when you jus want to access all the elem of an arr
	
	/*for(datatype of the arr : name of the arr) {
		
	}*/
	
	
	
	for(int dummy : arr) {
		System.out.println(dummy);
	}
	
}
}
