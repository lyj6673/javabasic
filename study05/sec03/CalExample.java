package kr.or.ddit.study05.sec03;

public class CalExample {
	
	public double cal(double a, double b, Cal op) {
		if(op == Cal.ADD) return add(a,b);
		if(op == Cal.SUB) return sub(a,b);
		if(op == Cal.MUL) return mul(a,b);
		if(op == Cal.DIV) return div(a,b);
		
		return 0;
	}
	
	
	
	
	// +-/* 메소드 각각 만들고 enum type에 추가
	
	public double add(double a, double b) {
		return a+b;
		
	}
	public double sub(double a, double b) {
		return a-b;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double div(double a, double b) {
		return a/b;
	}

}
