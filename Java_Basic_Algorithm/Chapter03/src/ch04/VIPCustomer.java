package ch04;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {		
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";//���� �߻� private�̱� ������ ���� X protected �� ����
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {//default ������ 
		super(customerID, customerName);
		customerGrade ="VIP";		
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}	
	
	@Override
	public int calcPrice(int price) { //�������̵� �Ͽ� VIP ���η� ����
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
