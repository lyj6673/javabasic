package kr.or.ddit.study06.sec05;

public class Bank {
	static int totalmoney =1000000;
	
	int money;
	
	public void loan(int loan) {
		if(totalmoney<loan) {
			System.out.println("보유금액보다 많은 요청입니다.");
			System.out.println("보유 금액 : "+totalmoney);
		}
		System.out.println(loan+"금액을 대출 해줍니다.");
		System.out.println("보유 금액 : "+totalmoney);
		totalmoney-=loan;
		money+=loan;
	}

}
