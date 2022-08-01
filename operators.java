package com.edubridge;

public class operators {
/* unary 
 * 		one operand
 * 		++ increment (post inc, pre inc)
 * 		-- decrement (post dec, pre dec)
 *      ~(complime), !(not)
 * arithemetic (+, - , * , / , %(modulo - remainder))
 * shift (<< signed left shift, >> signed right shift, >>> unsigned right shift)
 * relational  (==, != , <, > , >= , <=)
 * bitwise (&,|, ~, ^) 
 * logical (AND &&(if all ips/cond are true then it will work ,
 *  OR || (if any one ip/cond is true then it will work )
 * Ternary(?:  --> cond ?  it will come here(TRUE) : i am here because cond is FALSE)
 * instanceOf will check if the object is type of class, subclass/interface 
 * assignment =, += , -= , *= , /= , %= 
 */
	
	
	public static void main(String args[]) {
	byte age = 20;
		System.out.println(age);
		//inc by 1 and then assign the value to the var 
		System.out.println(++age);
		//assign the value to the var and then inc the val by 1
		System.out.println("post inc :"+  age++);
		System.out.println(age);
		
		//assign the value to the var and then dec the val by 1
		System.out.println(age--);
		System.out.println("after post dec:" +age);
		
		
		//dec by 1 and then assign the value to the var 
		System.out.println(--age);
		
		
	boolean isMarried = true;
	boolean ujjwalIsHappy = false;
	//only for bool dt !
	System.out.println(!isMarried);
	System.out.println(!ujjwalIsHappy);
		
		int num = 5;  //-6 total no of +ve nums from 0 till that num
		System.out.println(~num);
		
		
		/*num = 5;   ~num = -6
		 * num = 0101 --> binary 
		 *  ~num = 1010 = 10 
		 * 1s comp(~) + 1 = 2s comp
		 * 1010 ---> 0101
		 * 			   +1 ---> 0110 --> 6 
		 * 
		 * 
		 */
		
		int num1 = -10;
		//num1 = ~num1;  //9
		System.out.println(~num1);
		//+9 
	//age = 20
	System.out.println(~num1 * age);  //-10 * 20
	System.out.println(++num1 + age);  //-9 + 20 --> 11
	System.out.println(--num1 - age++); // -10 - 20 ==> -30
	int quo = num1 / age;  //0.4761904761904762
	//float fQuo = (float) num1/ age;  10.0000000/21 
	System.out.println(quo);  //-10 / 21   --> 
	System.out.println(20 % 5);
System.out.println("---Logical operator ----");
System.out.println(num1 < age && num1 > 5 );
System.out.println(num1 > 5 || num1 < age   );
//(-10 < 20
		

byte number1 = 20;  
byte number2 = 25;
System.out.println(number1& number2);
System.out.println(number1| number2);
System.out.println(number1^ number2);

num1 = num1 + 4; // -6--> num1 += 4
num1 = num1 * 5 ;//-30  --> num1*= 5
//System.out.println(num1);
System.out.println(num1 += 4);  //-26


System.out.println(num1 == 26);  //if two values on LHS and RHS are equal
System.out.println(num1 != 26);
System.out.println(num1 >= 26);
System.out.println(num1 <= 26);
System.out.println(num1 > 26);
System.out.println(num1 < 26);

//<< left shift
byte num2 = 5; //0101  --> 010100 //5*2^n 5*2^2
System.out.println(num1  << 2);
num1 = 10;  //1010  ---> 0010  //10/2^n 10/2^2  --> 2.5
System.out.println(num1  >> -2);
System.out.println(num1  >>> -2);

System.out.println(num1 != 10  ? "I am true" : "Iam false"); 
boolean result = num1 > age; // 10 > 20
System.out.println(result ? num1+=4 : num1++);
System.out.println(num1);  //11



System.out.println(num1+ num2);  //11+5 --> 16
System.out.println(13+13+4.56646+"afiya "+"kareem"  + 13+13+4.5565656);
System.out.println("at end of linefgfsgfgfggfg :" + num1+num2);
System.out.println("at end of linefgfsgfgfggfg :" + (num1+num2));
//at end of line : 115

//at end of linefgfsgfgfggfg : + 16

byte num3 = 12, num4 = -15, num5 = 18;
byte num7 = 12, num8 = 15, num6 = 18;
//27 * 18 = 486 - 18 = 468 / 12 = 39
//BODMAS --> bracket of div mul ADD sub
//1.5  --> 1
System.out.println("maths equation : "+ (num3 + 270- 1));

System.out.println(num3 & num4);

	}
}
