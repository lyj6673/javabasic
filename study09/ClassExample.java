package kr.or.ddit.study09;

public class ClassExample {
	public static void main(String[] args) {
		//class B에 field b 값 가져와보기
		int b = new ClassA().new ClassB().b;
		
		int c = new ClassA.ClassC().c;

		//class C에 field c 값 가져와보기
	}

}
