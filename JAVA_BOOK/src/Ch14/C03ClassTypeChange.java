package Ch14;

class Animal {
	int x = 10;
	
}
class Human extends Animal {
	int y = 20;
}

class Tiger extends Animal {
	int z = 20;
}

public class C03ClassTypeChange {
	public static void main(String[] args) {
		Animal ani = new Human();
		System.out.println(ani.x);
		//System.out.println(ani.y); // 접근 불가
		
		// 다운 캐스팅 성공!
		if(ani instanceof Human) {
			Human man = (Human) ani;
		}
//		System.out.println(man.x);
//		System.out.println(man.y);
		
		// 잘못된 다운캐스팅
		// Human과 Tiger은 상속관계가 아님
		Animal ani2 = new Tiger();
		if(ani2 instanceof Human) {
			Human man2 = (Human) ani2;
		}
//		System.out.println(man2.x);
//		System.out.println(man2.y); 
		// System.out.println(man2.z); // 접근 불가
		
	}
}
