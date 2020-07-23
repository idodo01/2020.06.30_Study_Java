package Ch24;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C099Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <String> list = new LinkedList<String>();
		String sInput = "";
				
		for (int i = 0; ; i++) {
			System.out.print("문자열을 입력하세요(종료:quit): ");
			sInput=scan.nextLine();
			if(sInput.equals("quit")) break; // quit 입력시 반복문 종료
			list.add(sInput); // 리스트에 값 삽입
		}
		System.out.println("-------문자열 목록---------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+" "+list.get(i));
		}
	}
	
}
