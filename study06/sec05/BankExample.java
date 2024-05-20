package kr.or.ddit.study06.sec05;

import java.util.Random;

public class BankExample {
	public static void main(String[] args) {
		
		Bank[] peopls = new Bank[5];
		
		for(int i=0; i<peopls.length; i++) {
			peopls[i] = new Bank();
			int ran = new Random().nextInt(5)+1;
			
			peopls[i].loan(ran*100000);
		}
		
		for(Bank bank : peopls) {
			System.out.println("보유 금액 : "+bank.money);
		}
	}

}
