package kr.or.ddit.study10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();
		obj.process();

	}
	public void process() {
		int[] num =  new int[5];
		System.out.println("실행1");
		
		try {
			for(int i=0; i<10;i++) {
				num[i] = sc.nextInt();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 범위를 벗어남");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
