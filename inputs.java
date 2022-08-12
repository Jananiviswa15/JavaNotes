package com.loops;


//java.lang --> String. strbuilder, buffer, system
//import java.io.BufferedReader;
//import java.util.* 
import java.util.Scanner;
public class inputs {
	
	public static void main(String args[]) {
		
		/*accept user inputs
		 * 1. console screen 
		 * 2. BufferReader class
		 * 3.  Scanner class 
		 */
		
		//string number char decimal 
		//System.out.println("enter your age");
		//out --> outputstream --> flow of data/bytes
		byte age;
		//cn obj = new cn()
		Scanner scObj = new Scanner(System.in);
		//in --> inputstream
		char name = scObj.nextLine().charAt(0);
		System.out.println("entered name/ text" +name);
		age = scObj.nextByte();
		System.out.println("age : "+ age);
		
		int salary = scObj.nextInt();
		System.out.println("salary : "+ salary);
		
		float salary1 = scObj.nextFloat();
		double salary2 = scObj.nextDouble();
		
		//System.out.print(salary1 + salary2);
		
		
		//janani, j, 344, hi how are you
		//nextLong(), nextShort()
	}

}
