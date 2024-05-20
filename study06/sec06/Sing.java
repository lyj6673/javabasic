package kr.or.ddit.study06.sec06;

public class Sing {
	//노래이름
	//가사
	//가수
	//작곡가
	//발매연도
	private String title;
	private String lyrics;
	private String singer;
	private String writer;
	private int year;
	
	public void setTitle(String title) {
		if(title.length()<1 || title.length()>20) {
			System.out.println("유효하지 않은 제목입니다");
			return;
		}
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setLyrics(String lyrics) {
		if(lyrics.length()<1 || lyrics.length()>10000) {
			System.out.println("유효하지 않은 가사입니다");
			return;
		}
		this.lyrics = lyrics;
	}
	
	public String getLyrics() {
		return lyrics;
	}
	
	public void setSinger(String singer) {
		if(singer.length()<1 || singer.length()>10) {
			System.out.println("유효하지 않은 제목입니다");
			return;
		}
		this.singer = singer;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setWriter(String writer) {
		if(writer.length()<1 || writer.length()>10) {
			System.out.println("유효하지 않은 제목입니다");
			return;
		}
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setYear(int year) {
		if(year<0 || year > 122) {
			System.out.println("유효하지 않은 나이입니다");
			return;
		}
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}

}
