package kr.or.ddit.study02.sec03;

public class CastExample03 {
	public static void main(String[] args) {
		String s1 = "abcdef";
		
		// String -> char
		
		char c1 = s1.charAt(5);
		System.out.println(c1);
		
		//char -> String
		char c2 ='1';
		char c3 ='1';
		String s2 = ""+c2+c3;
		System.out.println(s2);
	}

}
