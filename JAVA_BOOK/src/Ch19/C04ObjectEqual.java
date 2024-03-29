package Ch19;

class MyData{
	int num;
	public MyData(int num) {
		this.num=num;
	}
	
	@Override							//toString() 오버라이딩(재정의)
	public String toString() {
		return "A";
	}
}

class MyInt {
	int value;
	public MyInt(int value){
		this.value = value;
	}
	@Override
	public boolean equals(Object obj){		// equals 재정의
		if(obj instanceof MyInt){			// 형변환 가능여부 확인
			MyInt mi = (MyInt)obj;			// 다운캐스팅
			return this.value == mi.value;	// 객체 값 확인 비교			
		}
		return false; 
	}
}
//System.out.println(mi1.equals(mi2));

public class C04ObjectEqual {

	public static void main(String[] args) {
//		MyData md1 = new MyData(1);
//		MyData md2 = new MyData(1);
//		MyData md3 = md1;
//		
//		System.out.println(md1.equals(md2));		// 재정의 되지 않았기 때문에 false 
//		System.out.println(md1==md2);				// 주소값 다름 false
		
		
		MyInt mi1 = new MyInt(1);			
		MyInt mi2 = new MyInt(1);
		System.out.println(mi1.equals(mi2));		// 재정의 됨 true
		System.out.println(mi1==mi2);				// 주소값 다름 false
	}


}
