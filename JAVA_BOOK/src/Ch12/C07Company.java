package Ch12;

// �̱��� ����
public class C07Company {
	// method ���� instance
	private static C07Company instance = new C07Company();
	private C07Company() {}
	
	public static C07Company getInstance(){
		if (instance==null) {
			instance = new C07Company();
		}
		return instance; // ��ü�� �ּҰ� ��ȯ
	}
}
