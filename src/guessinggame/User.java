package guessinggame;

/**
 * Run the guessing Game
 * @author Charin Tantrakul
 */
public class User {
	public static void main (String[]arg){
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
