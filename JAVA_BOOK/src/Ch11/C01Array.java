package Ch11;

public class C01Array {
	public static void main(String[] args) {
		// �迭�� �������� ������ �ν��Ͻ�(��ü) ������ ���ÿ�
		int[] arr1 = new int[5];
		double[] arr2 = new double[7];
		
		// �迭�� ���������� �ν��Ͻ�(��ü) ���� �и�
		float[] arr3;
		arr3 = new float[9];
		
		System.out.println("arr1 �迭�� ����: "+arr1.length);
		System.out.println("arr2 �迭�� ����: "+arr2.length);
		System.out.println("arr3 �迭�� ����: "+arr3.length);
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		int i = 0;
		while (i<arr1.length) {
			System.out.println(arr1[i]);
			i++;
		}
		
	}
}