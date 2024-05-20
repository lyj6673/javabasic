package kr.or.ddit.study06.sec05;

import java.util.Date;

public class SearchExample {
	public static void main(String[] args) {
		Date d1 = new Date();
		SearchEngine se1 = SearchEngine.GetInstance();
		SearchEngine se2 = SearchEngine.GetInstance();
		SearchEngine se3 = SearchEngine.GetInstance();
		SearchEngine se4 = SearchEngine.GetInstance();
		SearchEngine se5 = SearchEngine.GetInstance();
		Date d2 = new Date();
		
		System.out.println(d2.getTime()-d1.getTime());
	}
	

}
