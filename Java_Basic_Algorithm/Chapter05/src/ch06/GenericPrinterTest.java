package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		
		Powder p = 	powderPrinter.getMaterial();	
		System.out.println(p.toString());
		
		
		Plastic plastic = new Plastic();
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(plastic);
		
		Plastic pl = plasticPrinter.getMaterial();	
		System.out.println(pl.toString());
		
		//Ÿ���� ������ ���ϰ� �߷��Ͽ� ����ϴ� ���
		Powder powder1 = new Powder();
		GenericPrinter powderPrinter1 = new GenericPrinter<>();
		powderPrinter1.setMaterial(powder);
		
		Powder p1 = (Powder)powderPrinter1.getMaterial();	
		System.out.println(p1.toString());
		
		
	}
}
