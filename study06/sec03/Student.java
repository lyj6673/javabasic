package kr.or.ddit.study06.sec03;

public class Student {
	// 국적, 반호수, 이름 ,나이
	
	String nation;
	String roomNo;
	String name;
	int age;
	
	public Student(String nation,String roomNo,String name,int age) {
		this.nation = nation;
		this.roomNo = roomNo;
		this.name = name;
		this.age = age;
	}
	
	public Student(String roomNo,String name,int age) {
//		this.nation = "한국";
//		this.roomNo = roomNo;
//		this.name = name;
//		this.age = age;
		this("한국",roomNo,name,age);
	}
	
	public Student(String name,int age) {
//		this.nation = "한국";
//		this.roomNo = "405호";
//		this.name = name;
//		this.age = age;
		this("405호", name, age);
	}

	@Override
	public String toString() {
		return "Student [nation=" + nation + ", roomNo=" + roomNo + ", name=" + name + ", age=" + age + "]";
	}

}
