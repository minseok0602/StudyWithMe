package app0602.cal.diary;
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
import app0602.cal.diary.StringManager;
import app0602.cal.diary.DateBox;

import toDoList.TodoListApp;
public class Diary extends JFrame{
	
	String[] dayAr = {"Sun", "Mon", "Tue", "Wen", "Thur", "Fri", "Sat"};
	DateBox[] dateBoxAr = new DateBox[dayAr.length*6];
	JPanel p_north;
	JButton[][] plan= new JButton[12][42];
	JButton bt_prev;
	JLabel lb_title;
	JButton bt_next;
	JPanel p_center; //날짜 박스 처리할 영역
	Calendar cal; //날짜 객체
	ImageIcon icon = new ImageIcon(Diary.class.getResource("memo.png"));
	Image img = icon.getImage();
	Image changeImg = img.getScaledInstance(50,45, Image.SCALE_SMOOTH);
	ImageIcon changeIcon = new ImageIcon(changeImg);
	int yy; //기준점이 되는 년도
	int mm; //기준점이 되는 월
	int dd;
	int startDay; //월의 시작 요일
	int lastDate; //월의 마지막 날
	//생성자
	public Diary() {
		//디자인
		p_north = new JPanel();
		bt_prev = new JButton("이전");
		lb_title = new JLabel("년도 올 예정", SwingConstants.CENTER);
		bt_next = new JButton("다음");
		p_center = new JPanel();
		
		//라벨에 폰트 설정
		lb_title.setFont(new Font("Arial-Black", Font.BOLD, 25));
		lb_title.setPreferredSize(new Dimension(300, 30));
		
		p_north.add(bt_prev);
		p_north.add(lb_title);
		p_north.add(bt_next);
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		
		//이전 버튼을 눌렀을 때 전 월로 이동해야함
		bt_prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateMonth(-1);
			}
		});
		
		//다음 버튼을 눌렀을 때 다음 달로 이동해야함
		bt_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateMonth(1);
			}
		});
		
		getCurrentDate(); //현재 날짜 객체 생성
		getDateInfo(); //날짜 객체로부터 정보들 구하기
		setDateTitle(); //타이틀 라벨에 날짜 표시하기
		createDay(); //요일 박스 생성
		createDate(); //날짜 박스 생성
		printDate(); //상자에 날짜 그리기
		setButton();
		setVisible(true);
		setBounds(100, 100, 780, 780);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//현재날짜 객체 만들기
	public void getCurrentDate() {
		cal = Calendar.getInstance();
	}
	
	//시작 요일, 끝 날 등 구하기
	public void getDateInfo() {
		yy = cal.get(Calendar.YEAR);
		mm = cal.get(Calendar.MONTH);
		startDay = getFirstDayOfMonth(yy, mm);
		lastDate = getLastDate(yy, mm);
	}
	
	//요일 생성
	public void createDay() {
		for(int i = 0; i < 7; i++){
			DateBox dayBox = new DateBox(dayAr[i], Color.gray, 100, 70);
			p_center.add(dayBox);
		}
	}
	
	//날짜 생성
	public void createDate() {
		for(int i = 0; i < dayAr.length*6; i++) {
			DateBox dateBox = new DateBox("", Color.LIGHT_GRAY, 100, 70);
			p_center.add(dateBox);
			dateBoxAr[i] = dateBox;
		}
	}
	
	//해당 월의 시작 요일 구하기
	//개발 원리 : 날짜 객체를 해당 월의 1일로 조작한 후, 요일 구하기
	//사용 방법 : 2021년 2월을 구할시 2021, 1을 넣으면 됨
	public int getFirstDayOfMonth(int yy, int mm) {
		Calendar cal = Calendar.getInstance(); //날짜 객체 생성
		cal.set(yy, mm, 1);
		return cal.get(Calendar.DAY_OF_WEEK)-1;//요일은 1부터 시작으로 배열과 쌍을 맞추기 위해 -1
	}
	
	//사용 방법 : 2021년 2월을 구할시 2021, 1을 넣으면 됨
	public int getLastDate(int yy, int mm) {
		Calendar cal = Calendar.getInstance();
		cal.set(yy, mm+1, 0);
		//마지막 날을 의미한다.
		return cal.get(Calendar.DATE);
	}
	
	//날짜 박스에 날짜 출력하기
	public void printDate() {
		System.out.println("시작 요일"+startDay);
		System.out.println("마지막 일"+lastDate);
		
		int n = 1;
		for(int i = 0; i < dateBoxAr.length; i++) {
			if(i >= startDay && n <= lastDate) {
				dateBoxAr[i].day = Integer.toString(n);
				dateBoxAr[i].repaint();
				n++;
			}else {
				dateBoxAr[i].day = "";
				dateBoxAr[i].repaint();
			}
		}
	}
	public void setButton() {

	    int n = 1;
	    for(int i = 0; i < dateBoxAr.length; i++) {
	        if(i >= startDay && n <= lastDate) {
	        	dateBoxAr[i].setLayout(null);
	            plan[mm][n] = new JButton(changeIcon);
	            plan[mm][n].setBackground(Color.white);
	            plan[mm][n].setSize(50,45);
	            plan[mm][n].setLocation(25,19);
	            plan[mm][n].addActionListener(new MyActionListener(n));
	            dateBoxAr[i].add(plan[mm][n]);
	            n++;
	        }
	    }
	}
	//달력을 넘기거나 전으로 이동할 때 날짜 객체에 대한 정보도 변경
	public void updateMonth(int data) {
		//캘린더 객체에 들어있는 날짜를 기준으로 월 정보를 바꿔준다.
		cal.set(Calendar.MONTH, mm+data);
		getDateInfo();
		printDate();
		setDateTitle();
		setButton();
	}
	
	//몇년도 몇월인지를 보여주는 타이틀 라벨의 값을 변경
	public void setDateTitle() {
		lb_title.setText(yy+"-"+StringManager.getZeroString(mm+1));
		lb_title.updateUI();
	}
	class MyActionListener implements ActionListener{
		int n;
		MyActionListener(int n){
			this.n=n;
		}
		public void actionPerformed(ActionEvent e) {
			new TodoListApp(yy,mm+1,n);
		}
	}
	public static void main(String[] args) {
		new Diary();
	}
}