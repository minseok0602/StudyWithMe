package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class DeleteMember {

	private JFrame frame;
	public DeleteMember() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Study With Me");
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(291, 140, 102, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 234, 183));
		panel.setBounds(77, 182, 530, 42);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.GRAY);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(253, 234, 183));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("학과");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(253, 234, 183));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(77, 234, 530, 42);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 10, 10));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("2201****");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBackground(Color.GRAY);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("김**");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(new Color(253, 234, 183));
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("컴퓨터공학과");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBackground(new Color(253, 234, 183));
		panel_1.add(lblNewLabel_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(248, 248, 255));
		panel_1_1.setBounds(77, 275, 530, 42);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(1, 0, 10, 10));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		panel_1_1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2201****");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBackground(Color.GRAY);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("이**");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBackground(new Color(253, 234, 183));
		panel_1_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("컴퓨터공학과");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBackground(new Color(253, 234, 183));
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(248, 248, 255));
		panel_1_2.setBounds(77, 316, 530, 42);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(new GridLayout(1, 0, 10, 10));
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		panel_1_2.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("2201****");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setBackground(Color.GRAY);
		panel_1_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("박**");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setBackground(new Color(253, 234, 183));
		panel_1_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("컴퓨터공학과");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setBackground(new Color(253, 234, 183));
		panel_1_2.add(lblNewLabel_2_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(248, 248, 255));
		panel_1_3.setBounds(77, 357, 530, 42);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(new GridLayout(1, 0, 10, 10));
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		panel_1_3.add(chckbxNewCheckBox_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("2201****");
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setBackground(Color.GRAY);
		panel_1_3.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("오**");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setBackground(new Color(253, 234, 183));
		panel_1_3.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("컴퓨터공학과");
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_3.setBackground(new Color(253, 234, 183));
		panel_1_3.add(lblNewLabel_2_1_3);
		
		JButton btnNewButton_1_1_5 = new JButton("삭제하기");
		btnNewButton_1_1_5.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnNewButton_1_1_5.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1_5.setBounds(304, 422, 77, 20);
		frame.getContentPane().add(btnNewButton_1_1_5);
		frame.setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 699, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
