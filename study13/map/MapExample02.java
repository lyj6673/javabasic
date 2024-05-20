package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MapExample02 obj = new MapExample02();
		obj.process();

	}
	List<Map<String, String>> memberList = new ArrayList();
	
	public void process() {
		while(true) {
			
			//이름 나이 전화번호
			System.out.println("1. 회원 리스트 조회");
			System.out.println("2. 회원 가입");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 회원 정보 수정");
			
			int sel = sc.nextInt();
			if(sel==1)printList();
			if(sel==2)sign();
			if(sel==3)deleteMember();
			if(sel==4)updateMember();
			
		}

	}
	public void updateMember(){
		printList();
		System.out.println("수정할 회원 번호 입력");
		int num = sc.nextInt();
		Map<String, String> member = memberList.get(num);
		
		System.out.println("이름");
		String name = sc.next();
		System.out.println("나이");
		String age = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		
		member.put("name", name);
		member.put("age", age);
		member.put("phone", phone);

	}
	public void deleteMember(){
		System.out.println("삭제할 회원 번호 입력");
		int num = sc.nextInt();
		memberList.remove(num);
		printList();
	}
	
	public void sign(){
		Map<String, String> member = new HashMap();
		System.out.println("이름");
		String name = sc.next();
		System.out.println("나이");
		String age = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		
		member.put("name", name);
		member.put("age", age);
		member.put("phone", phone);
		memberList.add(member);
	}
	public void printList(){
		int i= 0;
		for(Map<String, String> map : memberList) {
			System.out.println(i+++map.get("name")+"\t"+map.get("age")+"\t"+map.get("phone"));
		}
	}
	
	

}
