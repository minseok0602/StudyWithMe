package ToDoList;
import java.awt.*;
import javax.swing.*;

import Calendar.MyCalendar;

public class Work extends JPanel{
	ImageIcon icon = new ImageIcon(Work.class.getResource("label.png"));
	Image img = icon.getImage();
	String str;
	Work(String str){
		setLayout(null);
		setSize(500,90);
		this.str= str;
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 233, 172));
		panel.setBounds(61, 29, 361, 32);
		add(panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(str);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(8, 6, 256, 23);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1_1 = new JButton("수정하기");
		btnNewButton_1_1.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnNewButton_1_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1.setBounds(272, 6, 77, 20);
		panel.add(btnNewButton_1_1);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,getWidth(),getHeight(),this);
}
}
