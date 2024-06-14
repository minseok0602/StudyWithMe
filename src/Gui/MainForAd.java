package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainForAd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public MainForAd() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 468, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Study With Me");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel.setBounds(173, 124, 111, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("멤버 승인");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new AcceptMember();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1.setBounds(139, 166, 180, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("멤버 삭제");
		btnNewButton_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1.setBounds(139, 226, 180, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("멤버 불러오기");
		btnNewButton_2.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_2.setBackground(new Color(249, 200, 53));
		btnNewButton_2.setBounds(139, 286, 180, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1_1 = new JButton("파일 위치 설정");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DatabaseSetting();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1_1_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1_1.setBounds(139, 346, 180, 50);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}

}
