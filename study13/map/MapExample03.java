package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MapExample03 obj = new MapExample03();
		obj.process();

	}
	List<Map<String, String>> list;
	public void process() {
		list = dataInput();
		
		Map<String, String> numList = new HashMap();
		for (Map<String, String> map : list) {
			String carNo = map.get("차량번호");
			numList.put(carNo,"");
		}
		Set keySet = numList.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String carNo = it.next();
			System.out.println(carNo+" : "+result(carNo));
		}
	}
	
	public int result(String carNum) {
		// 주차 요금 계산
		// 주차 시간 총합 구하기
		int min = getMin(carNum);
		// 주차 요금 계산하기
		return pay(min);
	}
	
	
	public int pay(int min) {
		//기본요금 5000, 기본 시간 180
		//단위 시간 10분, 단위 요금 600
		if(min<=180) return 5000;		
		
			return 5000+(min-180+9)/10*600;
		
	}
	
	public int time2Int(String time) {
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		return hour*60+min;
	}
	
	
	public int getMin(String carNum) {
		int temp =0;
		int sum =0;
		for(Map<String, String> map : list) {
			String cn = map.get("차량번호");
			String time = map.get("시각");
			String inout = map.get("내역");
			if(!carNum.equals(cn))continue;
			System.out.println(map);
			if(inout.equals("입차")) {
				temp = time2Int(time);
			}
			if(inout.equals("출차")) {
				int park = time2Int(time) - temp;
				sum+=park;
				
			}
		}
		return sum;
	}
	public List<Map<String, String>> dataInput(){
		//    시각        차량번호         내역
		//   05:34   5961           입차
		//   06:00   0000           입차
		//   06:34   0000           출차
		//   07:59   5961           출차
		//   07:59   0148           입차
		//   18:59   0000           입차
		//   19:09   0148           출차
		//   22:59   5961           입차
		//   23:00   5961           출차
		//   23:00   0000           출차
		List<Map<String, String>> l = new ArrayList<Map<String, String>>();
		HashMap m1 = new HashMap();
		m1.put("시각","05:34");
		m1.put("차량번호","5961");
		m1.put("내역","입차");
		
		HashMap m2 = new HashMap();
		m2.put("시각","06:00");
		m2.put("차량번호","0000");
		m2.put("내역","입차");
		
		HashMap m3 = new HashMap();
		m3.put("시각","06:34");
		m3.put("차량번호","0000");
		m3.put("내역","출차");
		
		HashMap m4 = new HashMap();
		m4.put("시각","07:59");
		m4.put("차량번호","5961");
		m4.put("내역","출차");
		
		HashMap m5 = new HashMap();
		m5.put("시각","07:59");
		m5.put("차량번호","0148");
		m5.put("내역","입차");
		//
		HashMap m6 = new HashMap();
		m5.put("시각","18:59");
		m5.put("차량번호","0000");
		m5.put("내역","입차");
		
		HashMap m7 = new HashMap();
		m6.put("시각","19:09");
		m6.put("차량번호","0148");
		m6.put("내역","출차");
		
		HashMap m8 = new HashMap();
		m8.put("시각","22:59");
		m8.put("차량번호","5961");
		m8.put("내역","입차");
		
		HashMap m9 = new HashMap();
		m9.put("시각","23:00");
		m9.put("차량번호","5961");
		m9.put("내역","출차");
		
		HashMap m10 = new HashMap();
		m10.put("시각","23:00");
		m10.put("차량번호","0000");
		m10.put("내역","출차");
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		return l;
		
	}

}
