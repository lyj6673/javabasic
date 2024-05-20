package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {
		Circle c = new Circle();
		double area = c.area(10);
		double round = c.round(10);
		System.out.println("원의 넓이는 "+area);
		System.out.println("원의 둘레는 "+round);
		
	}
	//파라미터 r 입력 받고 넓이를 리턴 받는 메소드 완성
	public double area(int r) {
		return Math.PI*r*r;
	}
	//파라미터 r 입력 받고 둘레를 리턴 받는 메소드 완성
	public double round(int r) {
		return 2*Math.PI*r;
	}
}
