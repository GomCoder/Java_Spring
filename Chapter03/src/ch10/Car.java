package ch10;

public abstract class Car {	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() { //구현된 메서드 - 훅 메서드
		
	}
	
	final public void run() { //흐름이 정해져 있는 메서드
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
