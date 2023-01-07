package ch01;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		//값 저장 변수
		int min = numbers[0];
		int max = numbers[0];
		
		//index 저장 변수
		int minPos = 0;
		int maxPos = 0;
		
		for(int i = 1; i < numbers.length; i++) {
			//가장 작은 값
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}			
			//가장 큰 값
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}			
		}
		
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");
	}

}
