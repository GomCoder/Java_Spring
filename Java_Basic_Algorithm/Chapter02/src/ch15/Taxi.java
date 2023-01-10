package ch15;

public class Taxi {
	String taxiCompany;
	int money;
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany + "택시 수입은 " + money + "원 입니다.");
	}
	
}
