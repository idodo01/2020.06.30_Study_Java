package Ch28;


// ������
public class C02MainThread {
	public static void main(String[] args) {
		// Stop Flag�� �̿��� ������ ����
		C02ThreadExit task = new C02ThreadExit();
		Thread th = new Thread(task);
		th.start();
		
		try {Thread.sleep(500);} catch(Exception e) {};
		System.out.println("������ ���Ḧ ���ϴ� ����");
		task.setStop(true);
		
	}
}