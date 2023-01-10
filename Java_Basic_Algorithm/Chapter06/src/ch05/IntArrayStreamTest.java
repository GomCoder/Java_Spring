package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
	
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("-----Used Stream-----");
		
		//Stream ����
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		
		//is�� �Ҹ�Ǿ��� ������ �ٽ� ����� �� ����.
		//�� �ٸ� ������ �����ϱ� ���ؼ��� �ٽ� ��Ʈ���� �����ؼ� ����ؾ� �Ѵ�.
		
		int sum = Arrays.stream(arr).sum();
		 
		System.out.println(sum);
		
	}
}
