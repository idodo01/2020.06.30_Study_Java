package Ch06;

import java.util.Scanner;

public class C01Exam05 {

	public static void main(String[] args) {
		// 두수를 입력 받아 큰 수를 출력하시오
		Scanner scan = new Scanner(System.in);
		
		// 값 입력
		int iNum1 = scan.nextInt();
		int iNum2 = scan.nextInt();
		
		// 값 비교
		if(iNum1>iNum2) {
			System.out.println(iNum1+"이 더 큽니다");
		} else if(iNum1<iNum2) {
			System.out.println(iNum2+"이 더 큽니다");
		} else {
			System.out.println("두 수가 같습니다");
		}
		
				
	}

}
