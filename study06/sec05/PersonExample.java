package kr.or.ddit.study06.sec05;

import java.util.Random;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "이수현";
		person.year = 2023;
		
		Person person2 = new Person();
		person2.name = "장영원";
		person2.year = 2024;
		
		System.out.println(person);
		System.out.println(person2);
		
		StaticTest.method3();
//		Arrays.toString(null);
//		new Random().nextInt(50);
	}

}
