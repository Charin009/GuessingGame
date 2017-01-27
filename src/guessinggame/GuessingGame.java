package guessinggame;
import java.util.Random;
/**
 * Game of guessing a secret number
 * @author Charin Tantrakul
 */
public class GuessingGame {
	/* properties of a guessing game*/
	private int upperbound;
	private int secret;
	private String hint;
	int count=0;
	/**
	 * set defalut of variable upperbound secret and hint
	 */
	public GuessingGame(int upperbound){
		this.upperbound = upperbound;
		this.secret = getRandomNumber(upperbound);
		this.hint = "I'm thinking of a number between 1 and "+upperbound+".";
	}
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit)+1;
	}
	/**
	 * Guess input their number to check
	 * @param number is the number that input by user
	 * @return true if number match with secret return false if number not match with secret
	 */
	public boolean guess(int number){
		if(number==this.secret){
			setHint("Correct. The secret is "+number+".");
			this.count++;
			return true;
		}
		else if (number>=this.secret){
			setHint("Sorry,your guess is too large.");
			this.count++;
			return false;
		}
		else{
			setHint("Sorry,your guess is too small.");
			this.count++;
			return false;
		}
	}
	/**
	 * Return a hint based on the most recent guess
	 * @return hint based on most recent guess
	 */
	public String getHint(){
		return this.hint;
	}
	/**
	 * Set hint depend on  answer of the player and upperboundnumber
	 * @param hint depend on  answer of the player and upperboundnumber
	 */
	protected void setHint(String hint){
		this.hint = hint;
	}
	/**
	 * getCount() return total number of answers that players input.
	 * @return count is total number of answers that players input.
	 */
	public int getCount(){
		return this.count;
	}
}
