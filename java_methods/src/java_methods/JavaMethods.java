package java_methods;

import java.util.Scanner;

public class JavaMethods {

	private static  int print0(int a, int b){
		return 0;
	}
	/*This method takes no inputs and returns nothing*/
	void nothing() {}

	/* This methos prints "Hello World" in console 
	 * @parameter m
	 * @parameter n*/
	private static  void hello(boolean m, boolean n) {
		System.out.println("Hello World");
	}	

	/* This method returns it's input 
	 * @parameter g
	 * @return char returns g*/
	protected static char returnChar (char g) {
		return g;
	}

	/* This method returns the first input float numbers 
	 * @parameter kk
	* @parameter ll
	* @return float returns kk*/
	static float returnFloat(float kk, float ll) {
		return kk;
	}
	/*This method calculates the sum of 
	 * all natural numbers to the input integer recursively
	 * @parameter num
	 * @return int returns sum of natural number to num
	 * */
	
	static int addNum(int num) {
		int sum = 0;
		if(num == 0) return sum;
		else
		return sum = num + addNum(num - 1);
	}

	public float foo(float a, float b) {
		return a;
	}
	public static void main(String[] args) {
		
		JavaMethods j = new JavaMethods();
			j.hello(false, false);
			System.out.println(print0(1, 2));		                  
			System.out.println(returnChar('s'));
			System.out.println(returnFloat(2.4f, 1.2f));
			System.out.println(addNum(5));
//			byte, short, char, int , long, float, double 
//			byte y = 2;
//			byte x = 2;
//			boolean z = x + y;
//			short z = x + y;
//			char z = x + y;
//			byte  z = x + y;
//			long z = x + y;
//			float  z = x + y;
//			System.out.println(z);
			

		 
//			boolean keepGoing = true;
//			int result = 15, i = 10;
//			do {
//			i--;
//			if(i==8) keepGoing = false; //i = 9, 8, keepGoing =false
//			result -= 2; //13, 11
//			} while(keepGoing); //true, 
//			System.out.println(result);  //11

			int count = 0;
			ROW_LOOP: for(int row = 1; row <=3; row++) // 
			for(int col = 1; col <=2 ; col++) {  //
			if(row * col % 2 == 0) continue ROW_LOOP; // 2* 2, 3*3
			count++; //1, 2
			}
			System.out.println(count); 
}

}