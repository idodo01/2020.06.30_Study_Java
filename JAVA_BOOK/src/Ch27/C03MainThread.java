package Ch27;

// ������
public class C03MainThread {
	public static void main(String[] args) {
		
		C03ThreadA t1 = new C03ThreadA();
		Thread th1 = new Thread(t1);
		th1.start();
		
		C03ThreadB t2 = new C03ThreadB();
		Thread th2 = new Thread(t2);
		th2.start();
		
		try { Thread.sleep(1000);} catch (Exception e) {} // ������
		System.out.println("Main�����忡�� �۾������� Ȯ��"+t1.getName());
		System.out.println("Main�����忡�� �۾������� Ȯ��"+t2.getName());
	}
}