package com.loops;
import java.util.*;
public class frequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput= new Scanner(System.in);
		System.out.print("Enter how many values you want : " );
		byte systemInput = userInput.nextByte();
		System.out.print("Enter the values : ");
		int arr[] = new int[systemInput];
		//int count = 1;
		for (int ctr = 0; ctr<systemInput; ctr++) {
			arr[ctr]=userInput.nextInt();
		}
		System.out.println("Entered values are:");
		for(int val : arr){ 
			System.out.println(val);
			}
		for(int ctr1=0; ctr1<systemInput;ctr1++) {
			int count = 1;
			for(int ctr2=ctr1+1; ctr2<systemInput;ctr2++) {
				if(arr[ctr1]==arr[ctr2]) {
					count++;
				}
			}
			System.out.println(arr[ctr1]+"appeared for "+count );
			//count = 1;
		}
	}


}
