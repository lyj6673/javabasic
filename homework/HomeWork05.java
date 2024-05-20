package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-1-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=row; j>0+i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 
		
		for(int i=0; i<row; i++) {
			for(int j=row; j>0+i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-1-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		int length = 5;
		for(int row=0; row<length; row++) {
			for(int space=0; space<row; space++) {
				System.out.println(" ");
			}
			for(int star =1; star<=(length-row-1)*2+1; star++) {
				System.out.println("*");
			}
			System.out.println();
		}
//		int row = sc.nextInt(); 
//		for(int i=0; i<row; i++) {
//			
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=row*2-1; j>(0+i)*2; j--) {
//				System.out.print("*");
//			}
//			
//			
//			System.out.println();
//
//		}
		
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
		int length = 5;
		for(int i=0; i<length; i++) {
			System.out.print("*");	
		}
		System.out.println();
		for(int i=1; i<length-1; i++) {
			System.out.println("*");
			for(int j=1;j<length-1;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			System.out.println();
		}
		for(int i=0; i<length; i++) {
			System.out.print("*");	
		}
		
	
		
	}
	
}