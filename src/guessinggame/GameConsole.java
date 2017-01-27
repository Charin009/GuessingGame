package guessinggame;
import java.util.Scanner;
/**
 * GameConsole of GuessingGame
 * @author Charin Tantrakul 
 */
public class GameConsole {
	Scanner input = new Scanner(System.in);
	/**
	 * play() will start Guessing game and ask user to input a number
	 * @param game is new GuessingGame  
	 * @return guess number that match with number of user
	 */
	public int play(GuessingGame game){
		boolean checker= false;
		System.out.println(game.getHint());
		int guess_number=0;
		while(checker==false){
			System.out.print("What is your guess?");
			guessnum = input.nextInt();			 
			checker = game.guess(guess_number);
			System.out.println(game.getHint());
		}
		System.out.printf("Correct. You used %d guesses",game.getCount());
		return guessnum;
	}
}
