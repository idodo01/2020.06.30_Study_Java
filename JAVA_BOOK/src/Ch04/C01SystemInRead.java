package Ch04;

import java.io.IOException;

public class C01SystemInRead {
	public static void main(String[] args) throws IOException { // ����ó��
		int keyCode;
		
/*
		// read()�� �ѹ��ڸ� �޴´�.
		// 10�̻��� ���� �Է¹����� 1�� �ν���
		keyCode = System.in.read()-48; // ����0�� ���� ���� 48�̱⿡ 0�� ����ϱ� ���ؼ� -48
		System.out.println("KeyCode: "+keyCode);
*/
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: "+keyCode);
		}
		
		/*
		 * 123456
			keyCode: 49
			keyCode: 50
			keyCode: 51
			keyCode: 52
			keyCode: 53
			keyCode: 54
			keyCode: 13 -> carriage return
			keyCode: 10 -> line feed => enter
		 * */
		
	}
}