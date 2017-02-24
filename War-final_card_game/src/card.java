


public class card {
	private String suit;
	private String number;
	public int number_rank;
	
	
		
	



	public card(String rank, String suit2) {
		this.suit = rank;
		this.number = suit2;
	}



	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getNumber_rank() {
		return number_rank;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber_rank(int number) {
		this.number_rank = number;
	}
	
}

