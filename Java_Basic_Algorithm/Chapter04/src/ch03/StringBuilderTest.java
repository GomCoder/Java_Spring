package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println("java: "+System.identityHashCode(java));
		buffer.append(android);
		System.out.println("java: "+System.identityHashCode(java));
		String test = buffer.toString();
		System.out.println(test);
		
		
	}

}
