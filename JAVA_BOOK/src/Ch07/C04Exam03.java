package Ch07;

import java.util.Scanner;

public class C04Exam03 {
	
	public static void main(String[] args) {
		//����3
		//----------------------------------------------
		//���α׷� ����ڷκ��� �Է� ���� ������ ����� ����ϴ� ���α׷��� �ۼ��ϵ� ���� �ΰ���
		//������ �������Ѿ� �Ѵ�
		//1) ���� �� ���� ������ �Է��� ������ ���α׷� ����ڿ��� ���´�.
		//�׸��� �� ����ŭ ������ �Է� �޴´�
		//2) ��� ���� �Ҽ��� ���ϱ��� ����ؼ� ����Ѵ�
		
		Scanner scan = new Scanner(System.in);
		
		// ���� �Է�
		int iCnt = scan.nextInt();
		// �Է¹��� ����ŭ ������ �Է�
		int[] iNum = new int[iCnt];
		// ��� ���� ���ϱ� ���� ���� ��
		int iSum = 0;
		
		int i = 0;

		// ���� �Է� �� �ձ��ϱ�
		while(i<iNum.length) {
			iNum[i] = scan.nextInt();
			iSum+=iNum[i];
			i++;
		}
		
		// �Ҽ��� ���ϱ��� ��� ���
		System.out.println((float)iSum/iNum.length);
		
		
	}
}