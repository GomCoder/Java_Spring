package ch02;

public class VIPCustomer extends Customer{
	double saleRatio;
	private int agentID;
	
	
	public VIPCustomer() {		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";//���� �߻� private�̱� ������ ���� X protected �� ����
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID(){
		return agentID;
	}
	
}
