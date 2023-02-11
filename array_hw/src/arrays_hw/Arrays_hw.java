package arrays_hw;
import java.util.Random;
import java.util.Scanner;

public class Arrays_hw {
	static void prntPosElement(int[] n) { //
		int elements ; 
		for(int i =0; i < n.length; i++) {
			elements = n[i];
			if(elements  > 0) {
				System.out.print("Positive integers are: ");
				System.out.print(elements +" ");
				
			}
			else 
				System.out.print("No positive integers found!" );
		}
	}
	
	static void reverseElement(short[] n) {
		for(int i = n.length -1; i >= 0; i-- ) {
			System.out.print(" " + n[i]);
		}
		System.out.println();
	}
	//use Array.sort
	static void minMaxElement(long[] n) {
//		Array.sort(n);
		long max = 0, min = 0;
		for(int i =0; i < n.length-1; i++) {
			System.out.print(n[i]);
			if(n[i] < n[i+1]) {
				max= n[i];
				min = n[i+1];
			}
		}
		System.out.println("MAX: " + max + "MIN: " + min);
	}
	static void inNewArray(int[]n) {
		int m[] = new int[n.length];
		for(int i = 0; i < n.length; i++) {
			m[i] = n[i];
			System.out.println("Your array element successfully copiet to a new m array: " + m[i]);
//			n[i] = (Integer) null;
		}
	}
//	static void sum2Arrays(int length, int min, int max) {
//		int ar1[] = new int[length];
//		int ar2[] = new int[length];
//		int result[] = new int[length];
//		for(int i = 0; i <length; i++) {
//			ar1[i] = ((int)Math.random() *  (max -min +1)) + min;
//			ar2[i] = ((int)Math.random() *  (max -min +1)) + min;
//			result[i] = ar1[i] + ar2[i];
////			System.out.println("Your array element successfully copiet to a new m array: " + m[i]);
//			System.out.print("Your sumArray is: " + "[ " + ar1[i] + " ]");
//			System.out.println();
//		}
//	}
	//Q6
//	. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array
//	-ի համապատասխան էլեմենտները եւ գրում երրորդ array-ի մեջ։
//	Oրինակ՝ array1 = {1,5,6,4,7}  
//	                  array2 = {7,4,2,3,5} 
//	                  array3 = {8,9,8,7,12}
	static void sum2Arrays(int length) {
		int ar1[] = new int[length];
		int ar2[] = new int[length];
		int result[] = new int[length];
		System.out.print("[ ");
		for(int i = 0; i <length; i++) {
			Random ran = new Random();
			ar1[i] =ran.nextInt(10); 
			ar2[i] =ran.nextInt(10); 
//			ar1[i] = ((int)Math.random() *  (max -min +1)) + min;
//			ar2[i] = ((int)Math.random() *  (max -min +1)) + min;
			result[i] = ar1[i] + ar2[i];
//			System.out.println("Your array element successfully copiet to a new m array: " + m[i]);
//			System.out.println();
//			System.out.print("Your sumArray is: " + "[ " + ar2[i] );
//			System.out.println();
			System.out.print( ar1[i] + " ");
		}
		System.out.print(" ]");
		System.out.println();
		System.out.print("[ ");
		for(int i = 0; i <length; i++) {
			System.out.print( ar2[i] + " ");			
		}
		System.out.print(" ]");
		System.out.println();
		System.out.print("[ ");
		for(int i = 0; i <length; i++) {
			System.out.print( result[i] + " ");			
		}
		System.out.print(" ]");
		
	}
	//Q7
	static void repElement(int[] n) {
		int count = 0;
		int element = 0;
		for(int i = 0; i < n.length-1; i++) {
			element = n[i];
			for(int j = i+1; j < n.length; j++) {
			if(n[i] == n[j]) count ++;
			}
		}
		System.out.println(element +": " + count);
	}

//Q8 CHECK this code 
	/*
	 * .Գրել method, որը տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում
	 * տվերի դասավորությունը եական չէ. Oրինակ՝ array = {1,5,6,4}
	 */
	                    
	                   // {1,5,6},  {1,5,4} ,{1,4,6}, {4,5,6}
	
	
	
//	Q9
static void descend(int n) {
	int arr1[] = {};
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i <n; i++ ) {
		int number = sc.nextInt();
		 arr1[i] = number;
//		 if(i) {
//			 
		 }
	for(int k = 0; k< arr1.length-1; k++) {
		for(int l = 1; l <arr1.length; l++) {
			if(arr1[k] <arr1[l]) {
				arr1[k] = arr1[k+1];	
				arr1[l] = arr1[k-1];
			}
		}
	}
	sc.close();
	}
//	Arrays.sort(arr1);
//	System.out.println("Ascending array: " + arr1);

//12  Տպել տրված թվերի հաջորդականության ամենաերկար աճող .
//ենթահաջորդականությունը: 
//Oրինակ՝  array = {1,5,6,4,9,0,4,7,7,9, 1}
//Q12

                    
                   // {0,4,7,7,9}
//Q13 https://www.javatpoint.com/java-binary-to-decimal
static int binaryToDecimal(String binary){
	int decimal =Integer.parseInt(binary, 2);

	return decimal;
}
//Q13 version 2

//Q13 version 3
static void binaryToDecimal(int size) {
    System.out.println("Entery your number in binaries: ");
    Scanner sc = new Scanner(System.in);
    int decimal = 0;
    int[] array = new int[size];
    int newN;
    for (int i = 0; i < size; i++) {
    	newN =sc.nextInt();
        array[i] = newN;
        if(newN == 0 || newN ==1) {}
        else {        	
        	System.out.println("Print only 0's and 1's");      
        	return;
        }
//        }
        }
    
    System.out.print("\nBinary:  ");

    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }

    System.out.print("\n\nDecimal: ");
    for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { //000001
        if (array[i] == 1) {
            decimal += Math.pow(2, j);
        } 
    }

    System.out.println(decimal);
}

	public static void main(String[] args) {
		int ms[] = {12, 134, 100, 12 ,213 };
		sum2Arrays(4);
		Scanner scan = new Scanner(System.in);
		
		binaryToDecimal(4);
//		short[] n = {1, 2, 4};
//		reverseElement(n);
//		long m[] = {2, 34, 100};
//		minMaxElement(m);
//		inNewArray(ms);
//		sum2Arrays(4, 10, 245);
//		System.out.println(binaryToDecimal("101"));
//		arrayTriads(ms);
//		arrayTris(ms);
//		descend(3);
	}


}
