package Ch28;

// ������
public class C02ThreadExit  implements Runnable {
	
	private boolean stop = false;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		while(!stop) { // stop�� false�� ��, �ݺ�
			System.out.println("Thread ������");
		} 
		
		System.out.println("�ڿ� �����κ�");
		System.out.println("Thread ��������");
		
	}
	
	
}