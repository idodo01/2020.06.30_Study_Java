package Ch13;

public class C02CellPhone {

	// �Ӽ�(�ʵ�)
	String model;
	String color;
	
	// ������(����Ʈ)
	
	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("���� : "+message);
	}
	void recevieVoice(String message) {
		System.out.println("���� : "+message);
	}	
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}