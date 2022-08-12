package com.loops;
import java.util.*;
public class SumOfN {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int userNumber = obj.nextInt();
		int sum = 0;

		for(int ctr = 1; ctr <= userNumber; ctr++) {

			sum = sum + ctr;  //0+1 //1+2
			//sum+=ctr;

		}
		System.out.println(sum);
		System.out.println(userNumber*(userNumber+1)/2);
	}
}
