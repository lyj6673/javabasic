package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new  Scanner(System.in);
	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
//		obj.method1();
//		obj.method2();
		obj.method3();
		

	}
	public void method1() {
		//삼항연산자 : 3개의 피연산자를 필요로 하는 연산
		//		       삼항연산자는? 앞의 조건식의 결과에 따라
		//		       콜론 앞뒤의 피연산자가 선택됨.
		//         조건 연산식이라고도 함.
		
		String str = true ? "참" : "거짓";
		
		System.out.println(str);
		
	}
	public void method2() {
		// 18세 이상일 경우 성년 미만일 경우 미성년자를 출력하시오.
		int age =sc.nextInt();
		String result = age>=18 ? "성년" : "미성년";
		System.out.println(result);
	}
	
	public void method3() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//a값이 짝수라면 a+b
		//a값이 홀수라면 a*b
		
		int result = a%2==0 ? a+b : a*b;
		System.out.println(result);
	}

}
