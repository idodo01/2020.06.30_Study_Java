package Ch11;
public class C07BookArray {

	public static void main(String[] args) {
		// 배열에 객체를 담는다.
		C06Book [] library = new C06Book[5];
		
		//						책이름, 작가 이름
		library[0] = new C06Book("태백산맥","조정래");
		library[1] = new C06Book("데미안","헤르만 헤세");
		library[2] = new C06Book("어떻게 살 것인가","유시민");
		library[3] = new C06Book("토지","박경리");
		library[4] = new C06Book("어린왕자","생텍쥐페리");
		
		// 책 이름, 작가 이름 출력
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();
		}
		
		// 객체 주소 출력
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
	}
	
	
}

