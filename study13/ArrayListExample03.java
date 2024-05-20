package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample03 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		//회원1~ 회원 10까지 입력
		for(int i=0;i<10;i++) {
			list.add("회원"+i);
		}
		//전체리스트 출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//index 값을 3 입력해서 해당값을 삭제
		String remove = list.remove(3);
		//삭제한 값을 출력 => ?님이 탈퇴하셨습니다
		System.out.println(remove+"님이 탈퇴하셨습니다");
		
		if(list.contains("회원1")) {
			System.out.println("회원 1이 있습니다.");
		}
		if(list.contains("회원4")) {
			System.out.println("회원 4가 있습니다.");
		}
	}

}
