package kr.or.ddit.homework;

import java.util.Date;

public class Homework01 {
	public static void main(String[] args) {
		Date date = new Date();
		
		//date.getTime()의 경우는
		//기준 시간으로부터 현재까지 지난시간이다.
		//time 단위는 ms이다. 1000ms = 1초
		long time = date.getTime();
		System.out.println(time);
	
		
		//기준일로부터 몇 년 몇 일 몇 시간 몇 분 몇 초가 지났습니다.
//		long sec = 1000;
//		long min = sec*60;
//		long hour = min*60;
//		long day = hour*24;
//		long year = day*365;
		
		long year = time/1000/60/60/24/365;
		long day = (time/1000/60/60/24)-(year*365);
		long hour = (time/1000/60/60)-(day*24)-(year*365*24);
		long min = (time/1000/60)-(hour*60)-(day*24*60)-(year*365*24*60);
		long sec = (time/1000)-(min*60)-(hour*60*60)-(day*24*60*60)-(year*365*24*60*60);
		
		
		System.out.println("기준일로부터 "+year+"년 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초가 지났습니다");
		
	}

}
