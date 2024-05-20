package kr.or.ddit.study06.sec06;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		if(name.length()<1 || name.length()>5) {
			System.out.println("유효하지 않은 이름입니다");
			return;
		}
		this.name = name;
	}
	
	
	
	public void setAge(int age) {
		if(age<0 || age > 122) {
			System.out.println("유효하지 않은 나이입니다");
			return;
		}
		this.age = age;
	}

}
