package com.edubridge;

public class ExVariables {
public static void main(String args[]) {
	
	int age = 10;
	
	Learneres suhas = new Learneres();
	Learneres golu = new Learneres();
	Learneres golu1 = new Learneres();
	suhas.assesment1 = 0;
	suhas.assesment2 = 10;
	suhas.assesment3 = 100;
	
	golu.assesment1 = 10;
	golu.assesment2 = 20;
	
	System.out.println(suhas.assesment1);
	System.out.println(suhas.assesment2);
	System.out.println(suhas.assesment3);
	System.out.println(suhas.assesment4);
	
	System.out.println(golu.assesment1);
	System.out.println(golu.assesment2);
	System.out.println(golu.assesment3);
	System.out.println(golu.isSmart);
	System.out.println(suhas.companyName);
}
}
