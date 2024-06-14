package Calendar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//달력의 반복되는 판넬을 객체로 만들어 생성하기
public class DayBoxView extends JPanel{
	String day;
	Color color;
	int width;
	int height;
	public DayBoxView(String day,  Color color, int width, int height) {
		this.day = day;
		this.color = color;
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));		
	}
	
	//paint를 재정의하면 컴포넌트에 내가 원하는 것을 그릴 수 있다.
	//이를 이용해서 배경색과 글씨를 넣기
	public void paint(Graphics g) {
		g.setColor(color);
		//꽉찬 상자를 넣는 것인데 위에서 설정한 색으로 배경색을 칠하는 것
		g.fillRect(0, 0, width, height);
		
		g.setColor(Color.yellow);
		//글씨를 그리는 것인데 첫번 째 매개변수는 글씨의 내용
		//2번째는 x축  3번째는 y축
		g.drawString(day, 10, 20);
	}
}