package Algorithms;

import java.util.Random;
import java.util.Scanner;

public class Algorithm1 {
	public int fm = 2;
	static void randomEvenOdd() {
		int min = 0;
		int max = 100;
		int rN = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println("Randomly generated: " + rN);
		if(rN % 2 ==0)			

			System.out.println("Even");
		
		else 			
			System.out.println("Odd");
			
		
	}
	static void randomNextInt() {
		Random random = new Random();
		int rN2 = random.nextInt(101); 
		System.out.println("Randomly generated: " + rN2 );
		if(rN2 % 2 ==0) 
			System.out.println(rN2 + " is even");
		else 
		System.out.println(rN2 + " is odd");
	}
	
	static void random10() {
		int smallest = 0;
		int largest = 0;
		int min = 1;
		int max = 100;
		int count = 0;
		while(count < 10) {
			count++;
			int rand = (int)(Math.random()* (max-min+1)) + min;
			if(smallest > rand) {
				smallest = rand;
			}
			if(largest < rand) {
				largest = rand; 
			}
			
			System.out.println(count + " is count");
			System.out.println(rand + " is random");
			System.out.println(smallest + " is the smallest");
			System.out.println(largest + " is the largest");
		}
		
	}
	static void powOf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the base number: ");
		int base = sc.nextInt();
		System.out.println("Insert the power number: ");
		int pow = sc.nextInt();
		sc.close();
		int result = 1;
		for(int i =0; i <pow; i++ ) {
			result *=base;
			
				}
			System.out.println(base + "to the"+ pow +"power is " +result);
			}

//	Patterns	
		static void squRe() {
			for(int x = 0; x < 3; x++) {				
				for(int i = 0; i < 5; i++) {
					System.out.print("*");
				}
			System.out.println();}
		}
		
		static void revTri() {
			for(int row = 3; row > 0; row--) {
				for( int col = row; col < 0; col--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
			
	static void findOdd(int n) {
		if(n % 2 !=0) {			
			System.out.println(n + " is odd");
		}
	}	
static void primeFinder(int numb) {
	boolean isPrime = true;
	
	for(int i =2; i <=numb/2; i ++) {
		if(numb <=1 ) {
			isPrime = false;
			System.out.println(numb  + " isn't a prime number");
			break;
		}
		if( numb % 2 ==0) {
			isPrime = false;
			System.out.println("PrimeFinder: " + isPrime +" "+numb  + " isn't a prime number");
			break;
		}
		else {
			isPrime = true;			
			System.out.println("PrimeFinder: " + isPrime +"Prime number: " + numb);
		}
	}
}	

static void reverseNumbers(int n) {
	for(int i = 1; i <= Integer.toString(n).length(); i++) {		
		n =(int) (n % Math.pow(10, i));
		if(i == Integer.toString(n).length()-1) {
			n=3;
		}
System.out.println(n);	} 
}

static void guess() {
	Scanner sc = new Scanner(System.in);
	String answer = sc.nextLine();
//	if()
}
class Bob{
	public int f = 0;
}
 //Q7
//int largeSmall() {
//	int large = 0;
//	int small =0;
//	Scanner sc = new Scanner(System.in);
//	return large;
//	return small;
//}

//static boolean ifArmstrong(int n) { //1231 
//	int cubeSum =0;
//	int ex =n;//123 
//	while(ex !=0) { // 123, 12, // 123
//		int remain = 0;
//		remain= ex%10;// 3, 2 //123 /10 =12.3, 1/10 =0.1 //1231 --1, 
//		int cube = (int)Math.pow(remain, 3);// 3^3 =9, , 4, 1
//		cubeSum += cube;//9+, 4, 1, //14
//		ex /=10; // 123/ 10 =12.3, 12/10 = 1 //1/10 =0.1-->0 //
//	}
//	if(cubeSum == n) {
//		return true;
//	}
//	else
//	return false;
//}
//sinx = x - x3/3 +x5/5 -....
//double sinX(double n, int f) {
//return sinX	
//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random ran = new Random();
//		int max = 100;
//		int min = 20;
//		int a = (int)(Math.random()* (max - min +1) + min);
//		double b =(Math.random()* max - min + 1) + min;
//		int m = ran.nextInt(10);
//
//		random10();
//		powOf();
//		squRe();
//		revTri();
//		primeFinder(3);
//		reverseNumbers(123);
//		int m = 43242;
//		Object o = (Object)new Algorithm1(); //upcasting
//		Algorithm1 foo = (Algorithm1)o;
//		String s = Integer.toString(m);
//		System.out.println("i " + foo.fm);
		System.out.println(ifArmstrong(123)); //false
		System.out.println(ifArmstrong(153)); //true
		System.out.println(ifArmstrong(371)); //true
		
//		System.out.println(ifArmstrong()); //
		
//		System.out.println(s);	 
//		System.out.println(((Object)m).getClass().getSimpleName());	 

}
}