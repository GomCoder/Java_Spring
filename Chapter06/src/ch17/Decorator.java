package ch17;

public abstract class Decorator extends Coffee{ //����� �ϱ� ���� ���� Ŭ�����θ� �����
	Coffee coffee;

	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();		
	}

}
