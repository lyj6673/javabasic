package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class NationB extends Nation {
	Scanner sc = new Scanner(System.in);

	@Override
	public int game() {
		System.out.println("// 1: 홀, 2: 짝");
		Random random = new Random();
        int user = sc.nextInt();
        int com = random.nextInt(3); 
        if(user == 1) {
        	if(com == 1) {
        		System.out.println("user : 홀, com : 홀 이겼다.");
        		System.out.println("만원 적립");
        		return 10000;
        	}
        	else System.out.println("user : 홀, com : 짝 졌다.");
        }
        else if(user == 2) {
        	if(com == 2) {
        		System.out.println("user : 짝, com : 짝 이겼다.");
        		System.out.println("만원 적립");
        		return 10000;
        	}
        	else System.out.println("user : 짝, com : 홀 졌다.");
        }
        else System.out.println("잘못 입력하셨습니다");
		return super.game();
	}
	

}
