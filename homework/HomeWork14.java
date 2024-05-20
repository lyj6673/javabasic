package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork14 hw = new HomeWork14();
		hw.process();
	}
	
	User[] userList = new User[100];
	int cur = 0;
	public void process() {
		while(true) {
			//1. 회원가입, 2.회원 탈퇴, 3.정보 수정, 4.회원전체정보 출력
			int sel =sc.nextInt();
			System.out.println("1 회원 가입");
			System.out.println("2 회원 탈퇴");
			System.out.println("3 정보 수정");
			System.out.println("4 회원 전체정보 출력");
			
			if(sel==1)addUser();
//			if(sel==2)removeUser();
			if(sel==3)updateUser();
			if(sel==4)printUser();
		}
	}
	
	public void addUser() {
		//1. 회원 가입
		System.out.println("아이디를 입력하세요: ");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요: ");
        String pwd = sc.next();
        System.out.println("이름을 입력하세요: ");
        String name = sc.next();
        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        User user = new User();
        user.id = id;
        user.pwd = pwd;
        user.name = name;
        user.age = age;
        userList[cur++] = user;
	}
	
//	public void removeUser() {
//		//2. 회원 탈퇴
//	}
//		printUser();
//		System.out.println("수정할 회원번호 입력");
//		int num = sc.nextInt();
//		if(num>cur) {
//			System.out.println("잘못입력하셨습니다");
//			return;
//		}
//		int add = 0;
//		User[] temp = new User[100];
//		for(int i=0; i<cur; i++) {
//			if(i==num) {
//				add=1;
//			}
//			temp[i]= userList[i+add];
//		}
//		userList = temp;
//		cur--;
//	}
	
	public void updateUser() {
		//3. 정보 수정
		printUser();
		System.out.println("수정할 회원번호 입력");
		int num = sc.nextInt();
		if(num>cur) {
			System.out.println("잘못입력하셨습니다");
			return;
		}
		User user = userList[num];
		System.out.println("아이디를 입력하세요: ");
        String id = sc.next();
        System.out.println("비밀번호를 입력하세요: ");
        String pwd = sc.next();
        System.out.println("이름을 입력하세요: ");
        String name = sc.next();
        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        user.id = id;
        user.pwd = pwd;
        user.name = name;
        user.age = age;
        printUser();
		
	}
	
	public void printUser() {
		//4. 회원 전체정보 출력 
		for(int i=0;i<cur;i++) {
			System.out.println(i+" : "+userList[i]);
		}
	}

		

class User{
	//아이디 패스워드 이름 나이를 필드로 만들기
	String id;
	String pwd;
	String name;
	int age;

	@Override
	public String toString() {
		return "회원 [user : " + id + ", pwd : " + pwd + ", name : " + name + ", age : " + age + "]";
	}
}
}


