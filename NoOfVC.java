package com.loops;
import java.util.*;
public class NoOfVC {
	public static void main(String args[]) {
		Scanner scObj =  new Scanner(System.in);
		System.out.println("Enter a sentence/word/paragraph to check count of V's & C's");
		String userInput = scObj.nextLine();  //internally it implem char arr
		//char arr[] = new char[userInput.length()];
		char arr[] = userInput.toCharArray(); //{'h','i'};
		
		for(int ctr = 0; ctr<=userInput.length()-1;ctr++) {
			arr[ctr] = userInput.charAt(ctr);
		}
		byte arr1[] = {12,45};
		System.out.println("==================");
		System.out.println(arr1);
		System.out.println("hi tell me what this ll print:"+ arr1);
		System.out.println("==================");
		System.out.println("the entered sentence/word/paragraph : " +userInput);
		//String arr[] = new String[5];
		byte vowel =0, constants=0;
//apple
		for(int ctr=0;ctr<=userInput.length()-1;ctr++) {
			if(arr[ctr]== 'a'||userInput.charAt(ctr)== 'A'||
					userInput.charAt(ctr)== 'e'||userInput.charAt(ctr)== 'E'||
					userInput.charAt(ctr)== 'I'||userInput.charAt(ctr)== 'i'||
					userInput.charAt(ctr)== 'o'||userInput.charAt(ctr)== 'O'||
					userInput.charAt(ctr)== 'u'||userInput.charAt(ctr)== 'U'
					) {
				vowel++;  //1  
				//byte <--> char
				System.out.println(userInput.charAt(ctr)+ " "+vowel);  //'a'+1 //97+1  //a1

			}
			else {
				constants++;
			}
		
		}
		System.out.println("No of vowel : " +vowel);
		System.out.println("No of constants: " + constants);
		System.out.println(userInput.length());
	}
}

