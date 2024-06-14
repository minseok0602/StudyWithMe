package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class Ranking {

	private JFrame frame;

	public Ranking() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 755, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Study With Me");
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(319, 166, 102, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 234, 183));
		panel.setBounds(100, 271, 530, 42);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_7 = new JLabel("등수 (등)");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("총 공부량 (분)");
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(new Color(253, 234, 183));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(100, 323, 530, 42);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_9 = new JLabel("1");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_9);
		
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
		
		JLabel lblNewLabel_3_1 = new JLabel("106");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBackground(new Color(253, 234, 183));
		panel_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(248, 248, 255));
		panel_1_1.setBounds(100, 364, 530, 42);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_10 = new JLabel("2");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_1.add(lblNewLabel_10);
		
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
		
		JLabel lblNewLabel_3_1_1 = new JLabel("88");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBackground(new Color(253, 234, 183));
		panel_1_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(248, 248, 255));
		panel_1_2.setBounds(100, 405, 530, 42);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_11 = new JLabel("3");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_2.add(lblNewLabel_11);
		
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
		
		JLabel lblNewLabel_3_1_2 = new JLabel("76");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBackground(new Color(253, 234, 183));
		panel_1_2.add(lblNewLabel_3_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(248, 248, 255));
		panel_1_3.setBounds(100, 446, 530, 42);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_12 = new JLabel("4");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_3.add(lblNewLabel_12);
		
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
		
		JLabel lblNewLabel_3_1_3 = new JLabel("35");
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setBackground(new Color(253, 234, 183));
		panel_1_3.add(lblNewLabel_3_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(189, 248, 188));
		panel_2.setBounds(100, 206, 530, 42);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_1_2 = new JLabel("2201****");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBackground(Color.GRAY);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("오**");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(253, 234, 183));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("컴퓨터공학과");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBackground(new Color(253, 234, 183));
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("35");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBackground(new Color(253, 234, 183));
		panel_2.add(lblNewLabel_3_2);
	}

}
