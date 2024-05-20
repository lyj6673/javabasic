package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		IfExample obj = new IfExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}
	
	public void method1() {
		//점수를 입력 받아 60점 이상이면 합격
		//미만이면 불합격을 출력
		
		int score = sc.nextInt();
		if(score>=60) {
			System.out.println("합격");
		}
		if(score<60) {
			System.out.println("불합격");
		}
	}
	
	public void method2() {
		// 90점 이상이면 A
		// 80점 이상이면 B
		// 70점 이상이면 C
		// 60점 이상이면 D
		// 60점 미만이면 F
		// 를 각각 출력하시오.
		
		int score2 = sc.nextInt();
		if(score2>=90 && score2<=100) {
			System.out.println("A");
		}
		if(score2>=80 && score2<90) {
			System.out.println("B");
		}
		if(score2>=70 && score2<80) {
			System.out.println("C");
		}
		if(score2>=60 && score2<70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");	
		}
		
		
	}
	
	public void method3() {
		//
		boolean b = true;
		boolean c = true;
		if(b) {
			System.out.println("참");
		}
		else if(c){
			System.out.println("b가 거짓이면서 c가 참인경우");
		}
		else {
			System.out.println("나머지 경우");
		}
	}
	
	public void method4() {
		int score3 = sc.nextInt();
		if(score3>=90 && score3<=100) {
			System.out.println("A");
		}else if(score3>=80) {
			System.out.println("B");
		}else if(score3>=70) {
			System.out.println("C");
		}else if(score3>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");	
		}
	}
	
	public void method5() {
		// 월을 입력했을 때
		// 봄(3~5) 여름(6~8) 가을(9~11) 겨울(12~2)을 출력하시오.
		int month = sc.nextInt();
		if(month==3 || month==4 || month==5) {
			System.out.println("봄");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("여름");	
		}else if(month==9 || month==10 || month==11) {
			System.out.println("가을");
		}else if(month==12 || month==1 || month==2) {
			System.out.println("겨울");
		}
	}
	
	public void method6() {
		// A~F 학점 표기
		// + : 7~9, 0 : 4~6  - : 0~3
		// ex) 97 A+
		//     82 B-
		//	   50 F
		int score4 = sc.nextInt();
		String grade = "";
		if(score4==100) grade = "A+";
		else if(score4>=90) grade = "A";
		else if(score4>=80) grade = "B";
		else if(score4>=70) grade = "C";
		else if(score4>=60)grade = "D";
		else grade = "F";	
		
		// A+이 아니면서 F학점이 아닌 경우에만 실행
		if(score4 != 100 && score4>60) {
			if(score4%10>=7) {
				grade+="+";
			}else if(score4%10>=4) {
				grade+="0";
			}else {
				grade+="-";
			}
		}
		System.out.println(grade);
		
	}
	
	public void method7() {
		//키와 체중을 입력하여 bmi 지수를 구하고
		// bmi 지수에 따른
		// 정상, 과체중, 비만, 고도 비만 등의 정보를 출력하시오.
		// bmi 지수 = 체중/(키*키)
		
		// 0~18.4     : 저체중
		// 18.5~22.9  : 정상
		// 23.0~24.9  : 과체중
		// 25.0~29.9  : 비만
		// 30.0 이상         : 고도비만
		
		System.out.println("키를 입력하세요");
		int key = sc.nextInt();
		System.out.println("몸무게를 입력하세요");
		int we = sc.nextInt();
		
		int bmi = we/(key*key);
		
		if(bmi>=0 && bmi<=18.4) System.out.println("저체중");
		else if(bmi>=18.5 && bmi<=22.9) System.out.println("정상");
		else if(bmi>=23.0 && bmi<=24.9) System.out.println("과체중");
		else if(bmi>=25.0 && bmi<=29.9) System.out.println("비만");
		else if(bmi>=30.0) System.out.println("고도비만");
		
		
	}
	

}
