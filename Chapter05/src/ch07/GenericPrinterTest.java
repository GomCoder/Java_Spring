package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		
		GenericPrinter<Powder> powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder1 = (Powder)powderPrinter.getMaterial();
		System.out.println(powder1);
		
		//T에 대한 Extends가 있지 않으면 제한이 있다.
		//GenericPrinter<Water> water = new GenericPrinter<Water>();
		
	}
}
