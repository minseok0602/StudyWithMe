package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

public class CheckPerformanceRate {

	private JFrame frame;
	public CheckPerformanceRate() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Study With Me");
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(164, 40, 102, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 225, 163));
		panel.setBounds(90, 81, 255, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 5, 139, 25);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("계획의 총 개수:");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		lblNewLabel.setBounds(5, 5, 79, 15);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(209, 5, 34, 25);
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("24개");
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 225, 163));
		panel_3.setBounds(90, 119, 255, 32);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBounds(36, 5, 139, 25);
		panel_3.add(panel_1_2_1);
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("달성한 계획 개수: ");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(5, 5, 94, 15);
		panel_1_2_1.add(lblNewLabel_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(215, 5, 28, 25);
		panel_2_1.setBackground(Color.WHITE);
		panel_3.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("6개");
		panel_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(250, 225, 163));
		panel_4.setBounds(90, 157, 255, 32);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_1_2_1_1 = new JPanel();
		panel_1_2_1_1.setBounds(37, 5, 137, 25);
		panel_4.add(panel_1_2_1_1);
		panel_1_2_1_1.setBackground(Color.WHITE);
		panel_1_2_1_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("계획 달성도:");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(6, 5, 72, 15);
		panel_1_2_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(209, 5, 34, 25);
		panel_2_2.setBackground(Color.WHITE);
		panel_4.add(panel_2_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("25%");
		panel_2_2.add(lblNewLabel_2_2);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
