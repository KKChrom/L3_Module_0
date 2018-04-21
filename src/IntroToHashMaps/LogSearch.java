package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
	JButton add = new JButton("Add Entry");
	JButton Search = new JButton("Search By ID");
	JButton View = new JButton("View List");
	JButton remove = new JButton("Remove");
	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.createGUI();
		
		

	/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 *
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
}
	public void createGUI() {
		Frame.setSize(500, 500);
		Frame.setVisible(true);
		Frame.add(Panel);
		Panel.setVisible(true);
		Panel.add(add);
		Panel.add(remove);
		Panel.add(View);
		Panel.add(Search);
		Search.addActionListener(this);
		add.addActionListener(this);
		remove.addActionListener(this);
		View.addActionListener(this);
		Frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}