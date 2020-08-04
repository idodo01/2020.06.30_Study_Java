package Ch31;

import java.io.DataInputStream;
import java.net.Socket;

public class C01ClientRecvThread implements Runnable {
	
	Socket client;
	
	public void setSocket(Socket socket) { // ���� ����
		client = socket;
	}

	@Override
	public void run() {
		try {
			DataInputStream in = new DataInputStream(client.getInputStream());
			String msg; // ���� �޼����� ����
			while(true) {
				msg = in.readUTF(); // Ŭ���̾�Ʈ�� ���� �޼����� ������ ����
				if(msg.equals("quit")) { // �޼����� ������ quit�̸�
					System.out.println("��������");
					System.exit(1); // ��������
				}
				System.out.println("[Server]: "+msg); // �޼����� ������ quit�� �ƴϸ� console�� print
			}
		} catch (Exception e) {}
		
	}

}