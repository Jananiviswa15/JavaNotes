package com.loops;

public class Loop1 {
	public static void main(String args[]) {
		short ctr = 0;
		//FOR and while loop entry checking loop
//for loop
		/*starting pt 
		condition 
		*/
		//cycles = 1000;
		/*System.out.println("i will speak in class, i will checj with my internet");
		
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		System.out.println("i will speak in class, i will checj with my internet");
		*/
		/*for(initialization;cond;alter) {
			
			
			
			
		}*/
		
		//initial , alter --> optional in loop 
		//cond is COMPULSORY  
		//a loop w/o cond --> infinite loop 
		
		/*1. initial  will happen only once, multiple var initial is allow
		 * 2. conditio check --> if condi is T then {executes}  
		 * 3. alter multiple var alter is allow
		 * 
		 */
		
		String names[] = {"janani", "preethi", "ujjwal", "golu"};
		/*System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[02]);
		System.out.println(names[3]);
		*/
		for(byte counter = 0;counter<= names.length-1 /*4*/; counter+=1  ) {
			System.out.println(names[counter]);  //names[4]
		}
		for(int checker = 1, ctr1 = 8; checker <=10; checker *= 5) {
			/*int num3 = 9089;
			int num4 = 989;
			System.out.println(num3> num4)*/
			System.out.println("i will speak in class, i will checj with my internet");			
		}
		
		
		for(;; ctr +=10) {
			System.out.println(ctr);
		}
	}
}

