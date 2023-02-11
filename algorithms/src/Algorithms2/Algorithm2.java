package Algorithms2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Algorithm2 {
//Q1) Multiplication table
	static void multiplicate() {
		System.out.println("Insert any positive integer: ");
		Scanner sc = new Scanner(System.in);
		int request = sc.nextInt();
		sc.close();
		for(int i = 1; i <= 10; i++) {
			if(request < 0)
				break;
			System.out.println(request+" * " +i+ " = "+request * i);
		}
	}
static //Q2
	int pow() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Insert the base nunber: ");
		int base = sc.nextInt();
		System.out.println("Insert the power nunber: ");
		int pow = sc.nextInt();
		int result =1;
		for(int i=0; i < pow; i++ ) {
			result *=base;
		}
		sc.close();
		return  result;
	}
//Q3
	/*
	 * Write a program that prompts the user to input an integer and then outputs
	 * the number with the digits reversed. For example, if the input is 12345, the
	 * output should be 54321
	 */
static 
 
	 int reverseNum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int answer = sc.nextInt();
	int revNumb = 0;
	while(answer !=0) {
		revNumb = revNumb * 10;
		revNumb =revNumb + answer%10;
		answer = answer/10;
	}
	return revNumb;
	}

//Error while running
//Doesn't continue after Do you want to play
///Q5
static void primeFinder() {	
	String repeat = "Y";
	do {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		for(int i = 2; i <= numb; i++){
			if(numb % i ==0) {
				System.out.println(numb+" is not prime");
				break;
			}
			else
				System.out.println(numb+" is prime");
		}
		System.out.println("Do you want to play again? Y/N: ");
		repeat = sc.next();
		
	}while(repeat == "Y");
}

/*
 * Question 4 Write a program that prompts the user to input a positive integer.
 * It should then output a message indicating whether the number is a prime
 * number.
 */
static boolean positivePrime() {
	boolean isPrime = true;
	LOOP: while(isPrime) {
		int positive = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive number below"));
		if(positive <= 0) {
			System.out.println("Enter a positive number (larger than 0)");
			continue LOOP;
	}
		
			for(int i =2; i <=(int) (positive/2); i++) {
				if(positive % 2 ==0) {
					JOptionPane.showMessageDialog(null, positive +" is not prime.");
					return isPrime =false;
				}
				else {					
					JOptionPane.showMessageDialog(null, positive +" is prime.");
					return isPrime;
				}
			
	
		}
			return isPrime;
	}
	return isPrime;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		multiplicate();
//		System.out.println(pow());
//		System.out.println(reverseNum());
//		primeFinder();
//		rightTri();	
		
//		System.out.println(reverseNum());
		System.out.println(positivePrime());
//		System.out.println(pow());
	}

}
