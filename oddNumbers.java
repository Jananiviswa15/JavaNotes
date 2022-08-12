package com.loops;
import java.util.*;
public class oddNumbers {
public static void main(String args[]) {
	Scanner scObj = new Scanner(System.in);
	byte userNumber = scObj.nextByte();
	byte counter =1;
	while(counter <= userNumber) 
	{   
		
		if(counter % 2 != 0)
			
		{
		System.out.println(counter);
		}
		counter++;
	}
	
	
	for(int ctr = 1 ; ctr <= userNumber; ctr += 2) {
		System.out.println(ctr);
	}

}
}
