package Ch19;

class Book{
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
 	}
	
	//toString() �������̵�(������)
	@Override							
	public String toString() {
		return bookTitle+","+bookNumber;
	}
	
}

public class C02ObjectToString {

	public static void main(String[] args) {
		Book book1 = new Book(200, "����");

		// �Ȱ��� ��� ��
		System.out.println(book1);				// �ν��Ͻ� ����(Ŭ�����̸�.�ּҰ�)
		System.out.println(book1.toString());	// toSting()�ż���� �ν��Ͻ� ����(Ŭ�����̸�.�ּҰ�)�� ������ 
	}
}