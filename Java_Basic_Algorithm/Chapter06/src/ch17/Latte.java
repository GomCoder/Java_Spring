package ch17;

public class Latte extends Decorator{

	public Latte(Coffee coffee) { //���� Ŭ�������� Default �����ڰ� ���� ����
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
		
	}
}
