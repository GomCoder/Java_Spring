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
		
		//Stream 생성
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		
		//is는 소모되었기 때문에 다시 사용할 수 없다.
		//또 다른 연산을 수행하기 위해서는 다시 스트림을 생성해서 사용해야 한다.
		
		int sum = Arrays.stream(arr).sum();
		 
		System.out.println(sum);
		
	}
}
