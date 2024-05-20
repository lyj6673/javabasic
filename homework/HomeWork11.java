package kr.or.ddit.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork11 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11 obj = new HomeWork11();
		obj.process();
	}
	
	public void process() {
		Member[] memList = new Member[100];
		int cur = 0;
		while(true) {
			System.out.println("1 회원 추가");
			System.out.println("2 종료");
			int sel = sc.nextInt();
			if(sel==1) {
				System.out.println("이름을 입력하세요: ");
                String name = sc.next();
                System.out.println("지역을 입력하세요: ");
                String region = sc.next();
                System.out.println("생년월일을 입력하세요 (900101-1): ");
                String regdate = sc.next();
                if(region.equals("대전")) {
                	// 지역이 대전이라면  파라미터 2개인 생성자 호출
                	Member mem = new Member(name, regdate);
                	memList[cur++] = mem;
                }
                // 지역이 대전이 아니라면 파라미터 3개인 생성자 호출
                else {
                	Member mem = new Member(name, region, regdate);
                	memList[cur++] = mem;
                }
                
			}
			if(sel == 2) {
				break;
			}
		}
		
		for(int i=0; i<cur; i++) {
			System.out.println(memList[i]);
		}
	}
}

class Member{
	// 이름, 지역, 생년월일(900101-1), 만나이 
	String name;
	String region;
	String regdate;
	int age;
	

	
	// 이름 지역 생년월일 생성자 
	public Member(String name, String region, String regdate) {
		try {
			this.name=name;
			this.region=region;
			this.regdate=regdate;
			// 나이 계산하기.
			Date date1 = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			// tokens[0] => 900101
			// tokens[1] => 1
			String tokens[] = regdate.split("-");
			
			String year="19";
			// 끝자리가 1, 2 인경우 19
			if(tokens[1].equals("1")||tokens[1].equals("2")) {
				year = "19";
			}
			else year = "20";
			// 끝자리가 3, 4 인경우 20 추가 할것
			Date date2 = sdf.parse(year+tokens[0]);
			// 태어난지 난 시간(단위 ms). 현재시간에서 태어난 연도 빼기
			long time = date1.getTime() - date2.getTime();
			this.age = (int)(time/1000/60/60/24/365.2422);
			

			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	

	



	@Override
	public String toString() {
		return "Member [이름=" + name + ", 지역=" + region + ", 생년월일=" + regdate + ", 만나이=" + age + "]";
	}







	// 이름 생년월일 생성자
	public Member(String name,String regdate) {
		this(name, "대전", regdate);
	}
	
}
