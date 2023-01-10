package ch14;

public interface Calc {
	//상수 정의
	double PI = 3.14;
	int ERROR = -99999999;
	
	//사칙연산을 수행하는 인터페이스
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default 메서드
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	//정적 메서드
	static int total(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		}		
		myStaticMethod();
		return total;
	}
	
	
	//인터페이스 내부에서 사용되는 private 메서드
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
 }
