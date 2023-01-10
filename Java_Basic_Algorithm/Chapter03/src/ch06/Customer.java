package ch06;

public class Customer {
	protected int customerID; //고객 아이디
	protected String customerName; //고객 이름
	protected String customerGrade; //고객 등급
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	int bonusPoint; //보너스 포인트
	double bonusRatio; //보너스 포인트 적립 비율
	
	/*
	public Customer() {		//일반 고객의 경우 생성자, 구매시 1% 보너스 포인트 적립
		customerGrade ="SILVER";		
		bonusRatio = 0.01;		
		System.out.println("Customer() 생성자 호출");
	}
	*/
	
	public Customer(int customerID, String customerName) { //default 생성자 
		customerGrade ="SILVER";		
		bonusRatio = 0.01;
		this.customerID = customerID;
		this.customerName = customerName;  
	}
	
	public int calcPrice(int price) { //물품 구매시 적용되는 할인된 가격
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() { //고객의 정보 출력
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}	
	
	
}
