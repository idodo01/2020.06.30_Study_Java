package Ch32;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C01ServerUI extends JFrame implements ActionListener{

	public JTextField txt;
	public JTextArea area;
	public JPanel panel;
	public JScrollPane scroll;
	
	// 백그라운드 객체생성
	C01ServerBackground background=new C01ServerBackground();
	
	C01ServerUI() {
		super("Server");	//프레임창 생성
		setSize(500,500);
		
		panel=new JPanel();	//패널추가
		panel.setLayout(null);//레이아웃 지정
		
		//컴포넌트 추가
		txt=new JTextField();
		txt.setBounds(10,320,450,40);
		txt.addActionListener(this);
		
		area=new JTextArea(10,30);
		scroll=new JScrollPane(area);
		scroll.setBounds(10,10,450,300);

		//패널에 컴포넌트 등록
		panel.add(txt);
		panel.add(scroll);
		
		//패널을 프레임에 지정
		add(panel);	
		setVisible(true);
		
		// C01ServerBackground 객체
		background.setting(this);
		background.Conn();
		
	}
	
	public static void main(String[] args) {
		new C01ServerUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==txt) {
			try {
			String msg = txt.getText()+"\n";
			area.append("[Server] : " + msg);
			background.sendMsg(msg); // C01ServerBackground의 메소드
			txt.setText("");
			}catch(Exception arg0) {}
		}
	}

	void appendMsg(String msg){
		area.append(msg);
	}
}
