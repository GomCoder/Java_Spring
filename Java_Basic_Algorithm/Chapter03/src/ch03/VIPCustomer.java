package ch03;

public class VIPCustomer extends Customer{
	
	

	double saleRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {		
		super(0, "no-name");
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";//���� �߻� private�̱� ������ ���� X protected �� ����
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {//default ������ 
		super(customerID, customerName);
		customerGrade ="VIP";		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID(){
		return agentID;
	}
	
}
