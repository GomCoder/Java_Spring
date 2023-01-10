package ch03;

public class VIPCustomer extends Customer{
	
	

	double saleRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {		
		super(0, "no-name");
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";//오류 발생 private이기 때문에 접근 X protected 로 수정
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {//default 생성자 
		super(customerID, customerName);
		customerGrade ="VIP";		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID(){
		return agentID;
	}
	
}
