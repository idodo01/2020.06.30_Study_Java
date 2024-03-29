package Ch10;

public class C02StringClass {
	public static void main(String[] args) {
		 int alength, blength; 
		 char achar, bchar; 
		 
		 String str1 = new String("java Powerful"); 
		 String str2 = new String("java Programming"); 
		 
		 // 문자열 합치기
		 String str3 = str1 +", "+str2;
		 
		 // length(): 길이
		 alength = str1.length();
		 blength = str2.length(); 
		 
		 // charAt(): String의 특정 index 문자를 가져올 수 있음
		 // 공백도 index에 포함된다.
		 // index는 0부터 시작
		 achar = str1.charAt(5);
		 bchar = str2.charAt(10); 

		 System.out.println(str1); 
		 System.out.println(str2); 
		 System.out.println(str3); 
		 
		 System.out.println("str1에 저장 = "+str1 + ",  길이= "+alength); 
		 System.out.println("str2에 저장 = "+str2 + ",  길이= "+blength);
		 
		 System.out.println("str1의 5번째 문자 = "+achar);
		 System.out.println("str2의 10번째 문자 = "+bchar);
		 
		 // toUpperCase(): 대문자로 변환
		 System.out.println("str1의 대문자로 변환 = "+str1.toUpperCase()); 
		 // replace('',''): 첫번째 인자값을 두번째 인자값으로 바꿈
		 System.out.println("str2의 a를 A로 변환 = "+str2.replace('a','A')); 
		 
	}
}
