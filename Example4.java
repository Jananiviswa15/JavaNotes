package com.controlFlow;

public class Example4 {
public static void main(String args[]) {
//	switch case default break  --> switch statements 
	
	//exectue only one from mult condi
	/*switch(expression / value) {
	case val1:
	case val2:
	case val3:
	case val4:
	case val5:
	case val6:
		
	}
	*/
	

	
	switch("FRidge") {
	
	case "lighter":
		System.out.println("i am a lighter");
	case "Tv":
	case "Television":
	case "tv":
	case "TV":
		System.out.println("i am tv");
		System.out.println("i am tv");
		
		System.out.println("i am tv");
		System.out.println("i am tv");
		System.out.println("i am tv");
		break;
		
	case "FRidge":
		break;
		//System.out.println("i am fridge");
		//break;
	case "lights":
		System.out.println("i am lights");
		
	case "laptop":
	case "lap":
		System.out.println("i am laptop");
		
	}
	System.out.println("i am in main");
}
}
