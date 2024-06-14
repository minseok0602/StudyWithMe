package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class DeletePlan {

	private JFrame frame;

	public DeletePlan() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 594, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2024년 5월 10일");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		lblNewLabel.setBounds(216, 106, 149, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255, 233, 172));
		panel.setBounds(110, 158, 361, 32);
		frame.getContentPane().add(panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("알고리즘 복습하기");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(8, 6, 256, 23);
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 233, 172));
		panel_1.setBounds(110, 200, 361, 32);
		frame.getContentPane().add(panel_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("스케줄링 공부하기");
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(8, 6, 256, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 233, 172));
		panel_2.setBounds(110, 242, 361, 32);
		frame.getContentPane().add(panel_2);
		
		JCheckBox chckbxAnalysis = new JCheckBox("analysis 보고서 쓰기");
		chckbxAnalysis.setBackground(Color.WHITE);
		chckbxAnalysis.setBounds(8, 6, 256, 23);
		panel_2.add(chckbxAnalysis);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(255, 233, 172));
		panel_4.setBounds(110, 326, 361, 32);
		frame.getContentPane().add(panel_4);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("컴퓨터 그래픽스 공부하기\r\n\r\n");
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setBounds(8, 6, 256, 23);
		panel_4.add(chckbxNewCheckBox_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 233, 172));
		panel_3.setBounds(110, 284, 361, 32);
		frame.getContentPane().add(panel_3);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("컴퓨터 네트워크 인강듣기");
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(8, 6, 256, 23);
		panel_3.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton_1_1_5 = new JButton("삭제하기");
		btnNewButton_1_1_5.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnNewButton_1_1_5.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1_5.setBounds(251, 368, 77, 20);
		frame.getContentPane().add(btnNewButton_1_1_5);
	}

}
