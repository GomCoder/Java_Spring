package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint  = 1000;		
		int price = customerLee.calcPrice(1000);
		
		System.out.println(customerLee.showCustomerInfo() + " ������ ����� ����: " + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint  = 10000;		
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + " ������ ����� ����: " + price); 
		
		Customer customerNO = new VIPCustomer(12345, "������");
		customerNO.bonusPoint = 10000;
		price = customerNO.calcPrice(1000);
		System.out.println(customerNO.showCustomerInfo() + " ������ ����� ����: " + price);
	}
}