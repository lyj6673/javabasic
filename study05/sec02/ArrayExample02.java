package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
//		obj.method8();
		obj.method9();

	}
	public void method9() {
		int[][] arr1 = new int[5][5];
		//i가 짝수일 때 12345 i=0,2,4
		//i가 홀수일 때 54321 i=1,3
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr1.length; j++) {
//				if(i%2!=0)arr1[i][j]=i*5+5-j;
//				else arr1[i][j]= j+i*5+1;
//				System.out.print(arr1[i][j]+"\t");
//			}
//			System.out.println();
//		}
		int k =1;
		for(int i=0; i<arr1.length; i++) {
			if(i%2==0) {
				for(int j=0; j<arr1[i].length; j++) {
					arr1[i][j] = k++;
				}
			}else {
				for(int j=0; j<arr1[i].length; j++) {
					arr1[i][4-j] = k++;
				}
			}
		}
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
	public void method8() {
		// 1, 6, 11, 16, 21
		// 2, 7, 12, 17, 22
		// 3, 8, 13, 18, 23
		// 4, 9, 14, 19, 24
		// 5, 10, 15, 20, 25
		int[][] arr1 = new int[5][5];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				arr1[i][j]= j+i*5+1;
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	public void method7() {
		int[][] arr1 = new int[5][5];
		// 1, 2, 3, 4, 5
		// 6, 7, 8, 9, 10
		// 11, 12, 13, 14, 15
		// 16, 17, 18, 19, 20
		// 21, 22, 23, 24, 25
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				arr1[i][j]= j+i*5+1;
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void method6() {
		// 1차원 배열 건너 뛰기
		int[][] arr = new int[3][];
		
		int[] stu1 = new int[4];
		int[] stu2 = new int[5];
		int[] stu3 = new int[4];
		arr[0] = stu1;
		arr[1] = stu2;
		arr[2] = stu3;
		
	}
	public void method5() {
		
		//키보드로 돈을 입력 받아 화페단위별로 개수를 구하시오.
		//ex) 77550 -> 10000 7개 5000 1개 1000 2개 500 1개 50 1개
		
		int[] coin = {10000,5000,1000,500,100,50,10};
		int money = sc.nextInt();
		for(int i=0;i<coin.length;i++) {
			int num = money/coin[i];
			money =  money%coin[i];
			if(num==0) continue;
			System.out.print(coin[i]+"원"+num+"개"+"\t");
		}
		
	}
	public void method4() {
		//3명의 국영수 점수를 저장
		//각 학생의 이름을 a b c
		int[][] scores = {{80,75,87},
						  {88,90,91},
						  {58,96,77}};
		
		// a 학생의 국어 점수를 출력하시오
		int a_kor = scores[0][0];
		System.out.println("a 학생의 국어 점수 "+a_kor);
		
		// c 학생의 수학 점수를 출력하시오
		int c_meth = scores[2][2];
		System.out.println("c 학생의 수학 점수 "+c_meth);
		
		// 3학생의 국어 평균
		System.out.println("3학생의 국어 평균");
		for(int i=0; i<scores.length;i++) {
			int kor_cum = scores[i][0];
			double avg = (double)kor_cum/scores.length;
			System.out.print(avg+"\t");
			System.out.println();
		}
		
		// b 학생의 평균 점수
		System.out.println("b 학생의 평균 점수");
		for(int i=0; i<scores.length;i++) {
			int b_cum = scores[1][i];
			double b_avg = (double)b_cum/scores.length;
			System.out.print(b_avg+"\t");
			System.out.println();
		}
		
		// 전체 출력
		System.out.println("전체출력");
		for(int i=0; i<scores.length;i++) {
					
			for(int j=0; j<scores[i].length;j++) {
					
				System.out.print(scores[i][j]+"\t");
			}
		System.out.println();
		}
		
		
	}
	public void method3() {
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
//		int[] a1 = arr[0];
		for(int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	public void method2() {
		// 배열 복사
		// 깊은 복사, 얕은 복사
		// 얕은 복사(shallow copy)
		// 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 같이 변경됨.
		
		int[] source = {1,2,3,4,5};
		int[] target = source;
		
//		System.out.println("변경 전 ");
//		for(int s : source) System.out.println(s+"\t");
//		System.out.println();
//		
//		for(int t : source) System.out.println(t+"\t");
//		System.out.println();
//		
//		target[2] = 10;
//		System.out.println("변경 후 ");
//		for(int s : source) System.out.println(s+"\t");
//		System.out.println();
//		
//		for(int t : source) System.out.println(t+"\t");
//		System.out.println();
		
		// 깊은 복사 : 배열 공간을 별도로 확보
		// 1. 반복문 사용
		// 2. System.arraycopy()
		// 3. clone
		
		int[] des1 = new int[source.length];
		for(int i=0; i<source.length;i++) {
			des1[i] = source[i];
		}
//		System.out.println("변경 전 ");
//		for(int s : source) System.out.println(s+"\t");
//		System.out.println();
//		
//		for(int t : des1) System.out.println(t+"\t");
//		System.out.println();
//		
//		target[2] = 10;
//		System.out.println("변경 후 ");
//		for(int s : source) System.out.println(s+"\t");
//		System.out.println();
//		
//		for(int t : des1) System.out.println(t+"\t");
//		System.out.println();
		
		int[] des2 = new int[source.length];
//		System.arraycopy(source, 0, des2, 0, 5);
//		
//		System.out.println("변경 전 ");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();
//		
//		for(int t : des2) System.out.print(t+"\t");
//		System.out.println();
//		
		des1[2] = 10;
//		System.out.println("변경 후 ");
//		for(int s : source) System.out.print(s+"\t");
//		System.out.println();
//		
//		for(int t : des2) System.out.print(t+"\t");
//		System.out.println();
		
		int[] des3 = source.clone();
		
		System.out.println("변경 전 ");
		for(int s : source) System.out.print(s+"\t");
		System.out.println();
		
		for(int t : des3) System.out.print(t+"\t");
		System.out.println();
		
		des2[2] = 10;
		System.out.println("변경 후 ");
		for(int s : source) System.out.print(s+"\t");
		System.out.println();
		
		for(int t : des3) System.out.print(t+"\t");
		System.out.println();
		
	}
	public void method1() {
		// 각 타입별 초기화 값.
		// boolean : false
		// char : ' '. '\u0000'
		// byte, short, int, long : 0
		// float : 0,0f
		// double : 0.0
		
		// 참조 타입(reference type) : null
		
		char c = '\u0000';
		System.out.println(c);
	}

}
