package Ch29;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class C07SwingaddThread extends JFrame implements ActionListener {
	
	JPanel pl;
	// ThreadA가 접근이 가능해짐: static
	static JTextArea area1;
	static JScrollPane scroll1;
	
	static JTextArea area2;
	static JScrollPane scroll2;
	
	TextField txt1;
	JButton btn1;
	JButton btn2;
	
	C07SwingaddThread() {
		super("스레드를 동작시키는 프레임 창");
		
		// panel
		pl = new JPanel();
		
		// textarea, scroll
		area1 = new JTextArea(10,30);
		scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,10,450,150);
		
		area2 = new JTextArea(10,30);
		scroll2 = new JScrollPane(area2);
		scroll2.setBounds(10,280,450,150);
				
		// text
		txt1 = new TextField();
		txt1.setBounds(10,170,150,30);
		txt1.addActionListener(this); // 객체를 Listener로 확인할 수 있도록
		
		// button
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(10,220,150,30);
		btn1.addActionListener(this); // 객체를 Listener로 확인할 수 있도록
		
		btn2 = new JButton("파일에서 불러오기");
		btn2.setBounds(10,450,150,30);
		btn2.addActionListener(this); // 객체를 Listener로 확인할 수 있도록
		
		// add
		pl.add(scroll1);
		pl.add(scroll2);
		pl.add(txt1);
		pl.add(btn1);
		pl.add(btn2);
		add(pl);
		pl.setLayout(null);
		setSize(500,700);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new C07SwingaddThread();
		ThreadA task1 = new ThreadA();
		Thread th1 = new Thread(task1);
		th1.start();
		
		while(true) {

			C07SwingaddThread.area1.append("This is MainThread\n");
			// 스트롤이 자동으로 내려갈 수 있도록
			// 최대 값을 전달함
			C07SwingaddThread.scroll1.getVerticalScrollBar().setValue(C07SwingaddThread.scroll1.getVerticalScrollBar().getMaximum());
			
			try {Thread.sleep(1200);}catch(Exception e) {}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TxtField의 내용을 TextArea에 추가하기
		if(e.getSource()==txt1)
		{
			area1.append(txt1.getText()+"\n");
			txt1.setText("");
		} 
		// bt1 버튼을 누르면 TextArea의 내용을 파일로 저장하기
		if(e.getSource()==btn1)
		{
			try {
				Writer out = new FileWriter("c:/temp/Dialog.txt");
				out.write(area1.getText());
				out.flush();
				out.close();
			} catch (Exception ec) {
			}
		}
		// bt2 버튼을 누르면 파일의 내용을 TextArea에 불러내기
		if(e.getSource()==btn2)
		{
			try {
				Reader in = new FileReader("c:/temp/Dialog.txt");
				String tmp;
				char ch;
				int readNum;
				
				while(true) {
					readNum = in.read(); // 한문자
					if(readNum==-1) 
						break;
					ch=(char)readNum;
					tmp=Character.toString(ch);
					area2.append(tmp);
				}
				
			} catch (Exception ec) {
			}
		}
		
		
		
	}
}

class ThreadA implements Runnable {

	// implements를 하면 run()이 강제 상속됨
	@Override
	public void run() {
		while(true) {

			C07SwingaddThread.area1.append("This is Thread\n");
			// 스트롤이 자동으로 내려갈 수 있도록
			// 최대 값을 전달함
			C07SwingaddThread.scroll1.getVerticalScrollBar().setValue(C07SwingaddThread.scroll1.getVerticalScrollBar().getMaximum());
			
			try {Thread.sleep(1000);}catch(Exception e) {}
			
		}
	}
	
}

