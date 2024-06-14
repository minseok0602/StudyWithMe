package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import Server.Database;
import javax.swing.JCheckBox;

public class Login {

	private JFrame frame;
	private JTextField idText;
	private JTextField passwordText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		try {
			initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void initialize() throws IOException {
		Database database = new Database();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 425, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(252, 247, 226));
		panel.setBounds(44, 24, 323, 207);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		idText = new JTextField();
		idText.setBounds(25, 77, 198, 19);
		panel.add(idText);
		idText.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBackground(new Color(249, 200, 53));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("함초롬돋움", Font.PLAIN, 9));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogReg.Login login = new LogReg.Login(idText.getText(),passwordText.getText());
				try {
					if(!database.checkPassword(login)) {
						JOptionPane.showMessageDialog(frame, "에러","로그인 오류", JOptionPane.ERROR_MESSAGE);
						return;
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(236, 84, 63, 52);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("멤버 가입");
		btnNewButton_2.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(249, 200, 53));
		btnNewButton_2.setBounds(117, 174, 91, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Study With Me");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 20));
		lblNewLabel.setBounds(96, 31, 131, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(25, 59, 24, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(25, 106, 48, 15);
		panel.add(lblNewLabel_1_1);
		
		passwordText = new JTextField();
		passwordText.setColumns(10);
		passwordText.setBounds(25, 124, 198, 19);
		panel.add(passwordText);
	}
}
