package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import Server.Database;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatabaseSetting {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public DatabaseSetting() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Study With Me");
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(207, 113, 102, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("저장할 경로를 입력하세요.");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(81, 152, 167, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(81, 172, 236, 19);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = textField.getText();
				Database.setDatabase(path);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(249, 200, 53));
		btnNewButton.setBounds(347, 168, 63, 27);
		frame.getContentPane().add(btnNewButton);
		frame.setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 531, 359);
	}

}
