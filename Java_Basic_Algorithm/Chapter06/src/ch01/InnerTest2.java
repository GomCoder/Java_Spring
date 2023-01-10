package ch01;

class OutClass2 {
	private int num2 = 10;
	private static int sNum = 20;
	private InClass2 inClass2;
	
	public OutClass2() {
		inClass2 = new InClass2(); //���� Ŭ���� ����
		
	}
	
	class InClass2 {
		int inNum2 = 100;
		//static int sInNum2 = 200; //���� ��
		
		void inTest() {
			System.out.println("OutClass num = " + num2 + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + inNum2 + "(���� Ŭ������ �ν��Ͻ� ����)");			
		}
		//static void sTest(); //���� �� 		
	}
	
	public void usingClass( ) {
		inClass2.inTest(); //���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
	
	static class InStaticClass { //���� ���� Ŭ����
		int inNum2 = 100;
		static int sInNum = 200;
		
		void inTest() { //���� Ŭ������ �Ϲ� �޼���
			//num2 += 10; �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			System.out.println("InStaticClass inNum = " + inNum2 + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
		}
		
		static void sTest()  { //���� Ŭ������ Static �޼���
			//num += 10; �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			//InNum += 10; ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			
			System.out.println("OutClass sNum =  " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
		}		
	}
}


public class InnerTest2 {

	public static void main(String[] args) {
		OutClass2 outClass2 = new OutClass2();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass2.usingClass(); //���� Ŭ���� ��� ȣ�� 
		System.out.println();
		
		OutClass2.InClass2 inClass2 = outClass2.new InClass2(); //�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass2.inTest();
		
		
		System.out.println("--------------���� ���� Ŭ����-----------------");
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼��� ȣ��");
		OutClass2.InStaticClass.sTest();
		

	}

}
