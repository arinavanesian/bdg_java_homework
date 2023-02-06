package Exam;

import java.util.Scanner;

public class Exam1 {

	
//	class  Test1{
//		public int value; //0
//		public int hashCode(){return 42;}
//
//		class Test2{
//		public int value; //0
//		public int hashCode(){return (int) (value ^5);}
//		}
//		}
//		static boolean b1, b2; // false false
	
	public static void main(String[] args) {
	////		Exam1 ex = new Exam1();
	////		Test1 t1 = ex.new Test1();
	////		Test2 t2 = t1.new Test2();
	////		int x = 0;
	////		if(!b1){ //true
	////		if(!b2){ //true 
	////		b1 = true;
	////		x++; //x = 1
	////		if(5>6) {
	////		x++;} //false
	////		if(!b1)x = x + 10; //fa;se 
	////		else if(b2 = true) x = x+ 100;
	////		else if(b1 || b2) x = x+ 1000; //true 1001
	////		}}
	////		System.out.println(x);
	//		int x = 0;
	//		int y = 0;
	//		for(int z = 0; z < 5; z++){
	//		if((++x > 2) || (++y > 2)) //3x 3y, 5x 4y
	//		{
	//		x++; // 3+1 // 5 + 1
	//		}
	//		System.out.println(x + " " + y); // 1 1 , 2 2,  4 3, 6 4, 8 2
	//		}
	//		int ab = 13;
	//		if(ab < 8 && ab > 5 || ab < 20 && ab > 15) {
	//			System.out.println("AB"); // 1 1 , 2 2,  4 3, 6 4, 8 2
	//			
	//		}
	//		System.out.println("BB"); // 1 1 , 2 2,  4 3, 6 4, 8 2
	//		if((ab < 8 && ab > 5 || ab < 20) && ab > 15) {
	//			System.out.println("AB"); // 1 1 , 2 2,  4 3, 6 4, 8 2
	//			
	//		}
	//		System.out.println("BB");
	//		// 1 1 , 2 2,  4 3, 6 4, 8 2
	//
	//		double fff = 10;
	//		int nnn = 10;
	//		fff += (int) (fff * nnn); //10
	//		System.out.println(nnn); 
	//		int vvv;
	//		boolean bool = true || (vvv < 4); //it doesn't even check the right hand expression as expected
	//		System.out.println(bool); 
	//		System.out.println(5.00 ==5.0); 
	//		Exam1 exx = new Exam1();
	//		Exam1 mm = new Exam1();
	//		Exam1 lll = exx;
	//		System.out.println(mm== exx);//false
	//		System.out.println(lll== exx);//true
	//		System.out.println( 3 + 5 + " " );//true
	//		
	//		System.out.println( );//true
	//		String crack = "1";
	//		switch(19) {
	//		case 1: 
	//			System.out.println("HELLOOO");
	//		case 5:
	//			System.out.println("HELLASAAA");
	//		case 3:
	//			System.out.println("HOHOHOHOH");
	//		default: 
	//			System.out.println("HxxxxxOHOHOHOH");
	//		}
			
			
	//		will have take effect in the scope where they have been defined
			

				/* Print the patterns */
		String str = "";
		String star = "*";
				for(int i = 0; i < 5; i++) {
					str +=star;
					System.out.println(str);
				}
//				String linear = "";
//				String star8 = "*";
//				ROWS: for(int x = 0; x <3; x++ ) {
//						for(int i = 0; i < 2; i++) {
//						linear +=star8;
//						System.out.print(linear);
//						if(i == 4  && linear.length() == 10) {
//							System.out.println(" ");
//							continue ROWS;	
//						}
//					}
//		
//			}
				/* Solution 
				 * 
***************
***************
***************
***************
*/	
//for(int f = 0; f < 4; f++) {
//	String string1 ="";
//	String s1 ="*";
//	for(int y = 0; y < 5; y++) {
//		string1 +=s1;
//		System.out.print(string1);
//	}
//	System.out.println();
//	
//}

/* Solution 
 * 
*
**
***
****
*****
*/
	
//	String str3 ="";
//	String star3 ="*";
//	for(int zz = 0; zz < 5; zz++) {
//		str3 +=star3;
//		System.out.println(str3);
//		}
	
	
	
//	String starX = "*";
//	String space = " ";
/*
 * ****
 * **
 * *  */
//	String blank = "";
//	for(int row = 0; row < 3; row++ )	{
//			for(int col = 3; col >3-row; col--)	{
//				System.out.print(col);
//				}
//			System.out.println( );
//	}
	
	
//	int col = 3;
//	int row = 3;
//	while(row > 0) {
//		row--;
//		while(col > 0) {
//			String ts = "";
//			ts +="*";
//			System.out.print(ts);
//			col--;
//			if(ts.length() ==3) {
//				System.out.println();
//			}
//	}
//	for(int row = 1; row <5; row++) {
//		for(int col = 1; col<5; col++) {
//			System.out.println();
//		}
//	}
	Scanner x = new Scanner(System.in);
	int pos = 0, neg = 0, zero = 0; 
	for(int i = 1; i > 0; i++) {
		System.out.println("Insert number");
		int num = x.nextInt();
		if(num > 0) 
		pos++;
		else if (num < 0) 
			neg++;
		else 
			zero++;
		System.out.println("Insert SOMETHING");
		int choice = x.nextInt();
		if(choice == 0) 
			break;
		
	}
	System.out.println("Your number " + pos);
	System.out.println("Your number " + neg);
	
	}
	}
	



