package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeWork19 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.process();
		
	}
	
	List<Map<String, String>> list;
	public void process() {
		//주사위 2개를 던졌을 때 나오는 합의 분포도를 출력
		
		// 2~12
		// 2   **
		// 3   ***
		// 4   *****
		// 5   *******
		// 6   *********
		// 7   *************
		
		
		// 12 **

		int num = 10; 
		Map<Integer, Integer> map = rollDice(num);
		print(map, num);
		
		
		
	}
	
	public int throwDice() {
		return new Random().nextInt(6)+new Random().nextInt(6)+2;
	
	/**
	 * 
	 * num 주사위 2개 던지는 시행 횟수
	 * @return 각 시행 결과 총합
	 */
	
	public Map<Integer, Integer> rollDice(int num){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<num; i++) {
			int dice = throwDice();
			int count = 1;
			if(map.containsKey(dice)) {
				count+=map.get(dice);
			}
			map.put(dice, count);
		}
		
		return map;
	}
	
	
	/**
	 * 
	 * 주사위 시행 결과를 출력
	 * 3% - > ***
	 * 5% -> *****
	 */
	
	public void print(Map<Integer, Integer> map, int num) {
		
		System.out.println(map);
		
		for(int i=2; i<=12; i++) {
			System.out.print(i+"\t");
			if(!map.cuntainsKey(i)) {
				System.out.println();
				continue;
			}
			int count = map.get(i);
			for(int star=0;star<count*100/num; star++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
		
	}

}
