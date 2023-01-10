package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		System.out.println("java: "+System.identityHashCode(java));
		System.out.println("android: "+System.identityHashCode(android));
		java = java.concat(android);
		
		System.out.println("java: "+ System.identityHashCode(java));
		System.out.println(java);
	}

}
