package Quest;
public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3};
		for (int num: arr1) {
		    for (int i = 0; i < arr1.length; i++) {
		    	System.out.println("---V1---");
		        System.out.println("[" + " " + num + " " + "]");
		    }
		}
		for (int num: arr1) {
		    for (int num2: arr1) {
		    	System.out.println("---V2---");
		        System.out.println("[" + " " + num2 +" " + "]");
		    }
		    
		    for (int i  = 0; i < arr1.length; i++) {
		    	for (int j  = 0; j< arr1.length; j++) {
		    		System.out.println("---V3---");
		    		System.out.println("[" + " "+ i + " "+ j +" " + "]");
		    }
		   }
		    for (int i  = 0; i < arr1.length; i++) {
		    	for (int j  : arr1) {
		    		System.out.println("---V4---");
		    		System.out.println("[" + " "+ i + " "+ j +" " + "]");
		    	}
		    }
		    
		   for(int m : arr1) {
			   System.out.println(m); //prints keys
		   }
	}

}
}
