package com.edubridge;


//statically typed
//datatypes(primitive & non primitive) ---> what kind of value

// var name = "janani"
//String name1 = "jan";

//1. Primitive data types --> boolean, char, byte(N+,-), short(N+,-), int(N+,-),long(N+,-), float(decimal), double(decimal)
//2. Non prim --> string, array, class, interface
public class Datatypes {
	
	//var --> container to store any value
	//var name should be proper --> caseSenst, keywrds cant be used for var names
	//it cant start with number --> 123name --> invalid 
	//employeeMarksFromAssesments
	//employee_marks_from_assesments  //$ valid
	
	//var age = 13;  // definition, initi
	//var street; //declaration
	
	//1. address for the variable , memory for the variable, value for the variable

	/*String capacity = "1000ml";
	int capacity = 1000;
	/*material = "stell|plastic"
	color
	containerType  = 
	sipperType = yes | no */
	public static void main(String[] args) {
	//true / false
	//8GB 
	//1bit //834834
	boolean isMarried = false; 
	boolean isBoring = true;
	System.out.println(isMarried);
	System.out.println(isBoring);
	
	
	char initial= 's';  //'char'  "str"
	char age = '8';
	int ageNum = age;
	System.out.println("---");
	System.out.println(ageNum);
/*	char splChar1 = &;
	char initial = u;
	char age1 = 65535;  
	//unicode encryption  UTF-16 // 0 to 65536
	 * first 256 --> ASCII values
	 */
	char splChar = '@';
	char ch_a = 'a';
	int charNum = splChar ;
	System.out.println("---------------------");
	System.out.println(charNum);
	System.out.println("---------------------");
	//in both ways as a char as wells as a number
	
	int numValOfM = 97;
	char ch_m = (char)numValOfM;
	System.out.println(ch_m);
	
	System.out.println(initial);
	System.out.println(age);
	System.out.println(splChar);
	//2bytes 16bits
	//unicode characters
	
	
	
	 
	//-128 to 127 
	//8 bit 
	//byte age1 = 300;
	//def val - 0
	byte rollNum;
	//System.out.println(rollNum);
	
	
	//-32768 to 32767 //2byte 16 bits
	//def val - 0 short dt
	short totalMarks = 500;
	System.out.println(totalMarks);
	
	//int dt def val - 0,  -2,147,483,648 to 2,147,483,647.(-2^31 to 2^31 - 1)
	//4bytes --> 32bits
	int ctc = 110000;
	System.out.println(ctc);
	
	
	//long //10 digits to 20 digits
	//-2^64 to 2^64 - 1
	//8 bytes
	long indiaPopulation = 123456789012L;
	long chinaPopulation = 1234567890124545l;
	System.out.println(indiaPopulation);
	
	//feets, inches(measurements), real time
	//6 to 7 decimal dig 
	//4 bytes of mem //def val -> 0.0
	//less precise  //f / F
	float height = 4.56677F;
	System.out.println(height);
	
	//java --> def decimal dt is double 
	//8 bytes //def val -> 0.0
	//upto 15 digits
	double temp = 97.7;
	//double temp = 97.7d; //D
	
	
	/* number --> base 10
	 * octal number --> base 8
	 * hexadecimal --> base of 16
	 * binary --> base 0f 2 
	 */
	}
}
