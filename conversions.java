package com.edubridge;

public class conversions {

	public static void main(String args[]) {
		/*int ctc = 110000;  //4bytes
	 long conversion1 = ctc; //	 8bytes
	 float conversion2 = conversion1;//4bytes
	 System.out.println(ctc);
	 System.out.println(conversion1);
	 System.out.println(conversion2);
		//typecasting --> implicit typecasting */
		
		
		
		/*explicit typecasting */
		double conversion1 = 50.45464;  //8 bytes
		float conversion2 = (float)conversion1;
		long conversion3 = 32434334535L;
		int conversion4 = (int) conversion3;
		System.out.println(conversion2);
		System.out.println(conversion4);
		
	}
}
