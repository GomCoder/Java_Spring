package ch16.gamelevel;

public class UltraSuperLevel extends PlayerLevel{

	@Override
	public void run() {	
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("아주 빨리 turn 합니다.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 특급자 레벨입니다. ******");
	}
	
}
