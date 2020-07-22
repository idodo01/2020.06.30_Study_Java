package Ch22;

public class C01NullPointerException {
	public static void main(String[] args) {

		// ���ܹ߻��� try-catch�� ���
		try {
			String data = null;
			System.out.println(data.toString());
			
			// Exception in thread "main" java.lang.NullPointerException
			//		at Ch22.C01NullPointerException.main(C01NullPointerException.java:6)

		} catch(NullPointerException e) {
			System.out.println("NullPointerException���ܹ߻��� ���!!");
			System.out.println(	e.getCause()); // �����
			System.out.println(	e.toString()); // �������� 
			e.printStackTrace(); // ��� �ڵ带 �����ϰ� �������� ������ ���
		
		}
		System.out.println("����ó�� ���� ���!!");
	}
}