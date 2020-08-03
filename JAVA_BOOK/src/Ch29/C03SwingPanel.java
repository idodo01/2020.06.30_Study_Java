package Ch29;

import java.awt.*;

import javax.swing.*;

public class C03SwingPanel extends JFrame {
	
	JButton btn1, btn2, btn3;
	
	public C03SwingPanel() {
		
		super("세번째 프레임 창입니다");
		JPanel pl = new JPanel();
		// 배경색 지정
		pl.setBackground(Color.ORANGE);
		
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		/*
		btn1.setBounds(50,50,70,70);
		btn2.setBounds(50,120,90,90);
		btn3.setBounds(50,200,90,90);
		*/
		pl.add(btn1);
		pl.add(btn2);
		pl.add(btn3);
		
		add(pl);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {

		// 자바 프레임 창 생성
		new C03SwingPanel();
		
	}
}
