package Ch04;

import java.util.Scanner;

public class C03Scanner {

	// 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	// Scanner 객체(인스턴스) 생성
		
												// Scanner: 참조 자료형, sc: 참조변수
												// new Scanner : heap메모리 영역에 공간 할당(동적할당)
												// Scanner() : 함수
												// System.in : 키보드 stream
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4; 
		System.out.printf("%d + %d + %d + %d = %d \n", num1, num2, num3, num4, sum);

		sc.close();
	}
}
