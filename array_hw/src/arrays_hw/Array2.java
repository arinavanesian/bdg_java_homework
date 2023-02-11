package arrays_hw;


public class Array2 {
	static void arrSub(int n[]) { //1230456
		int count = 0;
		int[]m=new int[count];
		int[]b=new int[count];
		 for(int i = 0; i < n.length-1; i++) {
			if(n[i] <= n[i+1]) {//n[2]< n[3]
				m[i]=n[i];  //  
				m[i+1]=n[i+1]; //2
//				subArray(m, 1, 4);
			}
//			else continue REP;
			System.out.println(m[i]);
		}
			
//		if(m.length < b.length) System.out.println(m[x]);
//		else System.out.println(b[x]);
		
	}
	/*
	 * 11 Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։. Oրինակ՝
	 * array = {1,0,6,4,9,0,0}
	 */  
static void remove0(int[] n) {
	int count =0;
	int ar1[] = new int[n.length - count]; 
	N_LOOP1:	for(int i = 0; i < n.length; i++) {
			if(n[i] != 0) {
				ar1[i] = n[i];
				System.out.println(ar1[i] + " ");
			}
			else {
				continue N_LOOP1;	
			}
		}	
}	
//14  Տպել տրված մատրիցի գլխավորա անկյունագծից վերեւ բոլոր տարերը:
//diagonal int[i][j] i -count of arrays, j - number of elements in the array
//if number of n.length - 1--> iterate and  n < 
static void overDiagonal(int[][]n) {
	
	for(int j = n.length-1; j>0 ; j--) {		
		for(int i = j-1; i> 0; i--) {
			System.out.print(n[j][i] +" ");
		}
		System.out.println();
	}
}

static void upsideTri() {
	for(int x = 0; x <= 4; x++ ) { //0, 1, 2, 3, 4
		for(int z = x; z<=4; z++ ) {//01234, 1234, 234, 34, 4
			System.out.print("*");
			}
		System.out.println();
		
		for(int i = 0; i <= x; i++) { // 0, 01,  012, 0123			
			System.out.print(" "); //dosnt work--> condition doesn't work, 1, 2, 3, 4
		}
	}	
	}
static void overPDiagonal(int[][]n) {
	for(int i = 3; i< 3; i++ ) { //0, 1, 2
		for(int j = 0; j <3; j++) { //0, 1, 2, //0, 1, //0
			System.out.print(n[i][j]+ " ");
	}
}
}
//Q16
static void matrxSum(int[][] n){	
	int sum  = 0;
	for(int i = 0; i < n.length; i++) {
		for(int j = 0; j < n.length; j++) {
			sum += n[i][j]; 
	}
	}
	if(sum %2 ==0) {		
		System.out.println("YES");
		System.out.println("Your sum is:" +sum);
		
	}
	else {		
		System.out.println("NO");
		System.out.println("Your sum is:" +sum);
	}
} 
static int[] ham(int p[]) {
	return p;
}
	public static void main(String[] args) {
	
		int[] ar1 = {1, 2, 0, 3, 5, 0}; 
//		remove0(ar1);
		int[][] matrix = {
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4}
		};
		int[][] matrix1 = {
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 4},
				{1, 2, 3, 5}
		};
		matrxSum(matrix);
		matrxSum(matrix1);
		System.out.print(ham(ar1).toString());
//		overDiagonal(mattrix);
//		overPDiagonal(matrix);
		
		 
		
	}

}
