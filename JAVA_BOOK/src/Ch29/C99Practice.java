package Ch29;

import java.awt.Color;
import java.awt.TextArea;

import javax.swing.*;

public class C99Practice extends JFrame {
	
	public C99Practice() {
		super("TEST");
		// �г� ����
		JPanel pl = new JPanel();
				
		// TextArea ��ü ����
		TextArea Area1 = new TextArea();
		// TextArea ��ġ ����
		Area1.setBounds(10,10,400,200);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,240,200,30);

		JButton btn1 = new JButton("INSERT");
		btn1.setBounds(10,280,100,30);
		
		// �гο� ��� �߰�
		pl.add(Area1);
		pl.add(txt1);
		pl.add(btn1);
		pl.setLayout(null);
		add(pl);
		
		// �г�(������) ������ ����
		setSize(500,500);
		// ȭ�� ǥ�� ����
		setVisible(true);
	}
	public static void main(String[] args) {
		new C99Practice();
	}
	
}