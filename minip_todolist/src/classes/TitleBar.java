package classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{
	
	//Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(50,50));
//		this.setBackground(getBackground(Color.blue));
		
		JLabel titleText = new JLabel("To Do List");
		titleText.setPreferredSize(new Dimension(100,40));
		titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	
	}
	
	
}
