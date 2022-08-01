package com.edubridge;

public class Array2 {

	public static void main(String args[]) {
		int arrayName[] = new int[5];
		int number = 2323;
		arrayName[0] =  number;
		arrayName[1] =  number+1;
		arrayName[2] =  number+2;
		arrayName[3] =  number+3;
		
		int copArr[] = 	new int[arrayName.length]	;
		copArr[0] = arrayName[0];
		copArr[1] = arrayName[1];
		
		
		int copArr1[] = arrayName.clone();
		System.out.println(copArr1[0]);
		System.out.println(copArr1[1]);
		System.out.println(copArr1[2]);
		System.out.println(copArr1[3]);
		System.out.println(copArr1[4]);
		
		
		//base adrs(even though you have copied the val's addrs are dif)
		System.out.println(copArr1 == arrayName);
	}
}
