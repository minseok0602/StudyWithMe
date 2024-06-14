package Calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;

import Gui.LoadPlan;
import Gui.SavePlan;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DayBox {

	private JFrame frame;



	public DayBox(int y, int m , int d) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 454, 582);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(y+"년 "+m+"월 "+d+"일");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		lblNewLabel.setBounds(145, 154, 149, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("저장하기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SavePlan(y,m,d);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1.setBounds(130, 196, 180, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("불러오기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoadPlan(y,m,d);
				
			}
		});
		btnNewButton_1.setFont(new Font("함초롬돋움", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(249, 200, 53));
		btnNewButton_1.setBounds(130, 256, 180, 50);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
