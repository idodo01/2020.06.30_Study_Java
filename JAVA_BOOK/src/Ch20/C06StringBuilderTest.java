package Ch20;

//concat() ���ο� ��ü�� ���� ���ڿ��� ����
		// ���� ��ü�� �޸𸮿� �δ��� ��
		// �ذ�:  StringBuilder


public class C06StringBuilderTest {
	public static void main(String[] args) {
		String str1 = new String("java");
		
		StringBuilder builder = new StringBuilder(str1);

		System.out.println(System.identityHashCode(builder)); 
		builder.append(" and");
		System.out.println(System.identityHashCode(builder)); 
		builder.append(" Android");
		System.out.println(System.identityHashCode(builder)); 
		builder.append(" Programming is Fun");
		System.out.println(System.identityHashCode(builder)); 
		
		str1 = builder.toString();
		System.out.println(str1);
	}
}