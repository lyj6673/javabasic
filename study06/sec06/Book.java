package kr.or.ddit.study06.sec06;

public class Book {
	//책이름, 저자, 내용
	
	private String name;
	private String writer;
	private String story;
	
	public void setName(String name) {
		if(name.length()<1 || name.length()>20) {
			System.out.println("유효하지 않은 제목입니다");
			return;
		}
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setWriter(String writer) {
		if(writer.length()<1 || writer.length()>20) {
			System.out.println("유효하지 않은 제목입니다");
			return;
		}
		this.writer = writer;
	}
	public String getWriter() {
		return writer;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	

	
	

}
