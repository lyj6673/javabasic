package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class MemoryTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MemoryTest obj = new MemoryTest();
//		obj.method1();
		obj.method2();

	}
	
	public void method2() {
		int a=5;
		//1
		
		if(a==3) {
			int b=10;
			//2
		}else {
			int[] c = new int[10];
			//3
			c[1] = 10;
		}
		
		String[] d = {"a", "b", "c"};
		//4
		if(a==5) {
			int e =100;
			String f = d[0];
		}
		
		String g = d[2];
	}
	public void method1() {
		int a =10;
		int b=20;
		//1.
		
		{
			String c = "자바";
			//2.
			if(a==10) {
				String f = new String("자바");
				//3.
			}
		}
		
		String d = "자바";
		//4.
		int e = 8;
		//5.
	}

}
