package guessinggame;
import java.util.Random;
/**
 * Game of guessing a secret number.
 * @author Charin Tantrakul
 * @version 26.01.2017
 */
public class GuessingGame {
	/* properties of a guessing game*/
	private int upperBound;
	private int secret;
	private String hint;
	private int count=0;
	
	/**
	 * Set defalut of variable upperbound, secret and hint.
	 */
	public GuessingGame(int upperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and "+upperBound+".";
	
	}
	
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the limit for random number
	 * @return a secret number.
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit)+1;
	
	}
	
	/**
	 * Receive from number that inputed by user and check with secret number whether that match or not 
	 * @param number is receive from number that inputed by user
	 * @return true if number match with secret and false if number not match with secret
	 */
	public boolean guess(int number){
		if(number==this.secret){
			setHint("Correct. The secret is "+number+".");
			return true;
		}
		else if (number>=this.secret){
			setHint("Sorry,your guess is too large.");
			return false;
		}
		else{
			setHint("Sorry,your guess is too small.");
			return false;
		}
		this.count=count++;
	}
	
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint as a string.
	 */
	public String getHint(){
		return this.hint;
	}
	
	/**
	 * Set hint depend on  answer of the player and upperboundnumber.
	 * @param hint is received as a String.
	 */
	protected void setHint(String hint){
		this.hint = hint;
	}

	/**
	 * getCount() return total number of answers that players input.
	 * @return count
	 */
	public int getCount(){
		return this.count;
	}
}
