package Ch09;

// ������ �����ε�
public class C02ConstOver {
	// �Ű�����
	// �Ű����� �ʱⰪ�� ������ �ڵ� 0
	int x;
	int y;
	int z;
	
	// �����ڴ� ���ϰ��� ����
	// �۾��� �⺻ ���� �������ִ� ��
	
	// ����Ʈ ������
	public C02ConstOver() {
		
	}
	
	// �����ε��� ������ - �Ű����� 2
	public C02ConstOver(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	// �����ε��� ������ - �Ű����� 3
	
	public C02ConstOver(int a, int b, int c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}
	
	public void ShowPoint() {
		System.out.println(this.x+","+this.y+","+this.z);
	}
}