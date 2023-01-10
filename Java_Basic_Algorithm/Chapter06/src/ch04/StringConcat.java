package ch04;


/*일반적인 객체지향 방식으로 프로그래밍하는 방법
public interface StringConcat {

	public void makeString(String s1, String s2);
}
*/

//람다식을 이용한 함수형 프로그래밍 방법
@FunctionalInterface
public interface StringConcat {

	public void makeString(String s1, String s2);
}