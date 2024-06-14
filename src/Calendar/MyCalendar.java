package Calendar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Calendar.DayBoxView;
public class MyCalendar extends JFrame{
	
	String[] dayAr = {"Sun", "Mon", "Tue", "Wen", "Thur", "Fri", "Sat"};
	DayBoxView[][] dateBoxAr = new DayBoxView[6][7];
	JPanel p_north;
	JButton[] planButton= new JButton[42];
	JButton bt_prev;
	JLabel lb_title;
	JButton bt_next;
	JPanel p_center;
	Calendar cal; 
	ImageIcon icon = new ImageIcon(MyCalendar.class.getResource("memo.png"));
	Image img = icon.getImage();
	Image changeImg = img.getScaledInstance(50,45, Image.SCALE_SMOOTH);
	ImageIcon changeIcon = new ImageIcon(changeImg);
	int yy; 
	int mm; 
	int dd;
	int startDay; 
	int lastDate; 
	
	public MyCalendar() {
		
		this.setBackground(new Color(252,247,226));
		p_north = new JPanel();
		bt_prev = new JButton("이전");
		lb_title = new JLabel("년도 올 예정", SwingConstants.CENTER);
		bt_next = new JButton("다음");
		p_center = new JPanel();
		
		
		lb_title.setFont(new Font("Arial-Black", Font.BOLD, 25));
		lb_title.setPreferredSize(new Dimension(300, 30));
		
		p_north.add(bt_prev);
		p_north.add(lb_title);
		p_north.add(bt_next);
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		getCurrentDate(); 
		getDateInfo(); 
		setDateTitle(); 
		createDay(); 
		createDate();
		printDate();
		setButton();
		
		bt_prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateMonth(-1);
			}
		});
		
		
		bt_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateMonth(1);
			}
		});
		
		setVisible(true);
		setBounds(100, 100, 780, 780);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public void getCurrentDate() {
		cal = Calendar.getInstance();
		yy= cal.get(Calendar.YEAR);
		mm = cal.get(Calendar.MONTH);
	}
	
	
	public void getDateInfo() {
		startDay = getFirstDayOfMonth(yy, mm);
		lastDate = getLastDate(yy, mm);
	}
	
	
	public void createDay() {
		p_center.removeAll();
		for(int i = 0; i < 7; i++){
			DayBoxView dayBox = new DayBoxView(dayAr[i], Color.gray, 100, 70);
			p_center.add(dayBox);
		}
		add(p_center);
	}
	
	
	public void createDate() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0 ;j<7;j++) {
				DayBoxView dateBox = new DayBoxView("", Color.LIGHT_GRAY, 100, 70);
				p_center.add(dateBox);
				dateBoxAr[i][j]= dateBox;
			}
		}
	}
	

	public int getFirstDayOfMonth(int yy, int mm) {
		Calendar cal = Calendar.getInstance();
		cal.set(yy, mm, 1);
		return cal.get(Calendar.DAY_OF_WEEK)-1;
	}
	
	public int getLastDate(int yy, int mm) {
		Calendar cal = Calendar.getInstance();
		cal.set(yy, mm+1, 0);
		//마지막 날을 의미한다.
		return cal.get(Calendar.DATE);
	}
	
	//날짜 박스에 날짜 출력하기
	public void printDate() {	
		int n = 0;
		int m = 1;
		for(int i = 0; i < 6; i++) {
			for(int j = 0;j<7;j++) {
				if(n >= startDay && n < lastDate + startDay) {
					dateBoxAr[i][j].day = Integer.toString(m++);
					dateBoxAr[i][j].repaint();
				}else {
					dateBoxAr[i][j].day = "";
					dateBoxAr[i][j].repaint();
				}
				n++;
			}
		}
	}
	public void setButton() {
	    int n = 0;
	    int cnt = 0;
	    planButton= new JButton[lastDate];
	    for(int i = 0; i < 6; i++) {
			for(int j = 0;j<7;j++) {
				if(cnt<startDay+lastDate&&cnt>=startDay) {
					dateBoxAr[i][j].repaint();
		        	dateBoxAr[i][j].setLayout(null);
		            planButton[n] = new JButton(changeIcon);
		            planButton[n].setBackground(Color.white);
		            planButton[n].setSize(50,45);
		            planButton[n].setLocation(25,19);
		            planButton[n].addActionListener(new MyActionListener(n+1));
		            dateBoxAr[i][j].add(planButton[n]);
		            n++;
				}
				cnt++;
			}
		}
	}
	//달력을 넘기거나 전으로 이동할 때 날짜 객체에 대한 정보도 변경
	public void updateMonth(int data) {
		//캘린더 객체에 들어있는 날짜를 기준으로 월 정보를 바꿔준다.
		cal.set(Calendar.MONTH, mm+data);
		mm+=data;
		createDay();
		createDate();
		getDateInfo();
		printDate();
		setDateTitle();
		setButton();
	}
	
	//몇년도 몇월인지를 보여주는 타이틀 라벨의 값을 변경
	public void setDateTitle() {
		lb_title.setText(yy+"-"+(mm+1));
		lb_title.updateUI();
	}
	class MyActionListener implements ActionListener{
		int n;
		public MyActionListener(int n){
			this.n=n;
			System.out.println(n);
		}
		public void actionPerformed(ActionEvent e) {
			new DayBox(yy,mm+1,n);
		}
	}
}