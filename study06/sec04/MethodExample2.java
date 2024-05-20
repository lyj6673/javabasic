package kr.or.ddit.study06.sec04;

import java.util.Arrays;

public class MethodExample2 {
	public static void main(String[] args) {
		MethodExample2 me = new MethodExample2();
		int i1 = me.method1();
		System.out.println("method1에서 받은 결과 값 :"+i1);
		double i2 = me.method2();
		System.out.println("method1에서 받은 결과 값 :"+i2);
		int[] array3 = me.method3();
		System.out.println("method1에서 받은 결과 값 :"+Arrays.toString(array3));
	}
	
	public int method1() {
		System.out.println("public double method1()");
		return 20;
	}
	
	public double method2() {
		System.out.println("public double method2()");
		return 10.5;
	}
	
	public int[] method3() {
		System.out.println("public double method3()");
		int[] arr = {1,2,3};
		return arr;
	}
	

}
