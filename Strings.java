package com.edubridge;

public class Strings {

	/*strings --> sequence of char , NPDT
	 * java.lang.String 
	1.str literal 
	2.new keyword
	3. through char arr
	
	String name = "afiya";  name[0]  --> a
	string uses char arr  "afiya"  -->name {'a','f','i','y'}
	
	cn       objName = new cn
	String nameObj = new String("afiya");
	
	OTHER WAYS TO CREATE STRING : 1. String class, 2. StringBuffer  3.StringBuilder
	*/
	public static void main(String args[]){
		
		String name = "ujjwal";
		System.out.println(name);
	
		String nameObj = new String(name);
		System.out.println(nameObj);
		
		char []charArr = {'j', 'a', 'n', 65, 'n', 'i'};
		String name1 = new String(charArr);
		System.out.println(name1);
		
		//if it is char related arr it will print the input in string rather than ADDRESS
		System.out.println(charArr);
		
		//stack, heap
		/*heap --> str constnt pool(when ever you are oing to create any literal
		 * it will check if the value is already there or not
		 * 1.if value is NOT there, the val is added to the pool("ujjwal", "Ujjwal")
		 * all the refer var will go to stack mem(stack frame)(name1)
		 * 2.if value is there, it will never allow it to the pool again, it will make
		 *the reference var to point the same val available in pool
		 *
		 */
		//PDT checks VALUE
		//NPDT checks address
		System.out.println(name == nameObj);  //liter vs obj
		
		String name2 = "ujjwal";  //reference  var
		System.out.println(name2 == name);  //literal compar
		
		String name3 = "Ujjwal";
		System.out.println(name3 == name);
		
		name2 = "ujjwal singh";
		System.out.println(name2 == name);
	}
}
