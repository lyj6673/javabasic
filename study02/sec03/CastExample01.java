package kr.or.ddit.study02.sec03;

public class CastExample01 {
	public static void main(String[] args) {
		// 국 영 수 점수 3개를 변수 선언 및 저장 후
		// 총점 평균을 구하시오.
		
		int k=40, e=80, m=73;
		int sum = k+e+m;
		double avg = sum/3.0;
		
		System.out.println("총점 : "+sum+" 평균 : "+avg);
		
		int i1 = (int)avg;
		System.out.println(i1);
		
		int i2 = (int)(avg*10);
//		int i2 = (int)avg*10;
		
		avg = i2/10.0;
		System.out.println(avg);
	}

}
