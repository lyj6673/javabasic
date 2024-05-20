package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
		
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method5();
//		obj.method6();
//		obj.method7();
//		obj.method8();
		obj.method9();
		

	}
	public void method9() {
		// 입력 받은 소문자부터 ~z까지 출력
		// 대문자로 변환
		char s = sc.next().charAt(0);
		for(char i=s; i<='z'; i++) {
			System.out.println((char)(i-32));
		}
	}
	
	public void method8() {
		// 입력 받은 소문자부터 ~z까지 출력
		char s = sc.next().charAt(0);
		for(char i=s; i<='z'; i++) {
			System.out.println(i);
		}
	}
	
	public void method7() {
		// a~z까지 출력하기
		for (char i='a'; i<='z'; i++) {
			System.out.println(i);
		}
	}
	
	public void method6() {
		// 스캐너로 입력받은 숫자만큼 출력하기
		int s = sc.nextInt();
		for(int i=1; i<=s; i++) {
			System.out.println(i);
		}
		
	}
	
	
	public void method5() {
		// 1~50까지 홀수의 합
		int sum=0;
		for(int i=1; i<=50; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method3() {
		//1~20까지 짝수의 합.
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%2==0)sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method2() {
		// 5~10까지 숫자를 출력
		
		for (int i=5; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void method1() {
		//1~5까지의 합을 구하시오
		int sum=0;
		for (int i=1; i<=5; i++){
			sum+=i;
			
		}
		System.out.println(sum);
	}

}
