package Ch14;

public class C04Sharpen extends C04MoonBanggu{
	
	public C04Sharpen() {
		if(SharpenCount>0) {
			SharpenCount--;
		}
		else {
			System.out.println("����� �����ϴ�.");
		}
	} 
	void write() {
		System.out.println("������ ���ô�");
	}
}