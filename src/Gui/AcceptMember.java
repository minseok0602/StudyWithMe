package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import LogReg.Registration;
import Server.Database;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcceptMember {

	private JFrame frame;
	private Database database;
	private JPanel listPanel;
	private ArrayList<Registration> regList;
	private ArrayList<JCheckBox> accepts;
	public AcceptMember() throws IOException {
		database = new Database();
		initialize();
		frame.setVisible(true);
	}
	private void initialize() throws IOException {
		listPanel = new JPanel();
		regList = new ArrayList<>();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Study With Me");
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(259, 10, 141, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 234, 183));
		panel.setBounds(61, 52, 530, 42);
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
		
		JLabel lblNewLabel_4 = new JLabel("멤버 타입");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1_1_5 = new JButton("승인하기");
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try {
				if(regList==null) {
					JOptionPane.showMessageDialog(frame, "명단이 비었습니다.");
					frame.dispose();
					return;
				}
				if(accepts==null) {
					JOptionPane.showMessageDialog(frame, "승인할 요청을 선택해주세요.");
					return;
				}
				for(int i =0 ;i<accepts.size();) {
					if(accepts.get(i).isSelected()) {
						if(regList.get(i).getIsAdmin())
							database.addAdmin(regList.get(i));
						else
							database.addStudent(regList.get(i));
						database.addLoginInfo(regList.get(i));
						accepts.remove(i);
						regList.remove(i);
						System.out.println(i);
						i = 0;
					}
					else
						i++;
				}
				database.clearReg();
				for(int i = 0 ;i<regList.size();i++) {
					database.addRequest(regList.get(i));
				}
				JOptionPane.showMessageDialog(frame, "승인이 완료되었습니다.");
				frame.dispose();
				}catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1_5.setFont(new Font("함초롬돋움", Font.BOLD, 10));
		btnNewButton_1_1_5.setBackground(new Color(249, 200, 53));
		btnNewButton_1_1_5.setBounds(286, 510, 77, 20);
		frame.getContentPane().add(btnNewButton_1_1_5);
		listPanel.setBounds(60, 104, 530, 402);
		frame.getContentPane().add(listPanel);
		listPanel.setLayout(null);
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(517, 0, 13, 402);
		listPanel.add(scrollPane);
		getRegistData();
		frame.setBounds(100, 100, 666, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void getRegistData() throws IOException {
		regList = database.getRegister();
		accepts = new ArrayList<>(regList.size());
		int y0 = 15;
		for(int i =0 ; i<regList.size();i++) {
			Registration reg = regList.get(i);
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(248, 248, 255));
			panel_1.setLayout(new GridLayout(1, 0, 10, 10));
			JCheckBox accept = new JCheckBox("");
			accepts.add(accept);
			panel_1.add(accept);
			JLabel lblNewLabel_1_1 = new JLabel(reg.getId());
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBackground(Color.GRAY);
			panel_1.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_5 = new JLabel(reg.getName());
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setBackground(new Color(253, 234, 183));
			panel_1.add(lblNewLabel_5);
			
			JLabel lblNewLabel_2_1 = new JLabel(reg.getDepart());
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1.setBackground(new Color(253, 234, 183));
			panel_1.add(lblNewLabel_2_1);
			String ad = "학생";
			if(reg.getIsAdmin())
				ad  = "관리자";
			JLabel lblNewLabel_7 = new JLabel(ad);
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(lblNewLabel_7);
			panel_1.setBounds(0, 35*(i), 518, 20);
			listPanel.add(panel_1);
			
		}
	}
}
