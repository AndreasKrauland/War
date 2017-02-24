import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;
import java.util.Stack;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class WAR_GAME_GUI1 {
	private static JLabel lblNewLabel = new JLabel("New label");
	private static JLabel lblNewLabel_1 = new JLabel("New label");
	private JFrame frame;
	
	public static card Card1;
	public static card Card2;
	private final JTextField txtEnterPlayer_1 = new JTextField();
	private final JTextField txtEnterPlayer = new JTextField();
	private final JButton btnSetName = new JButton("Set Name");
	private final JLabel lblNames = new JLabel("NAMES:");
	private final JLabel lblNewLabel_2 = new JLabel("New label");
	private final JLabel lblNewLabel_3 = new JLabel("New label");
	private final JButton btnNewButton = new JButton("New button");
	private final JButton btnShuffleCards = new JButton("shuffle cards");
	private final JButton button = new JButton("shuffle cards");
	
	/**
	 * Launch the application.
	 */
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WAR_GAME_GUI1 window = new WAR_GAME_GUI1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WAR_GAME_GUI1 window = new WAR_GAME_GUI1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WAR_GAME_GUI1() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtEnterPlayer.setBounds(22, 145, 200, 50);
		txtEnterPlayer.setColumns(10);
		txtEnterPlayer_1.setBounds(22, 82, 200, 50);
		txtEnterPlayer_1.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 863, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		MouseListener l = new MouseListener() {
			
		
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.Session();

			}

			@Override
			public void mouseEntered(MouseEvent e) {

				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		MouseListener l2 = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				Session2();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.name1 = txtEnterPlayer.getText();
				Main.name2 = txtEnterPlayer_1.getText();
				lblNewLabel_2.setText(Main.name1);
				lblNewLabel_3.setText(Main.name2);
				
				
			}
		};
		
		MouseListener l3 = new MouseListener() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Shuffle(Main.player1Deck);
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		MouseListener l4 = new MouseListener() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Shuffle(Main.player2Deck);
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};

		l.mouseClicked(null);
		lblNewLabel.setBounds(382, 64, 119, 162);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1.setBounds(698, 64, 109, 162);
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.getContentPane().add(txtEnterPlayer_1);
		
		frame.getContentPane().add(txtEnterPlayer);
		btnSetName.setBounds(22, 236, 200, 25);
		btnSetName.addMouseListener(l2);
		btnNewButton.addMouseListener(l);
		frame.getContentPane().add(btnSetName);
		lblNames.setBounds(37, 342, 56, 16);
		
		btnShuffleCards.addMouseListener(l4);
		button.addMouseListener(l3);
		
		frame.getContentPane().add(lblNames);
		lblNewLabel_2.setBounds(37, 384, 56, 16);
		
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_3.setBounds(37, 432, 56, 16);
		
		frame.getContentPane().add(lblNewLabel_3);
		btnNewButton.setBounds(550, 52, 97, 25);
		
		frame.getContentPane().add(btnNewButton);
		btnShuffleCards.setBounds(236, 380, 179, 25);
		
		frame.getContentPane().add(btnShuffleCards);
		button.setBounds(236, 428, 179, 25);
		
		frame.getContentPane().add(button);
	}
	
	public static void update_screen(){
		lblNewLabel.setText("player 1 put: " + Card1.getNumber());
		lblNewLabel_1.setText("player 2 put: " + Card2.getNumber());
	}
	
	public static void Session2 (){		
		
		if (!(Main.player1Deck.isEmpty() || Main.player2Deck.isEmpty())){
		card a = Main.player1Deck.pop();
		card b1 = Main.player2Deck.pop();
		if (Main.IsWin(a,b1) == 1) {
			Main.p1+=2;
			
			System.out.println("player 1 put: " + a.getNumber() + " player 2 put: " + b1.getNumber());
			 Collections.reverse(Main.player1Deck);
			 Main.player1Deck.push(a);
			 Main.player1Deck.push(b1);
			 Collections.reverse(Main.player1Deck);
			 

        } else if (Main.IsWin(a,b1) == 2) {
			Main.p2+=2;
			
			System.out.println("player 1 put: " + a.getNumber() + " player 2 put: " + b1.getNumber());
			
			 Collections.reverse(Main.player2Deck);
			 Main.player2Deck.push(a);
			 Main.player2Deck.push(b1);
			 Collections.reverse(Main.player2Deck);
			 Main.setCardsAPI(a, b1);
			 update_screen();

        } else if (Main.IsWin(a,b1) == 3) {
            War();
        } else if (Main.IsWin(Main.player1Deck.pop(), Main.player2Deck.pop()) == 0) {
            System.out.println("problem");
        }
		Main.setCardsAPI(a, b1);
		update_screen();
}
	}
	
	
	public static void War() {
		Main.player1Deck.pop();
		Main.player1Deck.pop();
		Main.player1Deck.pop();
        // should be put in for loop for easier counting
		Main.player2Deck.pop();
		Main.player2Deck.pop();
		Main.player2Deck.pop();
		
		card a = Main.player1Deck.pop();
		card b = Main.player2Deck.pop();
		
		if (a.getNumber_rank()> b.getNumber_rank()){
			System.out.println("War: \n"+"player 1 put: " + a.getNumber() + " player 2 put: " + b.getNumber());
			Main.p1 += 10;
		}

		if (a.getNumber_rank()< b.getNumber_rank()){
			System.out.println("War: \n"+"player 1 put: " + a.getNumber() + " player 2 put: " + b.getNumber());
			Main.p2 += 10;
		}
		if (a.getNumber_rank()== b.getNumber_rank()) War();

		
	}
	
	public static void Shuffle(Stack<card> stack) {
		int index;
		card temp;
		for (int i = 0; i < stack.size(); i++) {
	           index = (int)(Math.random() * stack.size());
	          temp = stack.get(i);
	          stack.add(i, stack.get(index));
	          stack.add(i,temp);
	        }
		
	}
}
