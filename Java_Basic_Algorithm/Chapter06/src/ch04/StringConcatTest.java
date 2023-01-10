package ch04;

public class StringConcatTest {
	
	
	/* 일반적인 객체지향 방식의 프로그래밍 방법
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";			
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
	}
	*/
	
	//람다식을 이용한 함수형 프로그래밍 방법
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString(s1, s2);	
		
		//내부적으로 익명 클래스가 생성되어 전달됨
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "...." + s2 );
						
			}			
		};
		
		concat2.makeString(s1, s2);
		
	}
}
