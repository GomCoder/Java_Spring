package ch07;

public class Fibonacci {

	int[] value;
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		value = new int[number];
	}
	
	
	//1. ��� �Լ��� ����� ���
	public int fibonacciRecursive(int n) {
		if (n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	//2. �ݺ���(for��)�� ����� ���
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
	
	
	//3.�޸������̼��� ����� ���(���� ���α׷���)
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
		System.out.println("��� �Լ� ��� ���: " + result);
		
		result = fib.fibonacciIterator(10);
		System.out.println("�ݺ��� ��� ���: " + result);
		
		result = fib.fibonacciMemo(10);
		System.out.println("�޸������̼� ��� ���: " + result);
		
	}

}
