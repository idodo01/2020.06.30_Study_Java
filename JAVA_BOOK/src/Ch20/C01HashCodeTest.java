package Ch20;
//HashCode �� ��ü���� �ο��� ��ȣ���� �ּҴ� �ƴϴ�
//HashCode �� ��ü���� ���� ������ ���� �ο��Ǿ���(Ȯ���Ұ�)
//HashCode �� ����ؼ� ���� ��ü���� �ƴ��� ���� �� �ִ�
public class C01HashCodeTest {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println("----equals�ż���  Ȯ��----");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));
		
		System.out.println("----JVM�� �ο��� �ּ� Ȯ��----");
		System.out.println(obj1); //�ڹ� ����ӽ��� �ο��� ��ü�� �ּҰ�����
		System.out.println(obj2); 
		System.out.println(obj3);
		
		System.out.println("----��ü ���� ��ȣ Ȯ��----");
		System.out.println(obj1.hashCode()); //��ü�� ������ȣ�� ��ȯ
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.printf("%x\n", obj1.hashCode());
		System.out.printf("%x\n", obj2.hashCode());
		System.out.printf("%x\n", obj3.hashCode());
	}
}