package com.edubridge;

public class stringbuilder {
	//java.lang
	//mutable,non synchronized, multiple functions/multiple threads can act at the same time 
  static  public void main(String args[]) {
    	StringBuilder str = new StringBuilder();
    	System.out.println(str);
    	System.out.println(str.capacity());
    	System.out.println(str.length());
    	StringBuilder str1 = new StringBuilder("dlflkdjff");
    	System.out.println(str1);
    	System.out.println(str1.capacity());
    	System.out.println(str1.length());
    	//	StringBuilder str3 = "hi helllooooo";	
    	System.out.println(str1.append("fdgksjskgjkjgjgfjg"));
    	System.out.println(str1.capacity());
    	//old cap * 2 + 2
    	
    	System.out.println(str1.append(str1.reverse()));
    	System.out.println(str1.capacity());
    	System.out.println(str1.length());
    	System.out.println(str1);
    }
  
}
