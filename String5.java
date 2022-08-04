package com.edubridge;

public class String5 {
public static void main(String args[]) {
	/*str ltr
	 * strr obj
	 * char arr[]
	 * byte arr[]
	 */
	byte arr[] = {65,66,67,68,65,67,67,96};  
	String strVar = new String(arr);
	
	String coursename = "java full stack development";
	System.out.println(strVar.toLowerCase());
	System.out.println(strVar);
	
	//ABCD
//	System.out.println(strVar.charAt(10));
	//System.out.println(strVar.indexOf("A"));
	//System.out.println(strVar.indexOf("A",3));
	
	System.out.println(strVar.replace("A","goo"));
	char arr1[] = coursename.toCharArray();
	//{'j','a','v'
	
System.out.println(arr1.length);
System.out.println(coursename.length());

String empty = "          hgkhgkg";
System.out.println(empty.length());
System.out.println(empty.isEmpty());
System.out.println(empty.isBlank());  //it will check for complete whitespace in str value

String strr = "       hi helooooo                    ";
System.out.println(strr.stripLeading());
System.out.println(strr.stripTrailing());


System.out.println(strr.repeat(3));

byte byteArr[] = strVar.getBytes();
System.out.println(byteArr[4]);  //byte[]

}
}
