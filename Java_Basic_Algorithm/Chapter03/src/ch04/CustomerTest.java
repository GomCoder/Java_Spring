package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint  = 1000;		
		int price = customerLee.calcPrice(1000);
		
		System.out.println(customerLee.showCustomerInfo() + " 할인이 적용된 가격: " + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint  = 10000;		
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + " 할인이 적용된 가격: " + price); 
		
		Customer customerNO = new VIPCustomer(12345, "나몰라");
		customerNO.bonusPoint = 10000;
		price = customerNO.calcPrice(1000);
		System.out.println(customerNO.showCustomerInfo() + " 할인이 적용된 가격: " + price);
	}
}
