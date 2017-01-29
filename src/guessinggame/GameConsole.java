package guessinggame;
import java.util.Scanner;
/**
 * GameConsole of GuessingGame
 * @author Charin Tantrakul 
 */
public class GameConsole {
	Scanner input = new Scanner(System.in);
	/**
	 * play() will start the Guessing game and ask user to input a number.
	 * @param game is the received GuessingGame from main class.
	 * @return guessNumber which is the secret number.
	 */
	public int play(GuessingGame game){
		boolean checker= false;
		System.out.println("Guessing Game")
		System.out.println(game.getHint());
		int guessNumber=0;
		while(checker==false){
			System.out.print("What is your guess?");
			guessNumber = input.nextInt();			 
			checker = game.guess(guessNumber);
			System.out.println(game.getHint());
		}
		System.out.printf("Correct. You used %d guesses",game.getCount());
		return guessNumber;
	}
}
