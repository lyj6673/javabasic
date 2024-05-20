package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		// 일본 405 이름1, 20
		Student s1 = new Student("일본", "405호", "이름1", 20);
		System.out.println(s1);
		// 한국 406 이름2, 20
		Student s2 = new Student("406호", "이름2", 20);
		System.out.println(s2);
		// 한국 405 이름3, 20
		Student s3 = new Student("이름3", 20);
		System.out.println(s3);
		// 한국 405 이름4, 20
		Student s4 = new Student("이름4", 20);
		System.out.println(s4);
	}
}
