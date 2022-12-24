package ch17;

public abstract class Decorator extends Coffee{ //상속을 하기 위한 상위 클래스로만 사용함
	Coffee coffee;

	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();		
	}

}
