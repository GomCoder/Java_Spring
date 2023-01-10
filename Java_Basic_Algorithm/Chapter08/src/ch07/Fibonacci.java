package ch07;

public class Fibonacci {

	int[] value;
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		value = new int[number];
	}
	
	
	//1. 재귀 함수를 사용한 방법
	public int fibonacciRecursive(int n) {
		if (n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	//2. 반복문(for문)을 사용한 방법
	public int fibonacciIterator(int n) {
		int ppre = 0;
		int pre = 1;
		int current = 0;
		
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		for(int i = 2; i <= n; i++) {
			current = ppre + pre;
			ppre = pre;
			pre = current;
		}
		return current;
	}
	
	
	//3.메모이제이션을 사용한 방법(동적 프로그래밍)
	public int fibonacciMemo(int n) {
		value[0] = 0;
		value[1] = 1;
		
		if(n == 0) {
			return value[0];
		}
		if(n == 1) {
			return value[1];
		}
	
		int i;
		for(i = 2; i <= n; i++) {
			value[i] = value[i-1] + value[i-2];
		}
		
		return value[i-1];
	}
	
	
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(100);
		
		int result = fib.fibonacciRecursive(10);
		System.out.println("재귀 함수 사용 결과: " + result);
		
		result = fib.fibonacciIterator(10);
		System.out.println("반복문 사용 결과: " + result);
		
		result = fib.fibonacciMemo(10);
		System.out.println("메모이제이션 사용 결과: " + result);
		
	}

}
