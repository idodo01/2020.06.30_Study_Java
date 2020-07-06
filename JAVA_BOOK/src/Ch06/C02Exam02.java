package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class C02Exam02 {
	
	public static void main(String[] args) {
		// 세 수를 입력 받아 최대값과 최소값을 구하세요

		Scanner scan = new Scanner(System.in);
		
		// 세 수를 담을 배열
		int[] iNum = new int[3];
		
		// 세 수 입력
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
		}
		
		// 배열 값 오름차수 정렬
		Arrays.sort(iNum); 
		
		System.out.println("가장 작은 수"+iNum[0]);
		System.out.println("가장 큰 수"+iNum[2]);
		
		
	}

}
