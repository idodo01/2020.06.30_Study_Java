package Ch19;

//object Ŭ������ ToString

public class C01ObjectToString {
	public static void main(String[] args) {
	
	Object ob1 = new Object();
	
	
	System.out.println(ob1);
	System.out.println(ob1.toString());
	
	} 
}
//���� ���ڿ��� ����
//(�ڹٿ� ����) ��ü���� ������ ��ü�� toString�̶�� �޼ҵ带 �⺻������ �����Ѵ�.
//�Ϲ������� toString�� �� ��ü�� �������ִ� ���ڿ��� �����Ѵ�.
//�׸��� ��ü�� toString�� �����(overriding)�ϸ� �ٸ� ������ ���ڿ��� ������ �� �ִ�.
//���ڿ��� ���Ǵ� ������ ���ڿ��� �ƴ� ��ü�� ����ϸ� �ý����� �Ͻ������� toString�� ȣ���Ѵ�.
//�ڹٽ�ũ��Ʈ������ prototype�� �̿��� ��ü�� �޼ҵ带 �����(override)�� �� �ִ�