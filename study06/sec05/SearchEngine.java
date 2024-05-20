package kr.or.ddit.study06.sec05;

public class SearchEngine {
	private static SearchEngine instance;

	private SearchEngine() {
		System.out.println("파일 리딩중");
		for(int i=0;i<10; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static SearchEngine GetInstance() {
		if (instance == null) {
			instance = new SearchEngine();
		}
		return instance;
	}


}
