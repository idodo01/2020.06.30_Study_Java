package Ch11;

public class C06Book {
	private String bookName;
	private String author;
	
	// ����Ʈ ������
	public C06Book() {};
	
	// ������ �����ε�
	public C06Book(String bookName, String author) {
		this.bookName = bookName;
		this.author=author;
	}
	
	// å �̸� getter
	public String getBookName() {
		return bookName;
	}
	// �۰� �̸� getter
	public String getAuthor() {
		return author;
	}
	
	// å �̸� setter
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	
	// �۰� �̸� setter
	public void setAuthor(String author) {
		this.author=author;
	}
	
	// å �̸��̶� �۰� �̸� ���
	public void showBookInfo() {
		System.out.println(bookName+" , "+author);
	}
	
}