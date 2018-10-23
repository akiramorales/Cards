/**
 * 
 * @author Akira
 * Card Class
 * Period 6
 * 
 */
public class Cards
{
	//Fields
	private char suit;
	private String rank;
	private int value;
	
	//Constructors
	/**
	 * Constructs a card
	 * @param suitIn	initial suit
	 * @param rankIn	initial rank
	 * @param valueIn	initial value
	 */
	public Cards(char suitIn, String rankIn, int valueIn)
	{
		suit = suitIn;
		rank = rankIn;
		value = valueIn;
	}
	
	//Methods
	/**
	 * returns the suit of the card
	 * @return suit		the suit of the card
	 */
	public int getSuit()
	{
		return suit;
	}
	/**
	 * returns the rank of the card
	 * @return rank		the rank of the card
	 */
	public String getRank()
	{
		return rank;
	}
	/**
	 * returns the value of the card
	 * @return value	the value of the card
	 */
	public int getValue()
	{
		return value;
	}
		
}
