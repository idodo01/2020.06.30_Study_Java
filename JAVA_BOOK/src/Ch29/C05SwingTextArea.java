package Ch29;

import java.awt.*;
import javax.swing.*;

public class C05SwingTextArea extends JFrame {
	
	public C05SwingTextArea() {
		
		super("�ټ���° ������ â�Դϴ�");
		// �г� ����
		JPanel pl = new JPanel();
		// ���� ����
		pl.setBackground(Color.ORANGE);
				
		// TextArea ��ü ����
		TextArea Area1 = new TextArea();
		// TextArea ��ġ ����
		Area1.setBounds(10,10,200,100);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10,210,100,100);
		
		// �гο� ��� �߰�
		pl.add(Area1);
		pl.add(txt1);
		pl.setLayout(null);
		add(pl);
		
		// �г�(������) ������ ����
		setSize(500,500);
		// ȭ�� ǥ�� ����
		setVisible(true);
	}
	
	public static void main(String[] args) {

		// �ڹ� ������ â ����
		new C05SwingTextArea();
		
	}
}