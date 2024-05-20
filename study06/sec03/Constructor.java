package kr.or.ddit.study06.sec03;

public class Constructor {
	public static void main(String[] args) {
		Constructor c = new Constructor("양형운");
		System.out.println(c.name);
		
		Constructor c2 = new Constructor();
		c2.name = "홍길동";
	}

	//기본 생성자
	public Constructor() {
		System.out.println("기본 생성자");
	}
	String name;
	
	public Constructor(String name) {
		System.out.println("파라미터가 있는 생성자");
		this.name=name;
	}
}
