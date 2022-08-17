package com.loops;

import java.util.Scanner;

public class NestedLoops {
public static void main(String args[]) {
	//nested loop applicable for FOR, while, do while
	Scanner obj = new Scanner(System.in);
	short rows = obj.nextShort();
	short cols = obj.nextShort();
	short arr1[][] = new short[rows][cols];
	short arr[][] = new short[3][3];
/*	arr[0] = new short[2];
	arr[1] = new short[1];
	arr[2] = new short[3];*/
	arr[0][0] = 12;
	arr[1][1] = 34;
	arr[2][1] = 56;
	//arr.length
	for(int ctr = 0; /*ctr <= rows*/ctr < arr1.length; ctr++) {
		//rows ctr = r numbers //0 1 2
		for(int ctr1 = 0; /*ctr <= rows*/ctr1 < arr1[ctr].length; ctr1++) {
			//no of col loop
			//arr[ctr] arr[0]  ctr1 0 1 2 3
			System.out.print(arr1[ctr][ctr1] + " " );
			
		}
		System.out.println();
	}
	
}
}
