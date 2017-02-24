import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;

public class panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public panel() {
		setLayout(new BorderLayout(0, 0));
		
		Label label = new Label("Card 1");
		add(label, BorderLayout.WEST);
		
		Label label_1 = new Label("Card 2");
		add(label_1, BorderLayout.EAST);
		
		Button button = new Button("New Session");
		add(button, BorderLayout.CENTER);
		
		TextField textField = new TextField();
		textField.setText("plyaer1 name");
		add(textField, BorderLayout.NORTH);
		
		TextField textField_1 = new TextField();
		textField_1.setText("player2 name");
		add(textField_1, BorderLayout.SOUTH);

	}

}
