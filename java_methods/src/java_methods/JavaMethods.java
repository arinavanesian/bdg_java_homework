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

	public static void main(String[] args) {
//		JavaMethods j = new JavaMethods();
			hello(false, false);
			System.out.println(print0(1, 2));		                  
			System.out.println(returnChar('s'));
			System.out.println(returnFloat(2.4f, 1.2f));
			System.out.println(addNum(5));
			
	}		// TODO Auto-generated method stub
	}


