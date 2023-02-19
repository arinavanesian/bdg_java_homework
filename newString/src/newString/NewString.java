package newString;

import java.util.Arrays;

public class NewString {
	
int sumDig(String st) {
	int sum = 0;
//	StringBuilder sb =new StringBuilder();
	for(int i = 0; i < st.length(); i++) {
		if(st.charAt(i) <= '9' && st.charAt(i) >= '0' ) {
			sum +=Integer.parseInt(st.charAt(i) + ""); 
		}
		else return 0;
	}
//	if(sb.charAt(i) == "")
//		return 0;
	return sum;
}
	StringBuilder makeToUp(String s) {
		String result = "";
		String[] s1 = s.split("");
		StringBuilder sb = new StringBuilder("");
		LOP: for(int i = 0; i< s1.length; i++) {
			if(i %2 ==0) {
				sb.append(s1[i].toUpperCase());
			}
			else if(i %2 !=0) {
				sb.append(s1[i]);
			}
			else continue LOP;
		}
		return sb;
	}
	StringBuilder mixS(String a, String b) { // "aaa", "BBB"
		StringBuilder sb = new StringBuilder();
		//iterate over them and for every str[0] + str[1]
		//looks like a two for loop problem
//		there should be a new array which is being appended the rest of the string
//		can string.toCharArray 
//		it's sum two arrays problem 
		a.toCharArray();
		b.toCharArray();
		int j;
		for(int i = 0 ; i < a.length()-1; i++) {
			for(j = i+1; j < b.length(); j++) {
			}
			if(j == b.length()) {
				sb.append(a.charAt(i));
			}
		}
		return sb; //aBaBaB
	}
//	Number of words
	int whiteSpace(String st) {
		int count = 0;
		String stA[]= st.split(" ");
		for(String k : stA) {
			count++;
		}
		return count;
	}
//reverse Words CHECK
	StringBuilder reverseWords(String s) {
//		StringBuilder reverse
		String[] sA = s.split(" ");//[John, Doe]
		StringBuilder sb = new StringBuilder();
		for(int i = sA.length - 1; i > 0; i--) {
			String last = sA[i]; //Doe
			sA[i] = sA[i-1]; //JOHN JOHN
			sA[i-1] = last; //DOE JOHN
			System.out.println(sA[i]);
		}
		for(int i = 0; i < sA.length; i++) {
			sb.append(sA[i]);
			sb.append(" ");
		}
		return sb;
	}
//	missing the backspaces
	StringBuilder revWords(String s) {
		String sA[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = sA.length; i > 0; i--) {
			sb.append(sA[i-1]);
			sb.append(" ");
		}
		return sb;
	}
	
//	CHECK
	void sortASCII(String s) {
		char[] sA = s.toCharArray();
		Arrays.sort(sA);
		for(int i = sA.length - 1; i > 0; i++) {
			char last  = sA[i];
			sA[i] =sA[i-1];
			sA[i-1] = last;
		}
		for(char k : sA)
		System.out.print(k);
	}
	
	void reverseString(String s) { //JOHN
		if(s == null || s.length()<=1 ) {
			System.out.print(s);
		}
		else {
			System.out.print(s.charAt(s.length()-1));
			reverseString(s.substring(0, s.length()-1));
		}
		
	}
	
	void compressString(String s) { //aaaBBB-->a3B3 --StringBuilder.append ----char+count
		char[] cA = s.toCharArray();
		StringBuilder sb = new StringBuilder(); 
		LOOP: for(int i = 0; i < cA.length; i++) {
			int count = 1;
			for(int j = 0; j < cA.length; j++) {
			if(cA[i] == cA[i+1]) {
				count++;
				}
			else continue LOOP; 
			sb.append(cA[i] + count + "");
			
			}
		}
	}
//	
	StringBuilder comp(String s) { //k(1)k(2)k(3)
		StringBuilder sb = new StringBuilder();
		int i =0;
		int count = 1;
		ONCE:for(; i < s.length() - 1; i++) { //
			count = 1;
			if(s.charAt(i) == s.charAt(i + 1)) { //
				count++;
			}
			else
				continue ONCE;
//			for(int i =0; i < sb.length(); i++) {
//				
//			}
			sb.append("" + s.charAt(i) + count);
		}
//		sb.append("" + letter + count)
		return sb;
	}
//	StringBuilder compress(String s) {
//		StringBuilder sb = new StringBuilder(s);
//		int count = 1;
//	
//		LOP: for(int i = 0; i < sb.length(); i++) {			
//			if(sb.charAt(i) == sb.charAt(i+1)) {
//				count++;
//				i++;
//			}
//			sb.append();
//			else continue LOP;
//		}
//		return sb;
//	}
	public static void main(String[] args) {
		NewString n = new NewString();
		System.out.println(n.makeToUp("mode"));
		System.out.println(n.whiteSpace("We ajain kajsun hjjh "));
//		System.out.println(n.reverseWords("We  ajain kajsun hjjh "));
		System.out.println(n.revWords("We  ajain kajsun hjjh "));
		n.reverseString("JOHN");
		n.reverseString("We  ajain kajsun hjjh ");
		System.out.println();
		char c = 'c';
		String jj = "adsa";
		StringBuilder sb = new StringBuilder("kkk");
		int count = 1;
		System.out.println(n.comp("kkk333rr"));
		
//		System.out.println(Integer.parseInt('a'));
		
		
	}

}
