package Ch11;
public class C07BookArray {

	public static void main(String[] args) {
		// �迭�� ��ü�� ��´�.
		C06Book [] library = new C06Book[5];
		
		//						å�̸�, �۰� �̸�
		library[0] = new C06Book("�¹���","������");
		library[1] = new C06Book("���̾�","�츣�� �켼");
		library[2] = new C06Book("��� �� ���ΰ�","���ù�");
		library[3] = new C06Book("����","�ڰ渮");
		library[4] = new C06Book("�����","�������丮");
		
		// å �̸�, �۰� �̸� ���
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();
		}
		
		// ��ü �ּ� ���
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
	}
	
	
}
