package kr.or.ddit.study02.sec03;

public class CastExample05 {

	public static void main(String[] args) {
//		//
//		
//		int i1 = 20;
//		int i2 = 24;
//		String s = ""+i1+i2;
//		System.out.println(s);
//		
		//String -> double
		//소수점 한자리 표기
//		String s3 = "314.123";
//		double d3 = Double.valueOf(s3);
//	    int i3 = (int)(d3*10);
//	    d3 = i3/10.0;
//				System.out.println(d3);
				
		//String 8개 변수를 선언하고
		//각각을 알맞는 기본타입으로 변환 해보기.
//		String s1 = 'abcdef';
		
		//int num1, num2 값을 선언 후
		//num1 나누기 num2 값에 1000을 곱한 값을 곱한 정수 부분을 출력하시오.
		// 결과값 ex) 3 2 -> 1500
		
		int num1=3;
		int num2=2;
//		int result = (int)(((double)num1/num2)*1000);
		int result = 1000*num1/num2;
				System.out.println(result);

	}

}
