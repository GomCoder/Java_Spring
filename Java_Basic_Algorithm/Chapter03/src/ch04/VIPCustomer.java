package ch04;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {		
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";//오류 발생 private이기 때문에 접근 X protected 로 수정
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {//default 생성자 
		super(customerID, customerName);
		customerGrade ="VIP";		
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}	
	
	@Override
	public int calcPrice(int price) { //오버라이딩 하여 VIP 할인률 적용
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}


	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID(){
		return agentID;
	}
	
}
