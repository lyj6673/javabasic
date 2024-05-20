package kr.or.ddit.homework.home12;

import java.util.Random;

public class Deck {
	boolean debug = true;
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.process();
	}
	
	public void process() {
		Card[] cardList = cardList();
		if(debug) {
			System.out.println("===============초기 카드===========");
			print(cardList);
		}
	
		cardList = shuffle(cardList);
		if(debug) {
			System.out.println("===============섞은 카드===========");
			print(cardList);
		}
	
//		 카드 섞은 후 첫번째 카드 내카드
		Card myCard = cardList[0];
		
		Card comCard = comCard(cardList);
		
		// 승패 및 카드 출력
		boolean winChk = winChk(comCard, myCard);
		System.out.println("내 카드 : "+myCard);
		System.out.println("컴퓨터 카드 : "+comCard);
		if(winChk)System.out.println("이겼습니다");
		else System.out.println("졌습니다");
	}
	
	public void print(Card[] cardList) {
		for (int i=0; i<cardList.length ; i++) {
			if(i%13 ==0 && i!=0) {
				System.out.println();
			}
			System.out.print(cardList[i]+"\t");
		}
		System.out.println();
	}
	
	

	// 컴퓨터 카드 랜덤으로 뽑기   1에서 52까지
	public Card comCard(Card[] cardList) {
		int r = new Random().nextInt(cardList.length);
		return cardList[r];
	}
	
	/*
	 *  내카드랑 컴퓨터 카드랑 비교해서 승패 비교하기.
	 */
	public boolean winChk(Card com, Card my) {
		if(my.num>com.num)return true;
		else return false;
	}
	
	
	/*
	 *  카드 섞기
	 */
	public Card[] shuffle(Card[] cardList) {
		for(int i=0;i<10000;i++) {
			for(int j=0;j<cardList.length;j++) {
				int r = new Random().nextInt(cardList.length);
				Card temp = cardList[j];
				cardList[j] = cardList[r];
				cardList[r] = temp;
			}
		}
		
		return cardList;
	}
	
	public Card[] cardList() {
		Card[] cardList = new Card[52];
		int cur =0;
		String[] types = {"♠", "◆","♥","♣"};
		for (String type : types) {
			for(int i=1; i<=13; i++) {
				Card card = new Card(i, type);
				cardList[cur++] = card; 
			}
		}
		return cardList;
	}
	
	
}
