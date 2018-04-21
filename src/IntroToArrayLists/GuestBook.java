package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> list = new ArrayList<String>();
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
	JButton view = new JButton("View Names");
	JButton add = new JButton("Add Names");
	JButton remove = new JButton("Remove Names");

	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.createGUI();

	}

	public void createGUI() {
		Frame.setSize(500, 500);
		Frame.setVisible(true);
		Frame.add(Panel);
		Panel.setVisible(true);
		Panel.add(add);
		Panel.add(remove);
		Panel.add(view);
		add.addActionListener(this);
		remove.addActionListener(this);
		view.addActionListener(this);
		Frame.pack();
	}

	public void AddName(String name) {
		list.add(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton pressed = (JButton) e.getSource();
		if (pressed.equals(add)) {
			String name = JOptionPane.showInputDialog("What name do you want to add?");
			AddName(name);

		}
		if (pressed.equals(view)) {
			String message = "";
			for(int i =0;i<list.size();i++)
			{
				message += list.get(i) +", ";
				
			}
			JOptionPane.showMessageDialog(null,message);
		}
		if(pressed.equals(remove))
		{
			String name = JOptionPane.showInputDialog("What name do you want to remove?");
			list.remove(name);
		}
		}
	}
