package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

import Server.Database;
import ToDoList.Work;

public class LoadPlan {

	private JFrame frame;
	private String monthlyPath = "Students\\"+Database.currentId;
	private ArrayList<String> str;

	public LoadPlan(int y, int m, int d) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(y+"년 "+m+"월 "+d+"일");
		lblNewLabel.setBounds(142, 22, 185, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		frame.add(lblNewLabel);
		str = new ArrayList<>(5);
		loadTodoList(y, m, d);
		for(int i = 0 ;i<str.size();i++) {
			frame.repaint();
			JPanel panel = new JPanel();
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			panel.setBackground(new Color(255, 233, 172));
			panel.setBounds(61, 29+(i+1)*30, 361, 32+(i+1)*30);
			JCheckBox chckbxNewCheckBox = new JCheckBox(str.get(i)); 
			chckbxNewCheckBox.setBounds(8, 6, 256, 23);
			chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
			panel.add(chckbxNewCheckBox);
			JButton btnNewButton_1_1 = new JButton("수정하기");
			btnNewButton_1_1.setBounds(272, 6, 77, 20);
			panel.add(btnNewButton_1_1);
			btnNewButton_1_1.setFont(new Font("함초롬돋움", Font.BOLD, 10));
			btnNewButton_1_1.setBackground(new Color(249, 200, 53));
			frame.add(panel);
		}
		frame.setBounds(100, 100, 485, 575);
		frame.setVisible(true);
	}
	private void loadTodoList(int y, int m, int d) {
    	String path = monthlyPath+"\\"+m+"\\"+d+".txt";
    	File file = new File(path);
    	if(!file.exists()) {
    		JOptionPane.showMessageDialog(frame, "empty!! Try to fill today's todo!!");
    	}
    	else {
    		try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				while((line=reader.readLine())!=null) {
	    			str.add(line);
	    		}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    
    	}
    }
}
