package OperatorUtil;

public class OperatorUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8; //0100b
		int b = 6; //0110
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a % b);
System.out.println(a / b);
System.out.println(a * b);
System.out.println(a & b);
double c = 6.4d;
double d = 0.03d;
System.out.println(c + d);
System.out.println(c - d);
System.out.println(c * d);
System.out.println(c / d);
System.out.println(c % d);
 int x = 2 * (((5 + 3) * 4) - 8);
 int y = 2 * 5 + 3 * 4 - 8;
System.out.println(x);
System.out.println(y);
int e = 10;
int f = -88;
boolean n1 = true;
System.out.println(-e +92);
System.out.println(+e);
System.out.println(-e);
System.out.println(-f);
System.out.println(e++);
System.out.println(--f);
System.out.println(!(!n1));
System.out.println(!n1);

int xx = 3;
int yy = ++xx * 5 / xx-- + --xx; // 4 * 5/ 4 + 2
System.out.println("xx is " + xx); //xx is 2
System.out.println("yy is " + yy); //yy is (20/4) + 2
//Assignment Operators
int zz = (int)1.0;
short ff = (short)1921222; //is stored as 20678
System.out.println(zz); // 1 
System.out.println(zz + ff);   
System.out.println(2147483647+1); // since int values don't extend beyond 2147483647, it wraps to the next negative value  
long yf = (zz=3);
System.out.println(yf);//3
boolean hh = false;
boolean mm = (hh = true);
System.out.println(hh);//true
System.out.println(mm); //true

//Shift Operators
//<< Signed left shift operator adds 0's from the right
System.out.println("---Shift Operators---");
System.out.println(10 << 2); //adding 0's from the left side of the binary numbers 01010-->0101000-->40
System.out.println(-10 << 3); // 11010 -->11010000(-80)
//>> Rght Shift  Signed operator, leftmost is neglected and 0's are added from the left  
System.out.println(20 >> 2); // 20/4 = 5 //00010100 --->00000101 
System.out.println(15 >> 3); // 00001111 --->00000001

int bit3 = 3; //0011
System.out.println(bit3 << 3); //  3 * 2^3
System.out.println(bit3 << 4); // 3 * 2^4


	}
}
