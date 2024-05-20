package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.method1();

	}
	
	public void method1() {
		// 0 : 가위, 1: 바위, 2: 보를 입력하고
		// 컴퓨터의 결과값에 따라 승패를 출력하시오.
		Random random = new Random();
		
		int user = sc.nextInt();
		int com = random.nextInt(3);
		String result = "";
		
		
		if(user==0) {
			if(com==0)System.out.println("user : 가위, com : 가위 비겼다.");
			else if(com==1)System.out.println("user : 가위, com : 바위 졌다");
			else if(com==2)System.out.println("user : 가위, com : 보 이겼다");
		}
		else if(user==1) {
			if(com==0)System.out.println("user : 바위, com : 가위 이겼다");
			else if(com==1)System.out.println("user : 바위, com : 바위 비겼다");
			else if(com==2)System.out.println("user : 바위, com : 보 졌다");
		}
		else if(user==2) {
			if(com==0)System.out.println("user : 보, com : 가위 졌다");
			else if(com==1)System.out.println("user : 보, com : 바위 이겼다");
			else if(com==2)System.out.println("user : 보, com : 보 비겼다");
		}
		else System.out.println("잘못 입력하셨습니다");
		
		//ex) user : 가위, com : 보 이겼다.
	}

}
