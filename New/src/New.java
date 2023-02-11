public class New {
//[ [1, 2, 4]
//  [5, 6, 7]
//  [8, 9, 10] ] (arr.length-1)--
	
	static void mat (int[][] n) {
		int len  = n.length-1;
		for(int i =3; i >= 0; i++) {			
			for(;len < n[3].length; len-- ) {			
				System.out.println(n[len]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][]	matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		mat(matrix);
	}

}
