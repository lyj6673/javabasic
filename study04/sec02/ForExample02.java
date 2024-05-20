package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();

	}
	public void method4() {
		int num = sc.nextInt();
		LOOP1 :
		for(int i=0; i<100000; i++) {
			LOOP2 :
			for(int j=0; j<10000; j++) {
				if(num==i) break LOOP1;
				System.out.println(j);
			}
		}
	}
	
	public void method3() {
		//홀수의 합을 구하시오
		int s = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=s; i++) {
			if(i%2==0)continue;
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void method2() {
		//구구단 출력
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
	}
	
	public void method1() {
		// 영어에 포함된 모음의 수를 구하시오.
		String s = sc.next();
		
		int cnt = 0;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch =='a'||ch =='e'||ch =='i' ||ch =='o' ||ch =='u') {
				cnt++;
			}
		}
		System.out.println("모음의 갯수는: "+cnt);
	}

}
