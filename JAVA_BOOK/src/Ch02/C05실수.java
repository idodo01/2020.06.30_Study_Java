package Ch02;
// 실수의 오차확인
public class C05실수 {

	public static void main(String[] args) {
		int i = 0;
		float num = 0.0f;
		for (int j = 0; j < 100; j++) {
			num += 0.1;
		}
		// 10이 아닌 다른 값이 나옴 
		// 즉, 오차 있음
		System.out.printf("0.1을 100번 더한 결과 : %f \n",num);
		
		
		float test1 = 123.123456789f;
		double test2 = 123.456789123456789;
		
		System.out.println(test1);
		System.out.println(test2);
		
	}

}
