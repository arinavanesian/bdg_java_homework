package StringHomework;

public class StringHomework {
//Q1	
StringBuilder newStringBuilder(String string, String newString) {
	StringBuilder stB= new StringBuilder(string).append(newString);
	return stB;
}
//Q1
String getNewString(String string, String newString) {
	return string.concat(newString);
}
//Q3
String revString(String string) {
	String revS = "";
	for(int i = string.length() -1; i >= 0; i--) {
		revS +=string.charAt(i);
	}
	return revS;
}
//int countSubString(String line, String token) {
//	//substring needed
//	int count = 0;
//	String newS = "";
//	boolean 
//	LOOP: for(int i = 0; i <= line.length(); i ++) {
//		 newS +=line.charAt(i); 
//if( newS == token ) {
//	count++;
//	continue LOOP;
//}
//else
//	continue LOOP;
//	}
//	return count; 
//}

//Q4????
int countSubString(String line, String token) { //wwe/have/in/ina// in
	int count = 0;
	String[] array = line.split("");
	for(int i = 0; i < array.length-1; i++) {
		String newS = array[i]+array[i+1];
		if( (array[i]+array[i+1]).equals( token )) {
	count++;
}
}
//	return line.split(token).length ;
	return count;
}
//Q5
String upperCase(String string) {
	String newS = "";
	newS = string.toUpperCase();
	return newS;
}
//Qa5 StringBuilder
StringBuilder upperCaseSB(String string) {
	StringBuilder sB = new StringBuilder(string.toUpperCase());
	return sB;
}
//Q5??? FIX THE ISSUE BY USING EXACT SAME METHODS
StringBuilder upperCaseSB2(String string) {
	StringBuilder sb = new StringBuilder(string);
	for(int i = 0; i < string.length(); i++) {
		sb  = sb.replace(i, i, sb.substring(i, i).toUpperCase());
}
	return sb;
}

//Q6
StringBuilder appendStar(String string) {
	StringBuilder sb = new StringBuilder (20);
	sb.append(string); //ahun
	if(sb.length() < sb.capacity()) {
		for(int i = sb.length(); i <sb.capacity(); i++) {
			sb.append("*");
		}
	}
	else 
		return sb;
	return sb;
} 
//Q7 Remove 'a'
StringBuilder remove_a(String string) { //"bab"
//Iterate and find indexOf('a').delete()
	StringBuilder result = new StringBuilder (string);	
	for(int i = 0; i < string.length(); i++) {
		if(string.charAt(i) == 'a') {
//			result.delete(i, i+1); 
			result.deleteCharAt(i);
//			result.replace(i, i+1, "");
		}
	}
	return result;
}
String remove_aS(String string) { //aha
		string.replace('a', ' ');
		return string;
	}

//Q10
//Գրել method, որը գտնում է թե, որերորդ ինդեքսում 
//է առաջին անգամ հանդիպել String c  սիմվոլը.
int  firstChar(String str, char letter) {
	int k;
	char[] chA = str.toCharArray();
	for(k = 0; k < chA.length; k++) {
		if(chA[k] == letter ) {
			return k; 
		}
	}
		
	return k;
}

int  firstChar2(String str, String letter) {
	int k;
	String[] strA = str.split("");
	for(k = 0; k < strA.length; k++) {
		if(strA[k] == letter ) {
			return k; 
		}
	}
	
	return k;
}
int firstChar3(String str, String letter) {
	return str.indexOf(letter);
}
//Q11
String substringToIndex1(String string, int index) {
	String subS = "";
	for(int i = 0; i < index; i++) {
		subS +=string.charAt(i);
	}	
	return subS;
}
String substringToIndex2(String string, int index) {
	String subS = "";
	subS += string.substring(0, index);
	return subS;
}

//Q11 StringBuilder 
StringBuilder substringToIndexBuilder(String string, int finishIndex) {
	//(0, finishIndex)
	String[] result = string.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int i = 0; i <finishIndex; i++) {
		sb.append(string.charAt(i));
	}
	return sb;
}
//Q11 StringBuilder 
	StringBuilder substringToIndexBuilder2(String string, int finishIndex) {
		//(0, finishIndex)
		String[] result = string.split("");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <finishIndex; i++) {
			sb.append(result[i]);
		}
		return sb;
} 
	int calc(int a, int b) {
		return a+ b;
	}
//	Q13
	String comma(String str) { //adsusahd, adsadsa
		int count = 1;
		String substring;
		String[] newS;
		if(str.contains(",")) {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==',') {
					count++;	
				}
			}
			newS = str.split(",", count);
			return newS[newS.length- 1];
		}
		else 
			return "Sentence doesn't contain ',' ";
}
//	Q12
	
//	String concat1(Object object1, Object object2) {
//		return object1 + object2 + "";
//		
//	}
//	String concat1(Object...a) {
//		String s ="";
//		
//		String mm = s.concat(a);
//	}
 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		"An".concat("Na");
//		StringBuilder stB = new StringBuilder("Man");
//		stB.append('I');
		StringHomework sh = new StringHomework();
		int b = 1;
		int a= 1;
		String st = "ahun uuhads   ";
		StringBuilder sb = new StringBuilder(20);
		sb.append(st);
		sb.delete(2, 3);
		String[] cb = st.split("");
		System.out.println(sh.substringToIndexBuilder2("aaudaud", 3));
		
		System.out.println(sh.comma("Hsusdnfaaa"));
		
//		System.out.println(sh.getNewString("Animal", "Fist"));
		
//		“We, are, living, in an, yellow, submarine, We don't,  have anything”
//			System.out.println(sh.firstChar("Animal AUhasnn uhasdhua", 'n'));
//		System.out.println("We are living in an yellow submarine. We don't  have anything".split(" "));
//		System.out.println(sh.countSubString("We are living in an yellow submarine. We don't  have anything", "in"));
//		System.out.println(sh.substringToIndex1("aben_a688a", 3));
//		System.out.println(sh.substringToIndex2("aben_a688a", 3));
//		System.out.println(sh.substringToIndexBuilder2("We are living in an yellow submarine. We don't  have anything", 4));
	}

}
