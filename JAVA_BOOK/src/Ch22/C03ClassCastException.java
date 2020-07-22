package Ch22;

class Animal {};
class Dog extends Animal {}
class Cat extends Animal {}


public class C03ClassCastException {

	// Ŭ���� UP/DOWN Casting �޼���
	public static void ChangeDog(Animal animal) { // UP Casting 
		try {
			// DOWN Casting 
			Dog	dog = (Dog) animal;	// Ŭ���� ���ܹ߻� 
				
		} catch(ClassCastException e) {
			System.out.println("ĳ��Ʈ �����߻�");
		} finally {
			System.out.println("finally����");
		}
	}
	

	// ���θ޼���
	public static void main(String[] args) {
		Dog dog = new Dog();
		ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(cat); // dog�� cat�� ��Ӱ��谡 �ƴ϶� ���������
		System.out.println("���� �Լ��� ����");
	}
}