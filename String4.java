package com.edubridge;

public class String4 {
	static public void main(String args[]) {
		String companyName = "       edubrIDge india    hi       ";
		System.out.println(companyName.substring(4));
		System.out.println(companyName.substring(4,11));
		System.out.println(companyName.toUpperCase());
		System.out.println(companyName.toLowerCase());
		
		System.out.println(companyName.trim());
		System.out.println(companyName.startsWith("edu"));
		
		String courseName = "RectangLLLLL e";
		System.out.println(courseName.endsWith(" e"));
		System.out.println(courseName.length());
	//	System.out.println(courseName.charAt(45));  //stroutofbound
		
		
		int intArr[] = {3454, 4545,90};  //INTEGER
		System.out.println(intArr.length);
		String arr[] = {"ja", "na", "ni"};
		System.out.println(arr.length);
		//System.out.println(arr[90]);  //arrIndxoutofbound
		
		String obj = new String("RectangLLLLL e");
		String obj1 = obj.intern();
		System.out.println(obj1 == courseName );
		
		System.out.println(obj.replace("Rect", "RECT"));
		
		byte byteNum = 21;
		int value = 5656;
		float fValue = 4545.5656f;
		
		System.out.println(10 +String.valueOf(fValue) );
		//String.valueOf(value) String.valueOf(5656)  --> "5656" 
	}
}
