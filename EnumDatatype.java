package com.loops;

public class EnumDatatype {
//Enum   --> enumeration 
	//special data type
	//days, months, planets, time 1 - 12 , 0 - 24, directions universal const
	//shapes {square, rectangle, triangle}, menu(veg/nonveg), payment(credit,debit/netban) --user defined enum
	
	//int var
	//values of enum in CAPITAL
	enum payment{CREDIT, DEBIT, NETBANKING}
	
	public static void main(String args[]) {
		//for(int val : nameOfTheArr)
		payment[] arr = payment.values();
		System.out.println(arr[0]);
		for(payment pay : payment.values()) {
			//.values() --> return 1D arr of val {CREDIT, DEBIT, NETBANKING}
			System.out.println(pay.ordinal());
			System.out.println(pay);
		}
	}
}//for safety --dev gives the constant value


