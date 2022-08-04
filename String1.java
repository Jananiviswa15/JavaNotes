package com.edubridge;

public class String1 {
public static void main(String args[]) {
	String name = "Diksha";//enters str const pool
//	String name1 = "Diksha";
	char arr[] = {'D', 'i', 'k', 's', 'h', 'a'};
	String nameObj = new String("Diksha");  //never enter str constnt pool, it will be there in heap 
	String nameObj1 = new String(arr);  //Diksha
	System.out.println(name == nameObj);
	System.out.println(nameObj1 == nameObj);
	//all objcts have sep mem of that specified class type
	//in stack frame all ref var(name, arr, nameObj, nameObj1)
	
	name = "preethi";
//	System.out.println(name1);
	
	//concatenation + 
	System.out.println(name.concat(nameObj1));
	System.out.println(nameObj1.concat(nameObj1));  
	//System.out.println(nameObj1); 
	//System.out.println(name);
	
	//strings as immutable //unchanged
	name = name.concat(nameObj1); //preethi+diksha
	System.out.println(name);
	
	
}
}
