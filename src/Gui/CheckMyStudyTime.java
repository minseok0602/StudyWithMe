package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class CheckMyStudyTime {

	private JFrame frame;

	public CheckMyStudyTime() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Study With Me");
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(167, 91, 102, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 225, 163));
		panel.setBounds(108, 122, 219, 43);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("오**님의 총 공부량은 23분입니다.");
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(250, 225, 163));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
