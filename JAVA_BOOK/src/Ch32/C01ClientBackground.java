package Ch32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class C01ClientBackground {

	//소켓연결
	//데이터 송수신
	
	Socket client;
	DataInputStream in;
	DataOutputStream out;
	
	C01ClientUI gui;
	
	void setting(C01ClientUI ui) {
		gui=ui;
	}
	
	void Conn() {
		//소켓접속요청
		//스트림형성
		//수신데이터를 UI Area.append
		try {
			client = new Socket("192.168.3.5",8888);
			
			in=new DataInputStream(client.getInputStream());
			out = new DataOutputStream(client.getOutputStream());
			out.writeUTF("클라이언트 접속 완료 \n");
			String msg;
			//데이터 수신처리
			while(in!=null) {
				msg = in.readUTF();
				gui.appendMsg(msg); // C01ClientUI의 메소드
			}
		}catch(Exception e) {}
	}
	
	// throws IOException: 해당 메소드를 사용한 곳에서 예외를 처리하도록 함
	// 사용하는 곳에서 try-catch사용
	void SendMsg(String msg) throws IOException {
		out.writeUTF("[Client] : "+msg);
	}
}
