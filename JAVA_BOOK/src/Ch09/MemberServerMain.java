package Ch09;

class MemberServer {
	String id;
	String password;
	
	public boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	public void logout(String id) {
		this.id = id;
	}
}

public class MemberServerMain {
	public static void main(String[] args) {
		// ��ü ����
		MemberServer ms = new MemberServer();
		System.out.println(ms.login("hong","12345"));
		System.out.println(ms.login("han","123"));
	}
}

/*
public class C06Practice {
	public static void main(String[] args) {
		
	}
}
*/

