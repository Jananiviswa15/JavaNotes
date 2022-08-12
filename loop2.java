package com.loops;

public class loop2 {

	public static void main(String args[]) {
		short ctr = 0;
		//2.while loop 
		//if you can do something in for loop you can do the same thing while loop
		
		
		/*for(start; condi; alter) {
			
		}*/
		/* start optional (mul var can be dec and initi)
		while(condi compul) {
			alter optional (mul var can be altered)
		}
		*/
		//ctr==0 
		while(ctr <=90) {
			//System.out.println(ctr);
			ctr+=10;
		}
		
		int ctr1 = 2;
		while(ctr1 <=900) {
			//System.out.println(ctr1);
			ctr1*=10;
		}
		int ctr2 = 2;
		while(ctr2 <=900) {
			if(ctr2 > 0 &&  ctr2 < 200) {
			System.out.println(ctr2);
			ctr2*=5;
			}	
		}
		
	}
}
