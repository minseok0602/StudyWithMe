package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class LoadMember {

	private JFrame frame;
	public LoadMember() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 777, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 234, 183));
		panel.setBounds(116, 220, 530, 42);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 10, 10));
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setBackground(new Color(128, 128, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBackground(new Color(253, 234, 183));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("학과");
		lblNewLabel_2.setBackground(new Color(253, 234, 183));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("총 공부량 (분)");
		lblNewLabel_3.setBackground(new Color(253, 234, 183));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("계획 달성도 (%)");
		lblNewLabel_4.setBackground(new Color(253, 234, 183));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(116, 272, 530, 42);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 10, 10));
		
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
		
		JLabel lblNewLabel_3_1 = new JLabel("106분\r\n");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBackground(new Color(253, 234, 183));
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("88\r\n");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBackground(new Color(253, 234, 183));
		panel_1.add(lblNewLabel_4_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(248, 248, 255));
		panel_1_1.setBounds(116, 313, 530, 42);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(new GridLayout(1, 0, 10, 10));
		
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
		
		JLabel lblNewLabel_3_1_1 = new JLabel("22분\r\n");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBackground(new Color(253, 234, 183));
		panel_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("16");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBackground(new Color(253, 234, 183));
		panel_1_1.add(lblNewLabel_4_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(248, 248, 255));
		panel_1_2.setBounds(116, 354, 530, 42);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(new GridLayout(1, 0, 10, 10));
		
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
		
		JLabel lblNewLabel_3_1_2 = new JLabel("76분\r\n");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBackground(new Color(253, 234, 183));
		panel_1_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("46");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setBackground(new Color(253, 234, 183));
		panel_1_2.add(lblNewLabel_4_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(248, 248, 255));
		panel_1_3.setBounds(116, 395, 530, 42);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(new GridLayout(1, 0, 10, 10));
		
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
		
		JLabel lblNewLabel_3_1_3 = new JLabel("35분\r\n");
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setBackground(new Color(253, 234, 183));
		panel_1_3.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("78");
		lblNewLabel_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3.setBackground(new Color(253, 234, 183));
		panel_1_3.add(lblNewLabel_4_1_3);
		
		JLabel lblNewLabel_6 = new JLabel("Study With Me");
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(330, 178, 102, 32);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
