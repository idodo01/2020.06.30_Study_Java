package Ch07;

import java.util.Scanner;

public class C04While2 {
	
	// ������ 9�ܺ��� 2�ܱ��� ���� ���
	public static void main(String[] args) {
	
		int i=9;
		int j=9;
		
		while (i>1) {
			j=9;
			while (j>0) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j--;
			}
			i--;
			System.out.println();
		}
	}
}