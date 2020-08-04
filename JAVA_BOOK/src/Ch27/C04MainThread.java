package Ch27;

// ������
public class C04MainThread {
	
	// ���� ���� 2���� �迭 ��ü
	public static int [][]map = new int[3][3];
	
	
	public static void main(String[] args) {
		
		// ������ ch04Thread1 �� map[0]° ��ҿ��� 1�� 0.5�� ���� ���������� �̵�
		// ������ ch04Thread2 �� map[1]° ��ҿ��� 1�� 0.7�� ���� ���������� �̵�
		// ������ ch04Thread3 �� map[2]° ��ҿ��� 1�� 0.9�� ���� ���������� �̵�
		int i = 0, j = 0;
		
		ch04Thread1 t1 = new ch04Thread1();
		Thread th1 = new Thread(t1);
		th1.start();

		ch04Thread2 t2 = new ch04Thread2();
		Thread th2 = new Thread(t2);
		th2.start();
		
		ch04Thread3 t3 = new ch04Thread3();
		Thread th3 = new Thread(t3);
		th3.start();
		while(true) {
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.print(map[i][j]+"");
				}
				System.out.println();
			}
			System.out.println();
			try { Thread.sleep(1000);} catch (Exception e) {} // ������
		}
	}
}