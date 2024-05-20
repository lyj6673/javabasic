package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();

	}	
	Product[] prodList = new Product[100];
	int cur = 0;
	public void process() {
		while(true) {
		// 1. 관리자
		// 2. 회원
		System.out.println("1. 관리자 2. 회원");
		int sel = sc.nextInt(); 
		if(sel == 1) admin();
		if(sel == 2) member();
		if(sel == 3) break;
		}
	}
	public HomeWork15() {
		Product prod1 = new Product();
		prod1.name = "삼각김밥";
		prod1.price = 1000;
		prodList[cur++] = prod1;
		
		Product prod2 = new Product();
		prod2.name = "커피";
		prod2.price = 3000;
		prodList[cur++] = prod2;
	}
	
	public void member() {
		// 1. 상품 구매  
//		      -> 상품 리스트 출력후 
//		                 상품번호 선택 
//		                 상품 수량 입력 => 상품 가격 * 상품 수량 금액 출력 하기.       
		for(int i=0;i<cur;i++) {
			System.out.println(i+" : "+prodList[i]);
		}
		System.out.println("상품번호 입력");
		int num = sc.nextInt();
		System.out.println("상품 수량 입력");
		int count = sc.nextInt();
		
		System.out.println("상품의 가격은 "+prodList[num].price*count);
		
		
		// 2. 홈
		process();
	}
	
	public void admin() {
		// 1. 상품 등록
		// 2. 상품 삭제
		// 3. 상품 변경
		// 4. 상품 리스트
		
		System.out.println("1. 상품등록 2. 상품삭제 3. 상품변경 4. 상품리스트");
		int sel = sc.nextInt(); 
		if(sel == 1) addProd();
		if(sel == 2) removeProd();
		if(sel == 3) updateProd();
		if(sel == 4) printProd();
		
		// 5. 홈
		process();
	}
	public void addProd() {
		//1. 회원 가입
		System.out.println("상품명을 입력하세요: ");
		String name = sc.next();
		System.out.println("가격을 입력하세요: ");
		int price = sc.nextInt();
		Product product = new Product();
		product.name = name;
		product.price = price;
		prodList[cur++] = product;
	}
	public void removeProd() {
		printProd();
		System.out.println("수정할 상품번호 입력");
		int num = sc.nextInt();
		if(num>cur) {
			System.out.println("잘못입력하셨습니다");
			return;
		}
		int add = 0;
		Product[] temp = new Product[100];
		for(int i=0; i<cur; i++) {
			if(i==num) {
				add=1;
			}
			temp[i]= prodList[i+add];
		}
		prodList = temp;
		cur--;
	}
	public void updateProd() {
		printProd();
		System.out.println("수정할 회원번호 입력");
		int num = sc.nextInt();
		if(num>cur) {
			System.out.println("잘못입력하셨습니다");
			return;
		}
		Product product = prodList[num];
		System.out.println("상품명을 입력하세요: ");
		String name = sc.next();
		System.out.println("가격을 입력하세요: ");
		int price = sc.nextInt();
		product.name = name;
		product.price = price;
        printProd();
		
	}
	public void printProd() {
		for(int i=0;i<cur;i++) {
			System.out.println(i+" : "+prodList[i].toString());
		}
	}
	
}
class Product{
	String name;
	int price;
	@Override
	public String toString() {
		return "상품 [상품명 = " + name + ", 가격 = " + price + "]";
	}
	
}



