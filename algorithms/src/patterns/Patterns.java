package patterns;

public class Patterns {
	/* *****
	   *****
	   ***** */
	static void squateStar(int n, int f) { 
		for(int i = 0; i <n; i++) {			
			for(int b = 0; b <f; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/* *
	   **
	   **** 
	   ***** */
	
	static void leftTriangle1(int n) {//4
		for(int i = 0; i <n; i++) {		 // 0, 1
			for(int b =0; b <=i; b++) { // 0, 1
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
	/* *****
	   ***
	   **
	   *  */
	static void revleftTriangle(int n) {
		int b = n;
		for(int z =0; z < n; z++) {
		for(int i =z; i < n; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		}
	}
//       * 
//     * * 
//   * * * 
// * * * * 
//* * * * *
	static void spaceStar(int n) {
		
		for(int i=0; i<n; i++)  {           
		for(int j=i; j<n-1; j++) {  //4     
			System.out.print(" "); 
		}           
			for(int b =0; b <=i; b++) {				
				System.out.print("*"); 
			}
		System.out.println(); 
		} 
	}


	static void numberRevTriangle(int n) {
		int b = n;
		for(int z =0; z < n; z++) {
			for(int i =z; i < n; i++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	/*
	 **
	 ***
	 *****
	 *******
	 **********/
	
//	*****
//	 ****
//	  ***
//	   **
//	    *
//	
	static void upsideTri() {
	for(int x = 0; x <= 4; x++ ) { //0,      1,     2, 3  , 4
		for(int z = x; z<=4; z++ ) {//01234, 1234, 234, 34, 4
			System.out.print("*");
			}
		System.out.println();
		
		for(int i = 0; i <= x; i++) { // 0, 01,  012, 0123			
			System.out.print(" "); //dosnt work--> condition doesn't work, 1, 2, 3, 4
		}
	}	
	System.out.println();	
	}
//    1 //1 //x*1 + 1=1
//   222 //3 //x*2+1=3
//  33333 //5//x*2 +1 =5
// 4444444 //7
//555555555 //9
static void numbPyramid(int n) {
	for(int i = 0; i<n; i++ ) { // 1 , 2 , 3, 4, 5
		for(int xi = 0; xi <n-i-1;xi++) { //4, 3 , 2, 1
			System.out.print(" ");
//			
		}
		for(int j= 1; j<=i*2 + 1; j++ ) { //1, 2, 3, 4, 5
		System.out.print(i+1);
		}		
System.out.println();	
		}
}   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		squateStar(5, 8);
//		revleftTriangle(4);
//		leftTriangle1(4);
//		revleftTriangle(8);
//		spaceStar(4);
//		upsideTri();
//		numbPyramid(5);
//		leftTriangle(6);
//		Patterns pat = new Patterns();
//		Child child = pat.new Child(); //child
//		child.name = "Rasy";	
//		Parent p = pat.new Child(); //child
//		p.name = "Rasy";
//		Child pc = (Child)p;
//		test1(1, 2, 3);
//		test2(n);
//		child.display();			
//		p.display();			
//		pc.display();			
//		System.out.println(child.name);			
//		System.out.println(child.name == p.name); //true
		
	}

}
