package Ch09;

public class C03PointMain {
	public static void main(String[] args) {
		C03Point pt01 = new C03Point();
		pt01.setX(10);
		pt01.setY(20);
		// private이기에 접근불가능
		// pt01.x = 5;
		
		System.out.println(pt01.getX()+","+pt01.getY());
		
		
		C03Point pt02 = new C03Point();
		pt02.setX(60);
		pt02.setY(70);
		
		System.out.println(pt02.getX()+","+pt02.getY());
		
		
	}
}
