package ch06;

public class Customer {
	protected int customerID; //�� ���̵�
	protected String customerName; //�� �̸�
	protected String customerGrade; //�� ���
	
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

	int bonusPoint; //���ʽ� ����Ʈ
	double bonusRatio; //���ʽ� ����Ʈ ���� ����
	
	/*
	public Customer() {		//�Ϲ� ���� ��� ������, ���Ž� 1% ���ʽ� ����Ʈ ����
		customerGrade ="SILVER";		
		bonusRatio = 0.01;		
		System.out.println("Customer() ������ ȣ��");
	}
	*/
	
	public Customer(int customerID, String customerName) { //default ������ 
		customerGrade ="SILVER";		
		bonusRatio = 0.01;
		this.customerID = customerID;
		this.customerName = customerName;  
	}
	
	public int calcPrice(int price) { //��ǰ ���Ž� ����Ǵ� ���ε� ����
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() { //���� ���� ���
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}	
	
	
}
