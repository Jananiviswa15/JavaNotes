package com.controlFlow;

public class Example2 {
public static void main(String args[]) {
	
	String states[] = {"Pune", "karnataka", "bihar", "maharastra", "Punjab"};
	String learner1 = states[0];
	String learner2 = states[1];
	String learner3 = states[0];
	String learner4 = states[0];

	
	/*if(cond --> T){
	 * }
	 * else 
	 * 		if(cond --> T){
	 * }
	 * else
	 * 		 if(){
	 * }
	 * 
	 * if(){
	 * }
	 * else if(){
	 * }
	 * else if(){
	 * }
	 * else if(){
	 * }
	 * else{
	 * }
	 * 
	 * 
	 * 
	 */
	
	if(learner1 == new String("Pune")) {
		System.out.println("I am from pune");
	}
	else if(learner2.equals("karnataka2443")) {
		System.out.println("i am from "+learner2);
	}
	else if(learner2.equals("Karnataka")) {
		System.out.println("i am from "+learner2);
	}
	else if(learner2.equals("karna   taka")) {
		System.out.println("i am from "+learner2);
	}
	else if(learner2.equals("karnataka")) {
		System.out.println("i am from "+learner2);
	}
	else {
		System.out.println();
	}
	System.out.println("i am from main");
}
}
