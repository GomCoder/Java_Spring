package ch06;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum = 127;
		//byte bnum = 128; //표현할 수 있는 숫자의 범위를 넘어섬
		
		System.out.println(bnum);
		
		//int num = 12345678900;//표현할 수 있는 숫자의 범위를 넘어섬
		//long lnum = 12345678900;
		long lnum = 12345678900L;
		
		System.out.println(lnum);
		
	}

}
