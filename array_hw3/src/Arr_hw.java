import java.util.Scanner;

public class Arr_hw{
	//NEW PROBLEM
	/*
	 * Suppose A, B, C are arrays of integers. The numbers in array A appear in
	 * ascending order while the numbers in array B appear in descending order.
	 * Write a user defined method in Java to produce third array C by merging
	 * arrays A and B in ascending order. Use A, B and C as arguments in the method.
	 */
	//int[] A ={1, 2, 3, 4}; 
	//int[] B ={4, 3, 2, 1};
	//int[] C ={1, 2, 3, 4,4, 3, 2, 1};
	static void ascend(int[] A, int[] B) {
		int C[] =new int[A.length + B.length];
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			C[index] =A[i];
//			System.out.print(C[index] + " ");	
			index++;
		}
		for (int i = 0; i < B.length; i++) {
			C[index++] = B[i];
		}
		for(int k = 0; k <C.length-1; k++) { // 
			 OVER: for(int x = k+1; x <C.length; x++) {
				if(C[k] <= C[x]) {
					continue OVER;
				}else {
					int point = C[x];
					C[x] =C[k];
					C[k] =point; 
				}
			}
		}
		for(int mm : C) {			 
			System.out.print(mm + " ");
		}
	}

	/*
	 * Write user defined methods for square matrix to calculate
	 *  Left diagonal sum
	 * Right diagonal sum
	 */
	static int diagonSum(int[][] n) {
		System.out.println("Do you want to calculate \t Right or Left diagonal sum?\n Submit your answer by typing  'R' or 'L' ");
		try (Scanner sc = new Scanner(System.in)) {
			String answer = sc.next();
			int sum  = 0;				
						
				switch(answer) {
				case "R":
					for(int i = 0; i < n.length; i++) { //0, 1, 2
						for(int j = n.length - 1 -i; j <= n[i].length -1-i; j++) { //2, 1, 0
							sum +=n[i][j]; //
						}
					}	
					break;
				case "L":
					for(int i = 0; i < n.length; i++) {//0, 1, 2
						for(int j = i; j <=i; j++) { //0, 1, 2
							sum +=n[i][j]; //	
						}
					}
					break;
					
					
				default:						
					System.out.println("Enter 'R' or 'L' ");
				}
				return sum;
		}
		}


	

	
	 public static void main(String[] args) {
		 int[] A ={1, 2, 3, 4}; 
		 int[] B ={4, 3, 2, 1};
		 int[][] mx = {
				 {1,  2,  14},
				 {11, 22, 45},
				 {13, 21, 34},
		 };
		 ascend(A, B);
		 System.out.println(diagonSum(mx));
	 }
 }

