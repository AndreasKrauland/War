import java.util.Stack;

public class Deck {
	public Stack<card> make_deck() {
        Stack<card> DECK = new Stack<card>();

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int rank_num;
        int[] deck = new int[52];

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
          deck[i] = i;
        }
        int temp;
        int index;
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
          index = (int)(Math.random() * deck.length);
          temp = deck[i];
          deck[i] = deck[index];
          deck[index] = temp;
        }

        // Display the all the cards
        for (int i = 0; i < 26; i++) {
          String suit = suits[(int)(deck[i] / 13)];
          rank_num = deck[i] % 13;
          String rank = ranks[rank_num];
          card Card = new card(suit, rank);
          DECK.add(Card);
          Card.setNumber_rank(rank_num);
        }
        return DECK;
    }
}
				

	
		    
		    	
		
