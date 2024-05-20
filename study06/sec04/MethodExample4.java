package kr.or.ddit.study06.sec04;

public class MethodExample4 {
	public static void main(String[] args) {
		MethodExample4 me = new MethodExample4();
		int[] array = {1,2,3,4,5};
		me.addArray(array);
		int[] array2 = {1,2,3};
		me.addArray(array2);
	}
	// 배열 값 더한 결과값 리턴
	public int addArray(int[] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}

}
