package ch15;

public class Passenger {
	String passengerName;
	int money;
	
	public Passenger(String passengerName, int money) {
		this.passengerName = passengerName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(passengerName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
