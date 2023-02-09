package Exam;

public class Exam_Final {
static int j;
static void methodA(int i) {
	boolean b;
	do {
		b=i<10 | methodB(4);
		b=i<10 || methodB(8);
	}while(!b);
}
static boolean methodB(int i) {
	j += i;
	return true;
}
class Te{
	public int v;
}
class Te2{
	
	public int v;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object o = (Object).new Te();
		methodA(0);
			}
	}


