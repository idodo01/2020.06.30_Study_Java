package Ch30;

import java.io.DataInputStream;
import java.net.Socket;

public class C01SocketClient {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.3.10",2020); // "" <- ���� ip����
			DataInputStream in;
			in = new DataInputStream(client.getInputStream());
			String tmp = in.readUTF(); // �������·� ����
			System.out.println(tmp);
			
		} catch (Exception e) {
		}
	}
}