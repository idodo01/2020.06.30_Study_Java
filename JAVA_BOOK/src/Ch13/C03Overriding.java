package Ch13;

class Parent {
	int x;
	int y;
	public Parent() {
		this.x = 10;
		this.y = 20;
		
	}
	// ������ �����ε�
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	void ShowMember() {
		System.out.println(this.x+","+this.y);
	}
	
}

class Son extends Parent {
	int z;
	public Son() {
		super(30,30);
		this.z = 30;
		
	}
	// �������̵�
	void ShowMember() {
		System.out.println(this.x+","+this.y+","+this.z);
	}
}
public class C03Overriding {
	public static void main(String[] args) {
		Parent par = new Parent();
		par.ShowMember();
		
		Son son = new Son();
		son.ShowMember();
	}
}