package Ch25;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;


// 	���ڿ� �Է� (����:quit): Hello World
//	���ڿ� �Է� (����:quit): This is Test
//	���ڿ� �Է� (����:quit): bye
//	���ڿ� �Է� (����:quit): quit
//	�����մϴ�

//1.Hello World
//2.This is Test
//3.bye

public class C08Practice {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			Writer out = new FileWriter("c:/temp/testTest.txt"); // ���� ���
			
			String tmp = null;
			int Cnt = 0;
			while(true) {
				Cnt++;
				System.out.print("���ڿ� �Է� (����:quit): ");
				tmp = scan.nextLine(); // ���ڿ� �Է¹ޱ�
				if(tmp.equals("quit")) break;
				out.append(Cnt+"."+tmp+"\n");

			}
			out.flush();
			out.close();
			System.out.println("�����մϴ�");
		} catch(Exception e) {
			
		}
	}
}