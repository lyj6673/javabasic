package kr.or.ddit.study13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExample02 {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList();
		
		//랜덤으로 5개 값을 입력하고 출력하시오
		//5개의 값의 총합을 구하시오
		for(int i=0;i<5;i++) {
			list.add(new Random().nextInt(10));
		}
		int sum=0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			sum+=list.get(i);
		}
		System.out.println(sum);
	}

}
