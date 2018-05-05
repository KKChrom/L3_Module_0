package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	Stack <Character> s= new Stack<Character>();
	Stack <Character> d= new Stack<Character>();        
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel("qqqqqqqqqqqqqqqqqq");
	public static void main(String [] args) {
		TextUndoRedo tur = new TextUndoRedo(); 
		tur.create();
	}
	public String stacktostring()
	{
		String str = "";
		for(int i=0;i<s.size();i++)
		{
			str += s.get(i);
		}
		return str;
	}
	public void create()
	{
		Frame.add(Panel);
		Panel.add(Label);
		Frame.setSize(500,500);
		Frame.setVisible(true);
		Panel.setVisible(true);
		Frame.addKeyListener(this);
		Frame.pack();
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent e) {
		char keycode = e.getKeyChar();
		System.out.println(keycode);
	
			
		if(keycode == KeyEvent.VK_BACK_SPACE)
		{
			d.push(s.pop());
		}
		else if(keycode==KeyEvent.VK_KP_UP)
		{
			s.push(d.pop());
			System.out.println("mynamejeff");
		}
		else
		{
			s.push(keycode);
		}
		
		Label.setText(stacktostring());
		Frame.pack();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

