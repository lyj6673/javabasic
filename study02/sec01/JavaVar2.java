package kr.or.ddit.study02.sec01;

//클래스 블록 시작
public class JavaVar2 {
	int c=10;
	// 메인 메소드 블록 시작
	public static void main(String[] args) {
		int a=10;
		
		int b=5;
		// 1번 블록 시작
		{
			b=7;
			System.out.println(a);
		}
		// 1번 블록 끝
		System.out.println(b);
		
		int d=8;
		
		//2번 블록 시작
		{
			// 사용 가능한 변수 d
			int e=10;
			{
				// 사용 가능한 변수 d e
				int f=12;
				// 사용 가능한 변수 d e f
			}
			// 사용 가능한 변수 d e
			
		}
		// 사용 가능한 변수 d
		
		
		//2번 블록 끝
		
	// 메인 메소트 블록 종료
	}

	// 메소드1 블록 시작
	public void method1() {
		int a=5;
		System.out.println(c);
	// 메소드1 블록 종료
	}
// 클래스 블록 종료
}
