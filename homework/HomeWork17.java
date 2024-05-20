package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork17 hw = new HomeWork17();
		hw.process();
	}
	
	Calendar cal = Calendar.getInstance();
	public void process() {
		while(true) {
			
			System.out.println("<이전달\t\t"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월\t\t다음달>");
			System.out.println("=================================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("=================================================");
			int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			cal.set(Calendar.DATE,1);
			int week = cal.get(Calendar.DAY_OF_WEEK);
			for(int i=0;i<week-1;i++) System.out.print("\t");
			for(int i=1; i<=last; i++) {
				System.out.print(i+"\t");
				int week_cur = cal.get(Calendar.DAY_OF_WEEK);
				if(week_cur ==7)System.out.println();
				if(i!=last)cal.add(Calendar.DATE, 1);	
			}
			String input = sc.next();
			if(input.equals("<"))cal.add(Calendar.MONTH,-1);
			if(input.equals(">"))cal.add(Calendar.MONTH,+1);
		}
	}

}
