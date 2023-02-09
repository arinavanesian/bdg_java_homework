package Quest;

import java.util.Arrays;

public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("anime".charAt(2));
		System.out.println("anime".indexOf(2));
		System.out.println("anime".indexOf("ni"));
		System.out.println("animmmwe".indexOf("m", 5));
		System.out.println("animmmwe".substring(1, 5));
		System.out.println("\tanimm mwe \n");
		StringBuilder a = new StringBuilder("abc");
		StringBuilder sb = new StringBuilder("Juju");
		sb.append("bhb");
		
////		b = b.append("f").append("g");
//		System.out.println("a=" + a);
//		StringBuilder st1 = new StringBuilder("ababa");
//		StringBuilder st2 = new StringBuilder("ababa");
//		System.out.println(st1 == st2);
//		String mn = "man";
//		String nn = "man";
//		System.out.println(mn == nn); //true
//		System.out.println("man"== "man"); //true
//		String[] strarr = {"create, destroy"};
//		Object[] object = strarr;
//		String[] vim = (String[]) object;
////		object[0] = new StringBuilder(); starts debugging and doesnt stop running
////		System.out.println(object); //true
//		System.out.println(strarr[0] + ""); //true
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			 System.out.println(numbers[i] + " ");
		System.out.println(numbers[2]);
		int[] numberss = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numberss,3));

}
}
