package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		
		
		//while 문을 사용하는 경우
		/*
		 * //input = scanner.nextInt();
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}*/
			
		
		//do-while 문을 사용하는 경우
		do {
			input = scanner.nextInt();
			sum += input;
		} while(input != 0);
		
		System.out.println(sum);
	}

}
