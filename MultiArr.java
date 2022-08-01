package com.edubridge;

public class MultiArr {

	public static void main(String args[]) {
		int intArr[][];
		//r, c
		intArr = new int[9][90];
		int intArr1[][] = new int[2][4];
		
		intArr[0][0] = 12;
		intArr[1][2] = -6767;
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[1][0]);
		System.out.println(intArr[1][2]);
		
		 int intArr2[][] = { {23,3434,4545},{3243,434}, 
				 {343,-34,3243,23,3434}};
		 
		 
		 //in multidimension r is comp 
		 //col it can be irregular --> jagged array(variable num of cols)
		 System.out.println(intArr2[0][3]);
		 
		 
		 int intArr3[][] = new int[2][];  //2 rows
		 intArr3[0]  = new int[6];  //in 1st row 6 cols
		 intArr[1] = new int[432]; // in 2nd row 432 cols
		 
		 
		 System.out.println(intArr3[0][0]);  //0
		 
		 
		 
	}
	
}
