package Gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import LogReg.Registration;
import Server.Database;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Register {

	JFrame frame;
	private JTextField idText;
	private JTextField nameText;
	private JTextField departText;
	private JTextField passwordText;
	private JTextField passwordAgainText;
	private String id;
	private String name;
	private String depart;
	private String password;
	private String passwordAgain;
	private Database database;
	JCheckBox isAd = new JCheckBox("관리자로 신청");

	public Register() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		try {
			database = new Database();
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 700, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Study With Me");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(273, 93, 138, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(252, 247, 226));
		panel_1.setBounds(165, 135, 355, 32);
		frame.getContentPane().add(panel_1);
		
		idText = new JTextField();
		idText.setHorizontalAlignment(SwingConstants.LEFT);
		idText.setColumns(10);
		idText.setBounds(99, 6, 141, 21);
		panel_1.add(idText);
		
		JButton idButton = new JButton("확인\r\n");
		idButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		idButton.setBackground(new Color(249, 200, 53));
		idButton.setBounds(252, 5, 91, 23);
		panel_1.add(idButton);
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_1.setBackground(new Color(249, 200, 53));
		lblNewLabel_1.setBounds(21, 8, 66, 17);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(252, 247, 226));
		panel_1_1.setBounds(165, 177, 355, 32);
		frame.getContentPane().add(panel_1_1);
		
		nameText = new JTextField();
		nameText.setHorizontalAlignment(SwingConstants.LEFT);
		nameText.setColumns(10);
		nameText.setBounds(99, 6, 141, 21);
		panel_1_1.add(nameText);
		
		JButton nameButton_1 = new JButton("확인\r\n");
		nameButton_1.setBackground(new Color(249, 200, 53));
		nameButton_1.setBounds(252, 5, 91, 23);
		panel_1_1.add(nameButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_1_1.setBackground(new Color(249, 200, 53));
		lblNewLabel_1_1.setBounds(21, 8, 66, 17);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(252, 247, 226));
		panel_1_2.setBounds(165, 219, 355, 32);
		frame.getContentPane().add(panel_1_2);
		
		departText = new JTextField();
		departText.setHorizontalAlignment(SwingConstants.LEFT);
		departText.setColumns(10);
		departText.setBounds(99, 6, 141, 21);
		panel_1_2.add(departText);
		
		JButton departButton = new JButton("확인\r\n");
		departButton.setBackground(new Color(249, 200, 53));
		departButton.setBounds(252, 5, 91, 23);
		panel_1_2.add(departButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("학과");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_1_2.setBackground(new Color(249, 200, 53));
		lblNewLabel_1_2.setBounds(21, 8, 66, 17);
		panel_1_2.add(lblNewLabel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(new Color(252, 247, 226));
		panel_1_3.setBounds(165, 261, 355, 32);
		frame.getContentPane().add(panel_1_3);
		
		passwordText = new JTextField();
		passwordText.setHorizontalAlignment(SwingConstants.LEFT);
		passwordText.setColumns(10);
		passwordText.setBounds(99, 6, 141, 21);
		panel_1_3.add(passwordText);
		
		JButton passWordButton_3 = new JButton("확인\r\n");
		passWordButton_3.setBackground(new Color(249, 200, 53));
		passWordButton_3.setBounds(252, 5, 91, 23);
		panel_1_3.add(passWordButton_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("비밀 번호");
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_1_3.setBackground(new Color(249, 200, 53));
		lblNewLabel_1_3.setBounds(21, 8, 66, 17);
		panel_1_3.add(lblNewLabel_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(new Color(252, 247, 226));
		panel_1_4.setBounds(165, 303, 355, 32);
		frame.getContentPane().add(panel_1_4);
		
		passwordAgainText = new JTextField();
		passwordAgainText.setHorizontalAlignment(SwingConstants.LEFT);
		passwordAgainText.setColumns(10);
		passwordAgainText.setBounds(99, 6, 141, 21);
		panel_1_4.add(passwordAgainText);
		
		JButton passwordAgButton_4 = new JButton("확인\r\n");
		passwordAgButton_4.setBackground(new Color(249, 200, 53));
		passwordAgButton_4.setBounds(252, 5, 91, 23);
		panel_1_4.add(passwordAgButton_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("비밀 번호 재입력");
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("굴림", Font.PLAIN, 10));
		lblNewLabel_1_4.setBackground(new Color(249, 200, 53));
		lblNewLabel_1_4.setBounds(12, 9, 79, 17);
		panel_1_4.add(lblNewLabel_1_4);
		
		JButton btnNewButton_5 = new JButton("멤버 신청\r\n");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = idText.getText();
			    name = nameText.getText();
			    depart = departText.getText();
			    password = passwordText.getText();
			    passwordAgain = passwordAgainText.getText();
			    try {
			    	if(id.equals("")||name.equals("")||depart.equals("")||password.equals("")) {
						JOptionPane.showMessageDialog(frame, "빈칸을 모두 채워주세요.","회원가입요청 실패", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if(database.existId(id)) {
						JOptionPane.showMessageDialog(frame, "존재하는 아이디입니다.","회원가입요청 실패", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if(id.length()<8) {
						JOptionPane.showMessageDialog(frame, "학번은 8글자 이상입니다","회원가입요청 실패", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if(password.length()<4) {
						JOptionPane.showMessageDialog(frame, "비밀번호는 4글자 이상이어아합니다","회원가입요청 실패", JOptionPane.WARNING_MESSAGE);
						return;
					}
					if(!password.equals(passwordAgain)) {
						JOptionPane.showMessageDialog(frame, "재입력한 비밀번호가 일치하지 않습니다.","회원가입요청 실패", JOptionPane.WARNING_MESSAGE);
						return;
					}
					
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Registration reg = new Registration(id,name,password,depart,isAd.isSelected());
				try {
					database.addRequest(reg);
					JOptionPane.showMessageDialog(frame, "회원가입요청 성공","", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setBackground(new Color(249, 200, 53));
		btnNewButton_5.setBounds(296, 369, 91, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		isAd.setSelected(true);
		isAd.setBounds(291, 341, 101, 23);
		frame.getContentPane().add(isAd);
	}
}
