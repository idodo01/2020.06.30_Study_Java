package Ch29;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class C06SwingTextAreaActionListener extends JFrame implements ActionListener{
	JTextArea Area1;
	JTextField txt1;
	JButton btn;
	JScrollPane scollPane;
	public C06SwingTextAreaActionListener()
	{
		super("�ټ���° ������â�Դϴ�");	//������ ������ ȣ��
		JPanel Pl = new JPanel();	//�г� ��ü ����
		
		Area1 = new JTextArea(10,10);	//TextArea��ü ����
		//Area1.setBounds(10,10,310,310);			//TextArea��ġ ����
		
		scollPane=new JScrollPane(Area1);
		scollPane.setBounds(10,10,450,150);
		
		txt1 = new JTextField();
		txt1.setBounds(10,340,100,20);

		btn=new JButton("INSERT");
		btn.setBounds(10,370,100,20);
		
		
		//Pl.add(Area1);		//�гο� Area1 �߰�
		Pl.add(scollPane);	//��ũ�� Pane �߰� 
		Pl.add(txt1);		//�гο� txt1 �߰�
		Pl.add(btn);
		Pl.setLayout(null);	//���̾ƿ� ���� ����
		add(Pl);		//�����ӿ� �г� ����

		setSize(500,500);	//�гλ�����(==�����ӻ�����) ����
		setVisible(true);	//ȭ�� ǥ�� ����
	}
	public static void main(String[] args) {
		new C06SwingTextAreaActionListener();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==txt1)
		{
			Area1.append(txt1.getText()+"\n");
			txt1.setText("");
		}
		if(e.getSource()==btn)
		{
			Area1.append("��ư�Է�\n");
		}
		
	}

}