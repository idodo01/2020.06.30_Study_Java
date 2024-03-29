package Ch23;
class EmpolyeeInfo {
	public int rank;
	EmpolyeeInfo(int rank) { this.rank = rank; }
}

class Person<T, S> {
	public T info;
	public S id;
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
}

public class C02Generic {
	public static void main(String[] args) {
		Person<EmpolyeeInfo, Integer> p1 = new Person<EmpolyeeInfo, Integer>(new EmpolyeeInfo(1), 1010);
		System.out.println(p1.info.rank+","+p1.id);
											//앞과 동일할 경우, <EmpolyeeInfo, Integer> 생략가능  
		Person<EmpolyeeInfo, String> p2 = new Person(new EmpolyeeInfo(1), "N1324");
		System.out.println(p2.info.rank+","+p2.id);
	}
}
