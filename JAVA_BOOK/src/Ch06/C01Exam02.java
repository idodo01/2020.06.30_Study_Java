package Ch06;

import java.util.Scanner;

public class C01Exam02 {

	public static void main(String[] args) {
		// ������ ������ �Է¹޾Ƽ� �հ�� ����� ���
		// ����� �Ҽ� ���ϸ� ������ ������ ���
		Scanner scan = new Scanner(System.in);
		int[] iNum = new int[3];
		int iSum = 0;
		
		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = scan.nextInt();
			iSum += iNum[i];
		}
		System.out.println("�հ�: "+iSum+", ���: "+(iSum/iNum.length));
				
	}

}