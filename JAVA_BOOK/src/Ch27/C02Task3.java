package Ch27;

// ������
public class C02Task3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Task3:"+i);
			try {Thread.sleep(500);} catch(Exception e) {};
		}
	}
}