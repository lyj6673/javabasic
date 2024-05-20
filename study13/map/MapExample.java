package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * HashMap
 * - key와 value로 이루어짐
 * - key값은 중복을 허용하지 않고 순서가 보장되지 않음
 * 
 * Map타입의 대표 컬렉션
 * 
 * 주요 메소드
 * .put    : 데이터 입력 key값은 중복되지 않음
 * .get    : 입력 받은 value 값을 key 값을 통해 꺼내올 수 있음.
 * .keySet : key로 이루어진 hashSet 값을 가져옴
 * .remove : value 값을 리턴 받고 삭제
 * .size   : 크기 반환
 * .containsKey : 키값이 존재하는지 확인
 */

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 95);
		map.put("홍길동", 97);
		map.put("이순신", 85);
		map.put("정몽주", 75);
		map.put("이성계", 87);
		
		//홍길동 점수
		if(map.containsKey("홍길동2")) {
			int hScroe = (int)map.get("홍길동2");
			System.out.println(hScroe);
		}else {
			System.out.println("해당 값이 존재하지 않습니다");
		}
	}

}
