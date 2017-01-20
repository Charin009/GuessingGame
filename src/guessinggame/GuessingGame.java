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
	 * set defalut of va
	 */
	  public GuessingGame(int upperbound){
		  this.upperbound = upperbound;
		  this.secret = getRandomNumber(upperbound);
		  this.hint = "I'm thinking of a number between 1 and "+upperbound+".";
		  
	  }
	  /**
	   * Create a random number between 1 and limit.
	   * @param limit is the upper limit for random number
	   * @return a random number between 1 and limit (inclusive)
	   */
	  
	 private int getRandomNumber(int limit){
		 long seed = System.currentTimeMillis();
		 Random rand = new Random(seed);
		 return rand.nextInt(limit)+1;
	 }
	 /**
	  * Guess input their number to check
	  * @param number is the number that's input by guess
	  * @return true if number is correct with secret return false if number not correct with secret
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
	 protected void setHint(String hint){
		 this.hint = hint;
	 }
	 public int getCount(){
		 return this.count;
	 }
	

}
