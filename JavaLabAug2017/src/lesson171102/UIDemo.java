package lesson171102;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UIDemo {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Demo");
		
		frame.setSize(400, 400);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click me!");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
			}
		});
		
		frame.getContentPane().add(button);
		
		frame.setVisible(true);
		
		
		
	}

}
