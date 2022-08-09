package com.edubridge;
import java.lang.StringBuffer;
public class Stringbuffer {
//string(immutable), stringbuffer(mutable), string builder
	//thread safe, multiple threads cant access an obj from strBuffer simultaneously
	public static void main(String args[]) {
	StringBuffer name = new StringBuffer();
	//cn obj = new cn()

	StringBuffer name1 = new StringBuffer("janani");
	String name2 = new String("janani34324");
	//name1 = name1.deleteCharAt(0)
	System.out.println(name1.deleteCharAt(0));  
	System.out.println(name1.append(name2));
	System.out.println(name1.reverse());
	System.out.println(name1.length());
	
	StringBuffer capacityObj = new StringBuffer(29);  //capacity
	capacityObj.append("dkldfkefjkfjekfjfekfjefefjfjpof46534266fjrfuewfudwoufdf");
	System.out.println(capacityObj.capacity());
	System.out.println(name.capacity());
	}
}
