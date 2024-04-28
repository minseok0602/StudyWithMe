package toDoList;
import javax.swing.*;

import app0602.cal.diary.Diary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TodoListApp extends JFrame {
    private JPanel mainPanel;
    private JTextField todoTextArea;
    private JButton addButton;
    private JButton saveButton;
    private JButton loadButton;
    private int cnt = 0;
    private String monthlyPath = "C:/Temp/MonthlyList/";
    public TodoListApp(int y, int m, int d) {
        setTitle(y+"년 "+m+"월 "+d+"일의 할 일");
        setSize(700, 500);
        setLayout(null);
        mainPanel = new JPanel();
        mainPanel.setSize(600,50);
        mainPanel.setLocation(50,400);
        todoTextArea = new JTextField(25);

        saveButton = new JButton("Save");
        saveButton.setSize(60,30);
        saveButton.setFont(new Font("Arial", Font.PLAIN, 11));
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(cnt>4) {
            		JOptionPane.showMessageDialog(mainPanel, "List can be uploaded less than 5.");
            		return;
            	}
            	cnt++;
                saveTodoList(m,d);
            }
        });

        mainPanel.add(todoTextArea);
        mainPanel.add(saveButton);
        loadTodoList(m,d);
        add(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void saveTodoList(int m, int d) {
    	String path = monthlyPath+m+"/"+d;
        File file = new File(path);
        if (!file.exists()) {	// 파일이 존재하지 않으면 생성
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}} 
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            writer.write(todoTextArea.getText());
            todoTextArea.setText("");
            writer.newLine();
            writer.close();
            JOptionPane.showMessageDialog(this, "Todo list saved successfully.");
            loadTodoList(m,d);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving todo list.");
        }
    }
    private void loadTodoList(int m, int d) {
    	String path = monthlyPath+m+"/"+d;
    	File file = new File(path);
    	String str[]= new String[5];
    	if(!file.exists()) {
    		JOptionPane.showMessageDialog(this, "empty!! Try to fill today's todo!!");
    	}
    	else {
    		try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				int i = 0;
				String line;
				while((line=reader.readLine())!=null) {
	    			str[i++] = line; 
	    		}
				System.out.println(i);
				for(int k = 0; k<i;k++) {
					Work work = new Work(str[k]);
					work.setSize(600,40);
					work.setLocation(50,k*80);
					add(work);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    
    	}
    }

}