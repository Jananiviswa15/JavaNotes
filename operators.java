package com.edubridge;

public class operators {
/* unary 
 * 		one operand
 * 		++ increment (post inc, pre inc)
 * 		-- decrement (post dec, pre dec)
 *      ~(complime), !(not)
 * arithemetic (+, - , * , / , %(modulo - remainder))
 * shift 
 * relational 
 * bitwise (&,|, ~, ^) 
 * logical (AND &&(if all ips/cond are true then it will work ,
 *  OR || (if any one ip/cond is true then it will work )
 * Ternary
 * instanceOf
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
System.out.println(num1 += 4);
	}
}
