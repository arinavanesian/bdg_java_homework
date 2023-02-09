package Algorithms;

import java.util.Scanner;

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
		sc.close();
		int result =1;
		for(int i=0; i < pow; i++ ) {
			result *=base;
		}
		return  result;
	}
static //123
//3 *100 + 2* 10 +1 
	 int reverseNum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int answer = sc.nextInt();
	sc.close();
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
static void rightTri() {
	int count =0;
	while(count <4) {
		int z =4;
		for(; z>0; z-- ) {
			System.out.print(" ");		
		}
		for(int i =0; i<4; i++ ) {
			System.out.print("*");
		}	
		count++;
		System.out.println();
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		multiplicate();
//		System.out.println(pow());
//		System.out.println(reverseNum());
//		primeFinder();
//		rightTri();	
	}

}
