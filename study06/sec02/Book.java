package kr.or.ddit.study06.sec02;

public class Book {
	
	//책 이름, 저자, 출판사, 출판일을 각각 필드로 만들기
	//BookExample class에서 Book 2개 생성 및 출력
	String name;
	String writer;
	String pub;
	String pubdate;
	@Override
	public String toString() {
		return "Book [제목=" + name + ", writer=" + writer + ", pub=" + pub + ", pubdate=" + pubdate + "]";
	}

}
