package kr.or.ddit.homework.home16;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
		
	}
	public void process() {
		int money = 100000;
		int turn = 0;
		while(turn++<10) {
			//NationA, NationB
			// 각 게임마다 상금 1만원
			System.out.println("1. A 나라 (세금 15% 생활비 4000) 가위바위보게임");
			System.out.println("2. B 나라 (세금 20% 생활비 5000) 홀짝게임");
			Nation n = null;
			int sel = 0;
			sel = sc.nextInt();
			if(sel == 1) n = new NationA();
			if(sel == 2) n = new NationB();
			money+=n.game();
			money-=n.tax(sel);
		}
		System.out.println("남은 상금 "+money);
	}

}
