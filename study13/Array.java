package kr.or.ddit.study13;

public class Array {
	String[] list;
	int cur =0;
	
	Array(){
		list = new String[10];
	}
	Array(int length) {
		list = new String[length];
	}
	
	public void add(String str) {
		if(cur == list.length) {
			String[] temp = new String[list.length+10];
			System.arraycopy(list, 0, temp, 0, list.length);
			list=temp;
		}
		list[cur++] = str;
	}
	
	public String remove(int index) {
		String[] temp = new String[list.length];
		String remove = list[index];
		int add= 0;
		for(int i=0;i<temp.length;i++) {
			if(i==index)add=1;
			if(i+add == temp.length-1)break;
			temp[i]= list[i+add];
		}
		list=temp;
		
		return remove;
	}
	
	public String get(int index) {
		return list[index];
	}
	
	public int size() {
		return cur;
	}

}
