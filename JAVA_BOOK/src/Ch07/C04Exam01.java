package Ch07;

import java.util.Scanner;

public class C04Exam01 {
	
	public static void main(String[] args) {
		//문제1
		//----------------------------------------------
		//프로그램 사용자로부터 양의 정수를 하나 입력받아서, 그 수만큼 "Hello world!"를
		//출력하는 프로그램을 작성
		
		Scanner scan = new Scanner(System.in);
		
		// 양의 정수 입력
		int iNum = scan.nextInt();
		int i = 0;
		
		// 입력한 수만큼 반복
		while(i<iNum) {
			System.out.println("Hello world!");
			i++;
		}
	}
}