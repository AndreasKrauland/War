import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	private static Deck deck1 = new Deck();
	private static Deck deck2 = new Deck();
	
	private static Stack<card> player1Deck = deck1.make_deck();
	private static Stack<card> player2Deck = deck2.make_deck();
	
	private static Stack<card> player1Trash;
	private static Stack<card> player2Trash;
	
	private static int p1 = 0;
	private static int p2 = 0;
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter player1 name: \n");
		String player1 = reader.next();
		
		System.out.println("Enter player2 name: \n");
		String player2 = reader.next();
		
		reader.close();
		
		
		
		for(int i = 0; i<player1Deck.size() && i<player2Deck.size(); i++) {
			card a = player1Deck.pop();
			card b1 = player2Deck.pop();
			if (IsWin(a,b1) == 1) {
				p1++;
				System.out.println("player 1 put: " + a.getNumber() + " player 2 put: " + b1.getNumber());
				 Collections.reverse(player1Deck);
				 player1Deck.push(a);
				 player1Deck.push(b1);
				 Collections.reverse(player1Deck);

            } else if (IsWin(a,b1) == 2) {
				p2++;
				System.out.println("player 1 put: " + a.getNumber() + " player 2 put: " + b1.getNumber());
				 Collections.reverse(player2Deck);
				 player2Deck.push(a);
				 player2Deck.push(b1);
				 Collections.reverse(player2Deck);


            } else if (IsWin(a,b1) == 3) {
                War();
            } else if (IsWin(player1Deck.pop(), player2Deck.pop()) == 0) {
                System.out.println("problem");
            }
           
        }
		if (p2 < p1) System.out.println(player2 + "    " + p2 + "    " + player1 + "     " + p1);
		if (p2 > p1) System.out.println(player2 + "    " + p2 + "    " + player1 + "     " + p1);
		
		if (p1 == p2) System.out.println("There is no one winner... Both of you are the winners");
		
		
    }
	
	// true -> p1 false -> p2
	private static void War() {
		player1Deck.pop();
		player1Deck.pop();
		player1Deck.pop();
        // should be put in for loop for easier counting
		player2Deck.pop();
		player2Deck.pop();
		player2Deck.pop();
		
		card a = player1Deck.pop();
		card b = player2Deck.pop();
		
		if (a.getNumber_rank()> b.getNumber_rank()){
			System.out.println("War: \n"+"player 1 put: " + a.getNumber() + " player 2 put: " + b.getNumber());
			p1 += 10;
		}

		if (a.getNumber_rank()< b.getNumber_rank()){
			System.out.println("War: \n"+"player 1 put: " + a.getNumber() + " player 2 put: " + b.getNumber());
			p2 += 10;
		}
		if (a.getNumber_rank()== b.getNumber_rank()) War();

		
	}

	private static int IsWin(card pop, card pop2) {
		if (pop.getNumber_rank()>pop2.getNumber_rank()) return 1;
		else if (pop.getNumber_rank()<pop2.getNumber_rank()) return 2;
		else if  (pop.getNumber_rank()==pop2.getNumber_rank()) return 3;
		else return 0;
	}
	
	private static int IsWinWar(card pop, card pop2) {
		System.out.println("player 1 put: " + pop.getNumber() + " player 2 put: " + pop2.getNumber());

		if (pop.getNumber_rank()>pop2.getNumber_rank()) return 1;
		else if (pop.getNumber_rank()<pop2.getNumber_rank()) return 2;
		else if  (pop.getNumber_rank()==pop2.getNumber_rank()) return 3;
		else return 0;
	}
	
	

}
