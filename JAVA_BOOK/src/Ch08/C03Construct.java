package Ch08;

public class C03Construct {
	private int x;
	private int y;
	
	// ����Ʈ ������
	public C03Construct() {
		x=10;
		y=20;
	}
	
	public void showxy() {
		// ������� �� ������ ��ü : this
		System.out.println(this.x);
		System.out.println(this.y);
	}



}