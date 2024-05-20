package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
	}
	
	public void method6() {
		Calendar cal = Calendar.getInstance();
	//	cal.add(Calendar.MONTH,  2);
//		cal.set(Calendar.MONTH, 2);
		
		Date date =cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date));
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		int last = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(last);
	}
	
	
	public void method5() {
		Date date = new Date();
		long time = date.getTime()+1000L*86400*100;
		Date date2 = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date2));
	}
	public void method4() {
		//String을 입력 받고 해당 날짜와 현재 날짜의 차이를 구하시오
		//ex 20240411 -> 14일
		String date_str = "20241022";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = sdf.parse(date_str);
			Date cur = new Date();
			
			long time = date.getTime() - cur.getTime();
			System.out.println(time/1000/86400);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		

	}
	public void method3() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date_str = "20240328";
		
			Date date;
			try {
				date = sdf.parse(date_str);
				System.out.println(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
	}
	public void method2() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String date_str = sdf.format(date);
		System.out.println(date_str);
	}
	public void method1() {
		Date date = new Date();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date date2 = new Date();
		System.out.println(date2);
		
		long time = date2.getTime() - date.getTime();
		System.out.println(time);
	}

}
