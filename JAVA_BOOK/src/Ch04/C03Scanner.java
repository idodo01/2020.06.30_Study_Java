package Ch04;

import java.util.Scanner;

public class C03Scanner {

	// 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	// Scanner ��ü(�ν��Ͻ�) ����
		
												// Scanner: ���� �ڷ���, sc: ��������
												// new Scanner : heap�޸� ������ ���� �Ҵ�(�����Ҵ�)
												// Scanner() : �Լ�
												// System.in : Ű���� stream
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4; 
		System.out.printf("%d + %d + %d + %d = %d \n", num1, num2, num3, num4, sum);

		sc.close();
	}
}