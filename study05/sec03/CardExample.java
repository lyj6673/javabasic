package kr.or.ddit.study05.sec03;

public class CardExample {
	public static void main(String[] args) {
		CardExample ce = new CardExample();
		ce.card(Card.HANA);
	}
	
	
	
	public void card(String card) {
		if(card.equals("hana"))hana();
		if(card.equals("shinhan"))sinhan();
	}
	
	public void card(Card card) {
		if(card == Card.HANA)hana();
		if(card == Card.SHINHAN)sinhan();
	}
	
	private void hana() {
		System.out.println("하나 카드 연동");
		
	}
	
	private void sinhan() {
		System.out.println("신한 카드 연동");
		
	}
	

}
