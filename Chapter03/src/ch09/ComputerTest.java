package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		//Computer computer = new Computer();//추상 클래스는 new 인스턴스화 할 수 없다.
		desktop.display();
	}
}
