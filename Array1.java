package com.edubridge;

public class Array1 {

	public static void main(String []args) {
		int intArr[] = new int[3];
		byte byteArr[] = new byte[3];
		float floatArr[] = new float[9];
		short shrtArr[] = new short[90];
		long longArr[] = {39483948, 98989}; 
		char charArr[] = new char[900];
		boolean boolArr[] = new boolean[90];
		double dArr[] = new double[890];
		String strArr[] = new String[10];
		
		System.out.println(intArr.getClass().getSuperclass() );
		System.out.println(byteArr.getClass() );
		System.out.println(charArr.getClass().getSuperclass() );

		System.out.println(boolArr.getClass() );

		System.out.println(strArr.getClass().getSuperclass());
		
		System.out.println(intArr);
		System.out.println(intArr[0]);  
		
		System.out.println(intArr[0]== intArr[1]);
		//0 == 0 (value type)
		int intArr1[] = new int[8];
		System.out.println(intArr == intArr1);
		//checking address
	}
}
