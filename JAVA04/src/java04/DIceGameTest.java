package java04;

import java.util.*;

class DiceGame { 
	int diceFace;
	int userGuess;
	
	private void RollDice() {
		diceFace = (int)(Math.random() * 6) + 1;
	}
	
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	private void checkUserGuess() {
		if(diceFace == userGuess)
			System.out.println("맞았습니다.");
		else
			System.out.println("틀렸습니다.");
	}
	public void startPlaying() {
		userGuess = getUserInput("예상값을 입력하시오 : ");
		RollDice();
		checkUserGuess();
		
	}
}
public class DIceGameTest {
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}

}
