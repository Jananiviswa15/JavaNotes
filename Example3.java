package com.controlFlow;

public class Example3 {
public static void main(String[] args) {
	/*nested if
	
	if() {
		
		if() {
			
		}
		else {
			
		}
	}
	else if() {
		
	}
	else if() {
		
	}
	else {
		if() {
			
		}
		else {
			
		}
	}
	*/
	String place = "supermarket";
	String typeOfShopping = "fruits";
	if(place == "supermarket3545") {
		if(typeOfShopping == "veggies") {
			System.out.println("i am a vegetable");
		}
        else {
			System.out.println("i am from supermarket");
		}
	}
	else if(place == "mall") {
		if(typeOfShopping == "windowSHopping") {
			System.out.println("no money just staring");
		}
	}
	else {
		System.out.println("default value");
	}
}
}
