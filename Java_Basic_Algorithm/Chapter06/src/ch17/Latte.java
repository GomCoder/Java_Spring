package ch17;

public class Latte extends Decorator{

	public Latte(Coffee coffee) { //상위 클래스에서 Default 생성자가 없기 때문
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
		
	}
}
