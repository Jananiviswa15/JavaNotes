package com.edubridge;

public class variables {
	int noOfFloors; //instance var
	//inside a class but outside all methods
	//obj1 ...objn --> they ll have separate copy (noOfFloors)
	//it is visible for all methods, constructrs of that class
public static void main(String[] args) {
	 String course = "Java"; //4* 2bytes
	  int age = 45;  //4bytes
	/*Types of var 
	 * 1.Instance var (non static fields)
	 * 2. class variable(static)
	 * it is visible to all objs of that class, shared acrs all objs
	 * static String builderName;
	 * 3. local variable (no static local var is allowed) 
	 * 4. parameters
	 *
	 */
	System.out.println(course);
	System.out.println("--------------------");
}

public void display() {
	 int age = 21;
	
}
}
