package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		Passenger passenger = new Passenger("Edward", 20000);
		Taxi taxi = new Taxi("�� ���� ���");
		
		passenger.takeTaxi(taxi);
		
		passenger.showInfo();
		taxi.showTaxiInfo();	
	}
}
