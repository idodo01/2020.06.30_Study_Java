package Ch10;

public class C01StringClass {
	public static void main(String[] args) {
		// �ּҰ��� ����
		String mystr1 = "java";
		String mystr2 = "java";
		// �����Ҵ�, �ּҰ��� �����ٸ�
		String mystr3 = new String("java");
		String mystr4 = new String("java");
		
		System.out.println("== �� ���   "); 
		System.out.println("mystr1 = mystr2 : "+(mystr1 == mystr2)); // true
		System.out.println("mystr3 = mystr4 : "+(mystr3 == mystr4));
		System.out.println("mystr1 = mystr3 : "+(mystr1 == mystr3));
		System.out.println("mystr1 = mystr4 : "+(mystr1 == mystr4)); 
		
		// equals �޼ҵ带 ���� ���ڿ� ��ġ ���� ��
		System.out.println("equals �޼ҵ� �� ��� ");
		System.out.println("mystr1 = mystr2 : " + (mystr1.equals(mystr2))); // true
		System.out.println("mystr3 = mystr4 : " + (mystr3.equals(mystr4))); // true
		System.out.println("mystr1 = mystr3 : " + (mystr1.equals(mystr3))); // true
		System.out.println("mystr1 = mystr4 : " + (mystr1.equals(mystr4))); // true
	}
}