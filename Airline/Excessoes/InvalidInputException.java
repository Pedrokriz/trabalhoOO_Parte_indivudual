package Excessoes;

public class InvalidInputException extends Exception {
	/**
	 * 
     * @param err
	 */
	public InvalidInputException(String err) {
		super(err);
	}
}
