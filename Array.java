package com.edubridge;

public class Array {
//why arr has similar dt?
	//in main function(String args[])
	
	
	//list , collection of values, same type , index --> 0, continuous mem loc
	//arr name is going to have your base addrs, arr are objcts
	//dynamic mem alloc
	//parent of arr -> is object class
	/*String learner1 = "afiya";  //0x456  (10bytes) afiya
	 * 
	 *
	 *.....String learner8 = "golu"; String learner9 = "dhinesh"; 
	 *
	 *
	 * String learners[] = {"name1", "name2"...name9}
	 * 
	 * dt nameOfArr[]; dt[] nameOfArr; dt []nameOfArr;
	 * 
	 * 8PDT & Non PDT you can use for arr
	 * 
	 * 
	 * 
	 */
	
	
	/* var dec & def
	 * 
	 * String learner8 = "golu"; Non P DT
	 * int favNum = 90;  // 4bytes (0x5678)
	 * 
	 * String obj = new String("hi");
	 * Learneres learnersObj = new Learneres();
	 * arr = new int[9]; 
	 */
	public static void main(String []params) {
		int arr[];
		//size of an arr in int , short , but not long
		float farr[];
		String sarr[] = new String[10];  // store both str literals, str objs
		char cArr[] = new char[10];
		//define mem
		arr = new int[9];  //36bytes
		byte bArr[] = new byte[10];  //40 bytes
		
		bArr[0] = 90;
		bArr[8] = 90;
		
		sarr[0] = "janani";
		sarr[1] = "aniket";
		
		String learners[] = {"aniket1", "aniket2", "ujjwal", "golu"};
		short salary[] = {3847,3432,-3243,4};
		System.out.println(bArr[0]);
		System.out.println(bArr[1]);
		System.out.println(bArr[2]);
		System.out.println(bArr[3]);
		System.out.println(bArr[4]);
		System.out.println(bArr[5]);
		System.out.println(bArr[6]);
		System.out.println(bArr[7]);
		System.out.println(bArr[8]);
		System.out.println(bArr[9]);
		//System.out.println(bArr[10]);
		
		System.out.println("--" +sarr[0]);  //no def val is avail
		
		System.out.println("123"+ cArr[0] +"123");
/*
 * 0 	1	2	3	4  index
va  va1 va2  va3 va4    
0X12 ox20 ox28 ox36 ox44  adrs

arrNam epts to baseaddrs
sysout(lArr[4])  --> va4  0X12 + (4*8)ox44
sysout(lArr[0])	 --> 	ox12 +(0*8)
sysout(lArr)  --> base adrrs --> ox12
lArr & larr[0] same
 */
		System.out.println(bArr.length);
	}
}
