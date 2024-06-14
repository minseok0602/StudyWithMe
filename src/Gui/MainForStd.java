package Gui;


import javax.swing.JFrame;
import java.awt.Color;

import Server.Database;

import javax.swing.JLabel;

import Calendar.MyCalendar;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForStd {

	private JFrame frame;

	public MainForStd() {
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
		
		JLabel lblNewLabel = new JLabel("Study With Me");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel.setBounds(176, 103, 102, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("랭킹 보기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ranking();
			}
		});
		btnNewButton_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1.setBounds(137, 205, 180, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("타이머");
		btnNewButton_2.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_2.setBackground(new Color(249, 200, 53));
		btnNewButton_2.setBounds(137, 265, 180, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("내 공부량 확인");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckMyStudyTime();
			}
		});
		btnNewButton_3.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_3.setBackground(new Color(249, 200, 53));
		btnNewButton_3.setBounds(137, 383, 180, 50);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("계획 달성도 보기");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckPerformanceRate();
			}
		});
		btnNewButton_3_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_3_1.setBackground(new Color(249, 200, 53));
		btnNewButton_3_1.setBounds(137, 443, 180, 50);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_1_1 = new JButton("스터디 플래너");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyCalendar();
				System.out.println(Database.currentId);
			}
		});
		btnNewButton_1_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1.setBounds(137, 145, 180, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_2 = new JButton("좌우명 저장");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SaveMotto();
			}
		});
		btnNewButton_2_2.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_2_2.setBackground(new Color(249, 200, 53));
		btnNewButton_2_2.setBounds(137, 324, 180, 50);
		frame.getContentPane().add(btnNewButton_2_2);
		frame.setBounds(100, 100, 468, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
