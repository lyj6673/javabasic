package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork13 {
	Scanner sc = new Scanner(System.in);
	int money = 100000;

	public static void main(String[] args) {
		HomeWork13 hw = new HomeWork13();
		hw.process();
	}
	
	public void process() {
		while(true) {
			System.out.println("1. 로또 구매");
			System.out.println("2. 종료");
			
			int sel = sc.nextInt();
			if(sel==1) {
				System.out.println("구입할 로또 금액");
				int buy = sc.nextInt();
				//buy > money 값보다 클 경우 구매 못한다는 메세지
				if(money<buy) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				//구매 할 경우 money에서 금액 차감.
				money-=buy;
				//구매한 로또와 이번회차 당첨 번호가 일치할 시 상금 지급
				int[][][] bundle = lottoBundle(buy);
				printBundle(bundle);
				System.out.println("        *이번회차 당첨번호*");
				int[] round = round();
				System.out.println(Arrays.toString(round));
				winCke(bundle,round);
				//상금 100000
				//로또 번호는 총 8개
				
			}
			if(sel==2) {
				break;
			}
		}
	}
		
	public void printBundle(int[][][] bundle) {
		for(int i=0; i<bundle.length;i++) {
			System.out.println("==================================");
			int[][] paper = bundle[i];
			for(int j=0; j<paper.length;j++) {
				System.out.println(Arrays.toString(paper[j]));
			}
			System.out.println("==================================");
		}
	}
	
	
	public int[][][] lottoBundle(int money){
		
		int papers = money/5000;
		if(money%5000!=0)papers++;
		
		int[][][] bundle = new int[papers][5][8];
		
		for(int i=0;i<bundle.length;i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000!=0) {
			bundle[bundle.length-1] = lottoPaper((money%5000)/1000);
		}
		return bundle;
	}
	
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][8];
		for(int i=0; i<paper.length;i++) {
			paper[i]=gererateLotto();
		}
		return paper;
		
	}
	
	
	public int[][] lottoPaper() {
		
		return lottoPaper(5);
	}
	
	public int[] gererateLotto(){
		int[] lotto = new int[8];
		
		for(int i=0; i<lotto.length;i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
		
	}
	
	// 이번 회차 로또 당첨 번호
	public int[] round() {
		 int[] round = gererateLotto();
		return round;
	}
	
	// 당첨 여부 확인
	public void winCke(int[][][] bundle,int[] round) {
		for(int i=0;i<bundle.length;i++) {
			for(int j=0;j<bundle[i].length;j++) {
				int cnt = 0;
				int[] paper = bundle[i][j];
				for(int k=0;k<paper.length;k++) {
					for(int l=0;l<round.length;l++) {
						if(paper[k]==round[l]) {
							cnt++;
						}
					}
					
				}
				if(cnt>=4) {
					System.out.println("4자리 이상 당첨");
					this.money+=100000;
					System.out.println("상금 10만원 적립되었습니다.");
					
				}
				
			}
		}
		
	}

}



