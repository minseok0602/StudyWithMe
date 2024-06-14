package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Timer {

	private JFrame frame;

	public Timer() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Study With Me");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel.setBounds(166, 67, 103, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(113, 113, 209, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("00 : 00 : 00");
		lblNewLabel_1.setBackground(new Color(255, 233, 172));
		lblNewLabel_1.setFont(new Font("한컴 고딕", Font.BOLD, 25));
		lblNewLabel_1.setBounds(39, 10, 130, 42);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("시작");
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		btnNewButton.setBounds(12, 56, 75, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("종료");
		btnNewButton_1.setBackground(new Color(255, 98, 98));
		btnNewButton_1.setFont(new Font("함초롬돋움", Font.BOLD, 12));
		btnNewButton_1.setBounds(122, 56, 75, 23);
		panel.add(btnNewButton_1);
	}

}
