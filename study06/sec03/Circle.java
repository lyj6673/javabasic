package kr.or.ddit.study06.sec03;

public class Circle {
	//반지름, 넓이, 원의 둘레
	int r;
	double area;
	double round;
	
	double PI =Math.PI;
	
	//생성자 반지름만 입력 받고
	//넓이랑 둘레는 자동 생성
	//넓이 = pi*r*r
	//둘레 = pi*2*r
	
	public Circle(int r) {
		this.r = r;
		this.area = r*r*PI;
		this.round =2*r*PI;
	}

}
