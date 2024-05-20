package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowsExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ThrowsExample obj = new ThrowsExample();
		obj.process();

	}
	public void process() {
		System.out.println("1. 회원 생성");
		int sel = sc.nextInt();
		if(sel == 1) try {
			makeMember();
		} catch(Exception e) {
			System.out.println("회원가입 실패");
			System.out.println("다시 가입 하시겠습니까?");
		}
		
	}
	public Member makeMember() throws Exception {
		Member member =  new Member();
		member.name = sc.next();
		member.age = sc.nextInt();
		return member;
	}
}
