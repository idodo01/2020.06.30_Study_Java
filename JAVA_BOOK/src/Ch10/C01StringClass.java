package Ch10;

public class C01StringClass {
	public static void main(String[] args) {
		// 주소값이 같음
		String mystr1 = "java";
		String mystr2 = "java";
		// 동적할당, 주소값이 각각다름
		String mystr3 = new String("java");
		String mystr4 = new String("java");
		
		System.out.println("== 비교 결과   "); 
		System.out.println("mystr1 = mystr2 : "+(mystr1 == mystr2)); // true
		System.out.println("mystr3 = mystr4 : "+(mystr3 == mystr4));
		System.out.println("mystr1 = mystr3 : "+(mystr1 == mystr3));
		System.out.println("mystr1 = mystr4 : "+(mystr1 == mystr4)); 
		
		// equals 메소드를 통한 문자열 일치 여부 비교
		System.out.println("equals 메소드 비교 결과 ");
		System.out.println("mystr1 = mystr2 : " + (mystr1.equals(mystr2))); // true
		System.out.println("mystr3 = mystr4 : " + (mystr3.equals(mystr4))); // true
		System.out.println("mystr1 = mystr3 : " + (mystr1.equals(mystr3))); // true
		System.out.println("mystr1 = mystr4 : " + (mystr1.equals(mystr4))); // true
	}
}
