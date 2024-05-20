package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class LottoMethod {
	public static void main(String[] args) {
		LottoMethod lm =new LottoMethod();
		lm.process();
		
	}
	
	public void process() {
		int[][][] bundle = lottoBundle(13000);
		printBundle(bundle);
//		int[][] paper = lottoPaper();
//		for(int i=0; i<paper.length;i++) {
//			System.out.println(Arrays.toString(paper[i]));
//		}
		
	}
	public void printBundle(int[][][] bundle) {
		for(int i=0; i<bundle.length;i++) {
			System.out.println("==================================");
			int[][] paper = bundle[i];
			for(int j=0; j<paper.length;j++) {
//				System.out.println(Arrays.toString(lotto));
				System.out.println(Arrays.toString(paper[j]));
			}
			System.out.println("==================================");
		}
	}
	
	
	public int[][][] lottoBundle(int money){
		
		int papers = money/5000;
		if(money%5000!=0)papers++;
		
		int[][][] bundle = new int[papers][5][6];
		
		for(int i=0;i<bundle.length;i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000!=0) {
			bundle[bundle.length-1] = lottoPaper((money%5000)/1000);
		}
		return bundle;
	}
	
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for(int i=0; i<paper.length;i++) {
			paper[i]=gererateLotto();
		}
		return paper;
		
	}
	
	
	public int[][] lottoPaper() {
//		int[][] paper = new int[5][6];
//		for(int i=0; i<paper.length;i++) {
//			paper[i]=gererateLotto();
//		}
		return lottoPaper(5);
	}
	
	public int[] gererateLotto(){
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length;i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
		
	}
	public String arrayToString(int[] lotto) {
		String result = "[";
		for(int i=0; i<lotto.length;i++) {
			result+=lotto[i];
			if(i==lotto.length-1) {
				result += " ]";
			}else {
				result += " | ";
			}
		}
		
		return result;
	}
	
	public void sort(int[] lotto) {
		for(int i=0; i<lotto.length-1;i++) {
			for(int j=0;j<lotto.length-1;j++) {
				if(lotto[j]<lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
	}
	
	
}
