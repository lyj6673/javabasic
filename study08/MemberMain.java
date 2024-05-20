package kr.or.ddit.study08;

import java.util.Scanner;

public class MemberMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MemberMain obj = new MemberMain();
		obj.process();

	}
	public void process() {
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("pass : ");
		String pass = sc.next();
		System.out.println("name : ");
		String name = sc.next();
		System.out.println("age : ");
		int age = sc.nextInt();
		MemberVo mem = new MemberVo();
		mem.setId(id);
		mem.setPass(pass);
		mem.setName(name);
		mem.setAge(age);
		
		IMember memService = new MemberSeriveImple();
		memService.sign(mem);
	}

}
