package ch02;

public class VIPCustomer extends Customer{
	double saleRatio;
	private int agentID;
	
	
	public VIPCustomer() {		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";//오류 발생 private이기 때문에 접근 X protected 로 수정
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID(){
		return agentID;
	}
	
}
