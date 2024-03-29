package ch17;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing(); 
		
		System.out.println();
		Coffee etiopiaMocha = new Mocha(new Latte(etiopiaCoffee));
		etiopiaMocha.brewing(); 
		
		System.out.println();
		Coffee keyaCoffee = new WhippingCream(new Mocha(new Latte(etiopiaCoffee)));
		keyaCoffee.brewing();		
	}
}
