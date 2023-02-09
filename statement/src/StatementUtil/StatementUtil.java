package StatementUtil;

import java.util.regex.Pattern;

public class StatementUtil {
	 
		/* This method checks if the input parameter 
		 * is even or odd
		 * @parameter x
		 * @return int returns "Even" or "Odd"
		 */
	String evenOrOdd(int x) {
		if(x % 2 == 0) {
			
			return "Even";
		}
		else {
			
			return "Odd";
		}				
	
	}
	/* This method checks if the sign  
	 * of the input parameter is positive or negative
	 * @parameter
	 * @return String returns x + ": positive sign" or   x + ": negative sign"s
	 * */ 

	String checkSign(int x) {
		if (x > 0) {			
			return x + ": positive sign";
		}
		else {			
			return x + ": negative sign";
		}
		
	}
	class Radius {
		int squaredR(int r) {
			return r * r;			
		}
	}

	/* This methos is used to check if the 
	 * sum of squared input parameters are equal
	 * or less than 25
	 * @parameter x
	 * @parameter y
	 * */
	void checkInCircle(int x, int y) {
		Radius radius;
		radius = new Radius();
		if  ((x*x + y*y )<= radius.squaredR(5)) {
			System.out.println ("(" + x +"," + y +")" + " is inside the K(0, 5) circle's circumference.");			
		}
		else {
			System.out.println ("(" + x +"," + y +")" + " is outside of the K(0, 5) circle's circumference.");
		}
		
	}
	/* This method is used for checking if the input parameter
	 * is a 3 figure number or not
	 * @parameter x
	 * @return boolean returns true or false
	 * */
	
		boolean check3digits(int x) {
			int absolute = Math.abs(x);
			if(((absolute - (absolute%100))/100) > 0 && ((absolute - (absolute%100))/100) <=9 ) {
//				easier version would be if(absolute > 99  && absolute <1000) 
				return true;
			}
			else {
				return false;
			}
		}
		/* This method is used for 
		 * identifying if 3 figure numbers
		 *has 7 as in decades
		 *a local boolean variable is created 
		 *through which boolean true 
		 *@parameter x
		 *@return boolean returns local variable checked or false */
		
	boolean checkFor7(int x) {
		boolean checked;
		
		if (check3digits(x)) {
			if( ((x%100)-(x%10))/10 == 7 ){
				checked = true;
			}
			else {
				checked = false;
			}
				return checked;
		}
		else {
			return false;
		}
	}

	void interval(int x) {
		if(x < 8 && x >5) {
			System.out.println(x + " has a value between 5 and 8");
}
		else if(x < 20 && x > 15){
			System.out.println(x + " has a value between 15 and 20");
		}
	}
			
 boolean cd7Or5(int x) {
	 if(x % 5 == 0 && x % 7 == 0) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 void printer1_200() {
	 int x =1;
	 while (x <= 200) {	
		 System.out.println(x++);
	 }
 }

	 
 int product = 0;
	 void sum1_2digits(int c) {
		 for (int i = 10; i < 99 && i <= c; i++) {
			 if(i % 2 == 0) {				 
				 product +=i;
				 System.out.println(product);
			 }
		 }
	 }

	 int printAverageNumber(int b) {
		 int avg = (b + 1)/2;
		 return avg;
	 }
	 
//	 int gen_sum5Figures() {
//		 String string = "";
//		 while(string.length() != 5) {
//			 int figure = 0;
//			 figure++;
//			 string += figure;
//		 } // "12345"
//		 int intstr = Integer.parseInt(string);
//		 intstr % 10
//		 return sum;
//	 System.out.println((intstr%10)); //5
//	 System.out.println((intstr%100 - intstr%10)/10); //4
//	 System.out.println((intstr%1000 - intstr%100)/100); //3
//	 System.out.println((intstr%10000 - intstr%1000)/1000); //3
//	 System.out.println((intstr%100000 - intstr%10000)/10000); //3
//	 }
//		 for(int i = 0; i < string.length(); i++ ) {
//			  Pattern pattern = Pattern.compile(" ");
//		        String[] ints = pattern.split(string);
//			 int sum = 0;
//			 Integer.parseInt(string);
//			 sum += ints[i];
//		 }
//		 return 
//	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatementUtil st = new StatementUtil(); 		
		st.checkInCircle(1,1 );
		System.out.println(st.evenOrOdd(3)); //Odd		
		boolean x = st.check3digits(999); //
		boolean y = st.checkFor7(272);
		System.out.println(x); //true
		System.out.println(y); //true
		int m = 0;
		 while (m++ < 10) {
	          if (m == 8)break;
	       
		}
		 System.out.println(m);
		 
		 int z = 15;
//         it's an infinite loop
         while (z > 10) { //11
           z=z--; // 10
         } 
         
         System.out.println(z); //10
//         it's an infinite loop
         int cf = 2;
         int cv = 5;
        while(cv< 10) {
         cv++;
	}
        st.sum1_2digits(14);
        System.out.println((12345%10)); //5
        System.out.println((12345%100 - 12345%10)/10); //4
        System.out.println((12345%1000 - 12345%100)/100); //3
        System.out.println((12345%10000 - 12345%1000)/1000); //3
        System.out.println((12345%100000 - 12345%10000)/10000); //3
        System.out.println(z); //10
        System.out.println((12345 - (12345%10)) + (12345 -(12345 %100)) + (12345 -(12345 %1000)) + (12345 -(12345 %10000))+ ((12345 -(12345 %10000))/1000) ); //10
        
 }

}