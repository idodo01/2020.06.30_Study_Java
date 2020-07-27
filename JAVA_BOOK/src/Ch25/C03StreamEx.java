package Ch25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//�ڹ� ����Ʈ ��ũ��
public class C03StreamEx {

	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("c:/temp/tes3.db");
		
			byte[] array = {10,20,30,40,50};
			
			//	char[] b, int off, int len: off���� len��ŭ write 
			// 20,30,40
			out.write(array,1,3);
			out.flush();
			out.close();
			
			InputStream in = new FileInputStream("c:/temp/test3.db");
			byte[] buffer = new byte[100];
			int readNum;
			
			while(true) {
				// ���� ���� buffer�� ����
				// ������ readNum�� ��
				readNum = in.read(buffer); // read()�� ��ȯ��: int
				// ���� ���� ������ -1 ��ȯ
				if(readNum == -1) break;
				for(int i=0; i<readNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			
		} catch(Exception e) {
			
		}
	}

}