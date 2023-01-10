package ch01;

class OutClass2 {
	private int num2 = 10;
	private static int sNum = 20;
	private InClass2 inClass2;
	
	public OutClass2() {
		inClass2 = new InClass2(); //내부 클래스 생성
		
	}
	
	class InClass2 {
		int inNum2 = 100;
		//static int sInNum2 = 200; //에러 남
		
		void inTest() {
			System.out.println("OutClass num = " + num2 + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum2 + "(내부 클래스의 인스턴스 변수)");			
		}
		//static void sTest(); //에러 남 		
	}
	
	public void usingClass( ) {
		inClass2.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
	}
	
	static class InStaticClass { //정적 내부 클래스
		int inNum2 = 100;
		static int sInNum = 200;
		
		void inTest() { //정적 클래스의 일반 메서드
			//num2 += 10; 외부 클래스의 인스턴스 변수를 사용할 수 없음
			System.out.println("InStaticClass inNum = " + inNum2 + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
		
		static void sTest()  { //정적 클래스의 Static 메서드
			//num += 10; 외부 클래스의 인스턴스 변수는 사용할 수 없음
			//InNum += 10; 내부 클래스의 인스턴스 변수는 사용할 수 없음
			
			System.out.println("OutClass sNum =  " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}		
	}
}


public class InnerTest2 {

	public static void main(String[] args) {
		OutClass2 outClass2 = new OutClass2();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass2.usingClass(); //내부 클래스 기능 호출 
		System.out.println();
		
		OutClass2.InClass2 inClass2 = outClass2.new InClass2(); //외부 클래스를 이용하여 내부 클래스 생성
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass2.inTest();
		
		
		System.out.println("--------------정적 내부 클래스-----------------");
		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
		OutClass2.InStaticClass.sTest();
		

	}

}
