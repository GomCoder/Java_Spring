package ch04;


/*�Ϲ����� ��ü���� ������� ���α׷����ϴ� ���
public interface StringConcat {

	public void makeString(String s1, String s2);
}
*/

//���ٽ��� �̿��� �Լ��� ���α׷��� ���
@FunctionalInterface
public interface StringConcat {

	public void makeString(String s1, String s2);
}