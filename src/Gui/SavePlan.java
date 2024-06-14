package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Server.Database;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SavePlan {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private int cnt = 0;
    private String monthlyPath = "Students\\"+Database.currentId;

	public SavePlan(int y, int m, int d) {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("굴림", Font.PLAIN, 15));
		frame.getContentPane().setBackground(new Color(252, 247, 226));
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("계획을 입력하세요.");
		lblNewLabel_1.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(60, 102, 113, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(20);
		textField.setBounds(60, 122, 236, 19);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt>4) {
            		JOptionPane.showMessageDialog(frame, "List can be uploaded less than 5.");
            		return;
            	}
            	cnt++;
                saveTodoList(m,d);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(249, 200, 53));
		btnNewButton.setBounds(326, 118, 63, 27);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel(y+"년 "+m+"월 "+d+"일");
		lblNewLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		lblNewLabel.setBounds(166, 62, 102, 32);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
	 private void saveTodoList(int m, int d) {
	    	String path = monthlyPath+"\\"+m;
	        File filePath = new File(path);
	        File file = null;
	        if (!filePath.mkdirs()) {	// 파일이 존재하지 않으면 생성
				try {
					file = new File(path+"\\"+d+".txt");
					file.createNewFile();
					BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
		            writer.write(textField.getText());
		            textField.setText("");
		            writer.newLine();
		            writer.close();
		            JOptionPane.showMessageDialog(frame, "Todo list saved successfully.");
				} catch (IOException e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(frame, "Error saving todo list.");
				}} 
	    }
}
