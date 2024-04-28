package toDoList;
import java.awt.*;
import javax.swing.*;

import app0602.cal.diary.Diary;

public class Work extends JPanel{
	ImageIcon icon = new ImageIcon(Work.class.getResource("label.png"));
	Image img = icon.getImage();
	JLabel label;
	JCheckBox cb;
	String str;
	Work(String str){
		setLayout(null);
		setSize(500,90);
		this.str= str;
		label = new JLabel(str);
		label.setSize(300, 40);
		label.setLocation(50,50);
		cb = new JCheckBox();
		cb.setLocation(347,48);
		cb.setSize(50,50);
		cb.setOpaque(false);
		this.add(label);
		this.add(cb);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,0,0,getWidth(),getHeight(),this);
}
}
