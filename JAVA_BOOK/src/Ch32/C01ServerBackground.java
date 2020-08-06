package Ch32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C01ServerBackground {

	//���Ͽ���
	//�����ͼ���
	//�����ͼ۽�
	ServerSocket server;
	Socket client;
	DataInputStream in;
	DataOutputStream out;
	
	C01ServerUI gui;
	
	void setting(C01ServerUI ui) {
		this.gui = ui;
	}
	
	//���Ͽ��� + ������ ���� + ����-Area.append �뵵
	void Conn() {
		try {
			//���Ͽ���
			server = new ServerSocket(7777);
			client = server.accept();
			//��Ʈ�� ����
			in = new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			
			//������ ���ſ� �ڵ�
			while(in!=null) {
				String msg = in.readUTF();
				gui.appendMsg(msg); // C01ServerUI�� �޼ҵ�
			}
		}catch(Exception e) {}
	}

	// throws IOException: �ش� �޼ҵ带 ����� ������ ���ܸ� ó���ϵ��� ��
	// ����ϴ� ������ try-catch���
	void sendMsg(String msg) throws IOException {
		out.writeUTF("[Server] : "+msg);
	}

}