package Ch14;

public class C04Pencil extends C04MoonBanggu {
	
	public C04Pencil() {
		if(PencilCount>0) {
			PencilCount--;
		}
		else {
			System.out.println("����� �����ϴ�.");
			// System.exit(0); // ���α׷� ����
		}
	}
	void write() {
		System.out.println("���ʸ� ���ô�");
	}
}