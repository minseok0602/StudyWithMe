package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SaveMotto {

	private JFrame frame;
	private JTextField textField;


	public SaveMotto() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("좌우명을 입력하세요.");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(47, 112, 130, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(47, 132, 236, 19);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(249, 200, 53));
		btnNewButton.setBounds(313, 128, 63, 27);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Study With Me");
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(167, 73, 102, 32);
		frame.getContentPane().add(lblNewLabel_6);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
