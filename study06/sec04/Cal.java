package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int add = cal.add(3, 4);
		int sub = cal.sub(3, 4);
		double div = cal.div(3, 4);
		int mul = cal.mul(3, 4);
		System.out.println(add);

	}
	public void method1() {
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 종료");
			int sel = 2;
			if(sel==2) return ;
		}
	}
	
	// a b 값을 매개변수로 결과값을 a+b로 하는 메소드 만들기
	public int add(int a, int b) {
		return a+b;
	}
	// a b 값을 매개변수로 결과값을 a-b로 하는 메소드 만들기
	public int sub(int a, int b) {
		return a-b;
	}
	// a b 값을 매개변수로 결과값을 a/b로 하는 메소드 만들기
	public double div(int a, int b) {
		
		return (double)a/b;
	}
	// a b 값을 매개변수로 결과값을 a*b로 하는 메소드 만들기
	public int mul(int a, int b) {
		return a*b;
	}
}
