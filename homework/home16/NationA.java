package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class NationA extends Nation {
    Scanner sc = new Scanner(System.in);
    
    @Override
    public int game() {
    	System.out.println("// 0 : 가위, 1: 바위, 2: 보");
    	Random random = new Random();
        int user = sc.nextInt();
        int com = random.nextInt(3);  
        if (user == 0) {
            if (com == 0) System.out.println("user : 가위, com : 가위 비겼다.");
            else if (com == 1) System.out.println("user : 가위, com : 바위 졌다");
            else if (com == 2) {
            	System.out.println("user : 가위, com : 보 이겼다");
            	System.out.println("만원 적립");
            	return 10000;
            }
        } else if (user == 1) {
            if (com == 0) {
            	System.out.println("user : 바위, com : 가위 이겼다");
            	System.out.println("만원 적립");
            	return 10000;
            }
            else if (com == 1) System.out.println("user : 바위, com : 바위 비겼다");
            else if (com == 2) System.out.println("user : 바위, com : 보 졌다");
        } else if (user == 2) {
            if (com == 0) System.out.println("user : 보, com : 가위 졌다");
            else if (com == 1) {
            	System.out.println("user : 보, com : 바위 이겼다");
            	System.out.println("만원 적립");
            	return 10000;
            }
            else if (com == 2) System.out.println("user : 보, com : 보 비겼다");
        } else System.out.println("잘못 입력하셨습니다");
        
    	return super.game();
    }

}

