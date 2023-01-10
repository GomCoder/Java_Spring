package ch01;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	/*
	Runnable getRunnable(final int i) {
		
		final int num = 10;
				
		class MyRunnable implements Runnable{
			
			int localNum = 1000;
			
			@Override
			public void run() {
				
				//i = 50; 오류가 남, 가져다 출력하는 것은 사용 가능, 변경 불가, 메서드의 호출과 클래스의 생성 주기가 다르기 때문
				//num = 20;   컴파일러에서 자동적으로 final로 바꾸어 처리함(상수화됨)
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}			
		}
		return new MyRunnable();
	}
	*/
	
	
	//익명 내부 클래스 사용
	Runnable getRunnable(int i) {
		
		int num = 10;
				
		return new Runnable(){
			
			int localNum = 1000;
			
			@Override
			public void run() {
												
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}			
		};				
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable class");
		}			
	};		
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		 Outer2 out = new Outer2();
		 Runnable runner = out.getRunnable(100);
		 
		 runner.run();
		 
		 out.runnable.run();
	}
}
