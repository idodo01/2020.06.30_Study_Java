package Ch25;

import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Scanner�� ID�� PW�� �޾Ƽ� HashMap�� ������
// ����� ID�� PW�� C:/temp/Account.txt�� ����

//ID: aaaa, PW:1111
//ID: bbbb, PW:2222
//ID: cccc, PW:3333
//ID: dddd, PW:4444

public class C09Pratice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap();
		
		String ID = null;
		String PW = null;
		// �Է¹ޱ�
		while(true) {
			System.out.print("ID�Է� (����:q): ");
			ID = sc.nextLine();
			if(ID.equals("q")) {
				break;
			}
			System.out.print("PW�Է� (����:q): ");
			PW = sc.nextLine();
			if(PW.equals("q")) {
				break;
			}
			// ��ü�߰�
			map.put(ID,PW);
		}
		
		try { 
			Writer out = new FileWriter("c:/temp/Account.txt");
			Set<String> set = map.keySet();
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				ID = iter.next();
				PW = map.get(ID);
				out.write("ID: "+ID+", PW:"+PW+"\n");
				out.flush();
				
			}
			System.out.println("����");
			out.close();
			sc.close();
			
			
		} catch(Exception e) {
			
		}
	}
}