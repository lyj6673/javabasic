package kr.or.ddit.homework;

import java.util.Arrays;

public class HomeWork09 {
	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}
	
	public void process() {
		// 5명의 3과목 (국, 영, 수) 성적과 이름을 배열에 저장하고
		// 총점과 평균, 등수를 구하여 출력하시오.
		
		String[] stu = {"김정석","김민구","조하연","이병훈","서성배"};
		// 국 영 수 총점 평균 등수
		int[][] score = {
				{80,70,65,0,0,1},
				{90,85,90,0,0,1},
				{90,70,75,0,0,1},
				{65,75,70,0,0,1},
				{80,80,70,0,0,1},
		};
		
		//총점 계산하기
		//평균 계산
		
		for(int i=0; i<score.length;i++) {
			score[i][3]= score[i][0]+score[i][1]+score[i][2];
			score[i][4] = (score[i][3])/3;
		}
		
		
		//등수 구하기
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score.length;j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}

		}
		
		//정렬하기
		int[] temp = new int[score.length+1];
		String temp2 = "";
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score.length;j++) {
				if(score[i][5]<score[j][5]) {
					for(int k=0;k<score.length+1;k++) {
						temp[k] = score[i][k];
						score[i][k] = score[j][k];
						score[j][k] = temp[k];						
					}
					temp2 = stu[i];
					stu[i] = stu[j];
					stu[j] = temp2;
				}
			}

		}
		
		//출력하기
		for(int i=0; i<score.length;i++) {
			System.out.println(stu[i]+"\t"+Arrays.toString(score[i]));
		}
	}

}
