package com.edubridge;

public class MultiDimEx {

	public static void main(String args[]) {
		
		int arrName [][] = new int[3][];
		int arrName1 [][] = new int[3][5];  //15 * 4 = 60 bytes
		
		 arrName[0] = new int[4];  //16bytes[0th row]
		 arrName[1] = new int[2];   //8bytes
		 arrName[2] = new int[1]; //4bytes
		 
		 System.out.println(arrName);
		 System.out.println(arrName1);
		 
		 
	int arr3[][] = {{1,2,3,4},
			{10,20,30}};
	
	
	int copyArr[][] = arr3.clone();
	//copyArr[0][0] = arr3[0][0], copyArr[0][1] = arr3[0][1]
		/*1.defining values to an array{}
		 * 2.defining a function 
		 * 3. class cn{attr, functions, constr}
		 * sets, {}
		 * block of code  --> desicion stmts,
		 */
		
	
	// 1 == 1 
	
	
	System.out.println(copyArr[0][0] == arr3[0][0]);
	System.out.println(copyArr[1] == arr3[1]);
	// 0th row addrs of copied arr vs 0th row adrs of src arr 
	System.out.println(copyArr == arr3);
	//we are checking base adrs of both arr
	
	copyArr[0][0] = 10000;
	System.out.println(arr3[0][0]);
	
	}
}
