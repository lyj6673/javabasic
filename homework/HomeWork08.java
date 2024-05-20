package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();

	}
	public void process() {
		//길이 45배열 선언 할것.
		int[] temp = new int[45];
		//각 배열에 1~45 값 입력
		for(int i=0;i<temp.length;i++) {
			temp[i]=i+1;
		}
		//배열 섞기
		
		for(int i=0;i<10000;i++) {
			for(int j=0;j<temp.length;j++) {
				int r = new Random().nextInt(temp.length);
				int temp2 = temp[j];
				temp[j] = temp[r];
				temp[r] = temp2;
			}
		}
		
		//길이 6배열 만들기
		int[] lotto = new int[6];
		//lotto 배열에 temp 값 복사
		System.arraycopy(temp,0,lotto,0,6);
		
		//lotto 배열 정렬
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length-1;j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp2 = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp2;
				}
			}
		}
		
		//출력
		for(int i=0;i<lotto.length;i++) {
			System.out.println(lotto[i]);
		}
	}

}
