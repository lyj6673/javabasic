package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		//이항연산자 : 대부분의 연산자
		//산술연산자, 관계연산자, 논리 연산자, 비트연산자, 대입연산자
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
		

	}
	public void method1() {
		//산술연산자
		//종류 : +-/*%
		//사칙연산과 마찬가지로 /, *가 우선 적용된다.
		
		int a=5;
		int b=3;
		System.out.println("+\t"+(a+b));
		System.out.println("-\t"+(a-b));
		System.out.println("/\t"+(a/b));
		System.out.println("*\t"+(a*b));
		System.out.println("%\t"+(a%b));
	}
	
	public void method2() {
		//관계 연산자.
		//> < == <= >= !=
		
		System.out.println("점수입력");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		if(score1+score2 >= 90) {
			System.out.println("A");
		}
		
		if(score1+score2 < 60) {
			System.out.println("F");
		}
	}
	
	public void method3() {
		//논리 연산자
		//&& || !
		//&&(논리곱) A, B 중 하나라도 거짓이면 거짓.
		//||(논리합) A, B 중 하나라도 참이면 참. 
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(!a||b);
		
		// B 학점을 부여
		System.out.println("점수 입력 :");
		int score = sc.nextInt();

		if(score >= 80 && score<90) {
			System.out.println("B");
		}
		
	}
	
	public void method4() {
		// & | ^ ~
		//          &           |
		// 45 : 00101101    00101101
		// 25 : 00011001    00011001
		//      00001001    00111101
		
		int a = 45;
		int b = 25;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
	}
	
	public void method5() {
		//shift operator
		// >> << >>>
		
		System.out.println(12>>2);
		System.out.println(12<<2);
	}
	
	public void method6() {
		// 대입 연산자
		// = *= /= += -= %=
		
		int a = 10;
		int b = 4;
		int result = a+b;
		// a+=b;
		// a= a+b
		
		System.out.println("a+=b : "+(a+=b));
		System.out.println("a-=b : "+(a-=b));
		System.out.println("a*=b : "+(a*=b));
		System.out.println("a/=b : "+(a/=b));
		System.out.println("a%=b : "+(a%=b));
	}

}
