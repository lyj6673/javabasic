package kr.or.ddit.study06.sec06;

public class SingExample {
	public static void main(String[] args) {
		Sing s1 = new Sing();
		
		s1.setTitle("나는 아픈 건 딱 질색이니까");
		s1.setLyrics("오늘도 아침엔 입에 빵을 물고\r\n"+
					"똑같이 하루를 시작하고 ");
		s1.setSinger("(여자)아이들");
		s1.setWriter("소연");
		s1.setYear(2024);
		
		System.out.println(s1.getTitle());
		System.out.println("가수 : "+s1.getLyrics());
		System.out.println("작곡가 : "+s1.getSinger());
		System.out.println("년도 : "+s1.getWriter());
		System.out.println("가사 : "+s1.getYear());
	}

}
