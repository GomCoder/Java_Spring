package ch11;

public interface Calc {
	//상수 정의
	double PI = 3.14;
	int ERROR = -99999999;
	//사칙연산을 수행하는 인터페이스
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

}
