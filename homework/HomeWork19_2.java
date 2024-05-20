package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HomeWork19_2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork19_2 obj = new HomeWork19_2();
		obj.process();
		
	}
	List<Map<String,String>> productList = new ArrayList();
	public void process() {
		while(true) {
			System.out.println("1. 관리자 2. 상품  3. 종료");
			int sel = sc.nextInt(); 
			if(sel == 1) admin();
			if(sel == 2) Prod();
			if(sel == 3) break;
			}
	}
	public void Prod() {
		printProd();
		
		System.out.println("상품번호 입력");
		int num = sc.nextInt();
		System.out.println("상품 수량 입력");
		int count = sc.nextInt();
		
		Map<String, String> product = productList.get(num);
		
			String name = product.get("상품명");
			int price = count * Integer.parseInt(product.get("가격"));
		
		System.out.println("상품의 가격은 "+product.get("상품")+price);
	}
	
	public void admin() {
		while(true) {
			System.out.println("1. 상품등록 2. 상품삭제 3. 상품변경 4. 상품리스트  5.나가기");
			int sel = sc.nextInt(); 
			if(sel == 1) addProd();
			if(sel == 2) removeProd();
			if(sel == 3) updateProd();
			if(sel == 4) printProd();
			if(sel == 5) process();
		}
		
	}
	
	public void addProd() {
		Map<String, String> product = new HashMap();
		System.out.println("상품명을 입력하세요: ");
		String name = sc.next();
		System.out.println("가격을 입력하세요: ");
		String price = sc.next();

		product.put("상품", name);
		product.put("가격", price);
		productList.add(product);
		
		admin();
		
	}
	
	public void removeProd() {
		System.out.println("삭제할 상품 번호 입력");
		int num = sc.nextInt();
		productList.remove(num);
		printProd();
		
		admin();
	}
	
	public void updateProd() {
		printProd();
		System.out.println("변경할 상품  번호 입력");
		int num = sc.nextInt();
		Map<String, String> product = productList.get(num);
		
		System.out.println("상품명을 입력하세요: ");
		String name = sc.next();
		System.out.println("가격을 입력하세요: ");
		String price = sc.next();

		product.put("상품", name);
		product.put("가격", price);
		
		admin();
	
	}
	
	public void printProd() {
		int i= 0;
		for(Map<String, String> map : productList) {
			System.out.println(i+++"\t"+map.get("상품")+"\t"+map.get("가격"));
		}
	}
	
	
	

	

}
