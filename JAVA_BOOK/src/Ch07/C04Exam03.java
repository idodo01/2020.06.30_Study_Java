package Ch07;

import java.util.Scanner;

public class C04Exam03 {
	
	public static void main(String[] args) {
		//문제3
		//----------------------------------------------
		//프로그램 사용자로부터 입력 받은 정수의 평균을 출력하는 프로그램을 작성하되 다음 두가지
		//조건을 만족시켜야 한다
		//1) 먼저 몇 개의 정수를 입력할 것인지 프로그램 사용자에게 묻는다.
		//그리고 그 수만큼 정수를 입력 받는다
		//2) 평균 값은 소수점 이하까지 계산해서 출력한다
		
		Scanner scan = new Scanner(System.in);
		
		// 정수 입력
		int iCnt = scan.nextInt();
		// 입력받은 수만큼 정수를 입력
		int[] iNum = new int[iCnt];
		// 평균 값을 구하기 위한 정수 합
		int iSum = 0;
		
		int i = 0;

		// 정수 입력 및 합구하기
		while(i<iNum.length) {
			iNum[i] = scan.nextInt();
			iSum+=iNum[i];
			i++;
		}
		
		// 소수점 이하까지 평균 출력
		System.out.println((float)iSum/iNum.length);
		
		
	}
}