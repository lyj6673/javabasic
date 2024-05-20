package kr.or.ddit.study07.sec02;

public class AnimalExample {
	public static void main(String[] args) {
		Animal ani = null;
		
		int sel =1;
		
		if(sel == 1) ani = new Cat();
		if(sel == 2) ani = new Dog();
		
		ani.cry();
		System.out.println("불빛 반짝 반짝");
		
		System.out.println("5초간 반복");
	}

}
