package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		//단항 연산자
		//부호 연산자, 증감연산자, 논리연산자(!)
		obj.method1();
		obj.method2();

	}
	
	public void method2() {
		// 증감연산자
		// ++변수 : 다른 연산을 수행하기 전에 1을 증가시킴
		// 변수++ : 다른 연산을 수행한 후에 1을 증가 시킴
		// --변수 : 다른 연산을 수행하기 전에 1을 감소 시킴
		// 변수-- : 다른 연산을 수행한 후에 1을 감소 시킴
		
		int val;
		int res;
		
		val = 10;
//		res = ++val;
//		val+=1;
//		val=val+1;
		res = val;
		System.out.println("val : "+val);
		System.out.println("res : "+res);
		
		val = 10;
//		res = val++;
		val+=1;
		System.out.println("val : "+val);
		System.out.println("res : "+res);
		
		val = 10;
		res = val--;
		System.out.println("val : "+val);
		System.out.println("res : "+res);
		
		val = 10;
		res = --val;
		System.out.println("val : "+val);
		System.out.println("res : "+res);
		
		
	}
	
	public void method1() {
		int a=10;
		int num = -a;
		System.out.println(num);
	}

}
