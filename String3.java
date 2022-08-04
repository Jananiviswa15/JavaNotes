package com.edubridge;

public class String3 {
static public void main(String args[]) {
	String name = "golu";
	String name1 = "golu";
	String nameObj = new String(name1);
	System.out.println(name == name1);
	System.out.println(name == nameObj);
	
	//value checking
	System.out.println(name.equals(nameObj));
	System.out.println(name.equals(name1));
	
	String name3 = "Gopal";
	System.out.println(name.equalsIgnoreCase(name3));
	
	String name4 = "Golu";  
	//compareTo --> 0, -ve number, +number
	//Gopal vs Golu
	System.out.println(name3.compareTo(name4)); //lexicographically
	
	
}
}
