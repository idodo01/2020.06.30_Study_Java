package Ch25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//자바 바이트 스크림
public class C03StreamEx {

	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("c:/temp/tes3.db");
		
			byte[] array = {10,20,30,40,50};
			
			//	char[] b, int off, int len: off부터 len만큼 write 
			// 20,30,40
			out.write(array,1,3);
			out.flush();
			out.close();
			
			InputStream in = new FileInputStream("c:/temp/test3.db");
			byte[] buffer = new byte[100];
			int readNum;
			
			while(true) {
				// 읽은 것을 buffer에 저장
				// 개수가 readNum에 들어감
				readNum = in.read(buffer); // read()의 반환형: int
				// 읽을 것이 없으면 -1 반환
				if(readNum == -1) break;
				for(int i=0; i<readNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch(Exception e) {
			
		}
	}

}
