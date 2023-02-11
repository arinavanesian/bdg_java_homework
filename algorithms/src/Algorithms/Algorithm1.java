package Algorithms;

import java.util.Random;
import java.util.Scanner;

public class Algorithm1 {
	
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
//	Write a program that generates a random number between 1 and 100 
//	(you can use the Random ( ) method from the Math class.
//	the next step check whether it is an even or an odd number. Each of 
//	the above actions should be written to the console.
	static void randomNextInt() {
		Random random = new Random();
		int rN2 = random.nextInt(101); 
		System.out.println("Randomly generated: " + rN2 );
		if(rN2 % 2 ==0) 
			System.out.println(rN2 + " is even");
		else 
		System.out.println(rN2 + " is odd");
	}
//	 Write a program that will use the while loop to find the largest and 
//	 smallest number from the set of 10 randomly drawn integers from 1 to 
//	 100. In this task, do not use arrays or other collections.
//	 import java.util.Random;
	
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
			
	static void findOdd(int n) {
		if(n % 2 !=0) {			
			System.out.println(n + " is odd");
		}
	}	
//	Q4
static void primeFinder(int numb) {
	boolean isPrime = false;
	for(int i =2; i <=(int)numb/2; i ++) {
		if( numb % i ==0) {
			isPrime = true;
			break;
		}
	}
	if(!isPrime) 
		System.out.println("PrimeFinder: " + isPrime +" "+numb  + " is a prime number");
		else
		System.out.println("PrimeFinder: " + isPrime +" "+numb  + " isn't a prime number");
		
	
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

//Q8
//Write a program to print out all Armstrong numbers between 1 and 500. If sum 
//of cubes of each digit of the number is equal to the number itself, then the 
//number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
static boolean ifArmstrong(int n) { //1231 
	int cubeSum =0;
	int ex =n;//123 
	while(ex !=0) { // 123, 12, // 123
		int remain = 0;
		remain= ex%10;// 3, 2 //123 /10 =12.3, 1/10 =0.1 //1231 --1, 
		int cube = (int)Math.pow(remain, 3);// 3^3 =9, , 4, 1
		cubeSum += cube;//9+, 4, 1, //14
		ex /=10; // 123/ 10 =12.3, 12/10 = 1 //1/10 =0.1-->0 //
	}
	if(cubeSum == n) {
		return true;
	}
	else
	return false;
}


//Question 9
//Write a program to calculate the sum of following series where n is input by 
//user. 
//1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n
static void reciprocal() {
	try (Scanner sc = new Scanner(System.in)) {
		int request = sc.nextInt();
		double sum = 0;
		for(int i = 1; i <=request ; i++) {
				 sum += (double)1/i;
		}
		System.out.println("Sum: " + sum);
	}
	
}

/*
 * Question 11 Write a program that generates a random number and asks the user
 * to guess what the number is. If the user's guess is higher than the random
 * number, the program should display "Too high, try again." If the user's guess
 * is lower than the random number, the program should display
 * "Too low, try again." The program should use a loop that repeats until the
 * user correctly guesses the random number.
 */
static void guessGame() {
	System.out.println("Eye spye with my little eye...");
	
	Scanner scs = new Scanner(System.in); 
	int n = scs.nextInt();
	int guess = new Random().nextInt(n); 
	System.out.println("Get ready to guess until " + n);
//	int answer = new Scanner(System.in).nextInt();
//		answer = sc.next();
	boolean answerIsTrue =true;
	while(answerIsTrue) {
		Scanner sc = new Scanner(System.in);
			int	answer =sc.nextInt(); 
			if(answer > guess) {		
				System.out.println("Too high, try again.");
			}
			else if(answer < guess){
				System.out.println("Too low, try again.");
}
			else answerIsTrue =false;
		
		}

			System.out.println("You guest right! It was: " + guess);
			scs.close();
	}
static void sine() {
	int sum =0;
	System.out.println("Input numbers between -1 and 1: ");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	System.out.println("Input n: ");
	int n = sc.nextInt();
//	for(; x)
//	Math.pow(x, n)
//sum
}
	public static void main(String[] args) {
//		Random ran = new Random();
//		int max = 100;
//		int min = 20;
//		int a = (int)(Math.random()* (max - min +1) + min);
//		double b =(Math.random()* max - min + 1) + min;
//		int m = ran.nextInt(10);
int[] A ={1, 2, 3, 4}; 
int[] B ={4, 3, 2, 1};
//int[] A ={1, 2, 3, 4}; 
//int[] B ={9, 8, 7, 6};

//		primeFinder(2);
//		reciprocal();
//		guessGame();
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
		
//		System.out.println(ifArmstrong()); //
		
//		System.out.println(s);	 
//		System.out.println(((Object)m).getClass().getSimpleName());	 

}
}