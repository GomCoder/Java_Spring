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
		
		//T�� ���� Extends�� ���� ������ ������ �ִ�.
		//GenericPrinter<Water> water = new GenericPrinter<Water>();
		
	}
}
