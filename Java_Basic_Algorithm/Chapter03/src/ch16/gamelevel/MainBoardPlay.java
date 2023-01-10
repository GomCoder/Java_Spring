package ch16.gamelevel;

public class MainBoardPlay {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgadeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgadeLevel(sLevel);
		player.play(3);	
	}
}
