package Ch34;

import java.sql.*;

public class C01DBConn {
	// DB ���� ���� ����
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:XE"; // 1521: ����Ŭ ��Ʈ
	String user="system";
	String password="12345";
	
	String sql; // sql�����(���� �ӽ�����)
	PreparedStatement pstmt = null; // sql ������ ���� ���� (���� ����) -> ����
	ResultSet rs = null; // sql����� ������ �뵵(���� ��� ����)
	Connection conn = null; // db���� ��ü ���� �� ����(db���� ��ü ����)
	
	C01DBUI gui;
	
	void setting(C01DBUI ui) {
		gui = ui;
	}
	
	// �����ڰ� ����� �� ��񿬵�
	C01DBConn() {
		try {
			Class.forName(driver); // ����̹� �ε�
			System.out.println("-- Driver Loading Success !! --");
			conn = DriverManager.getConnection(url, user, password); // DB���� ���� ���
			System.out.println("--- DB Conected ---");
			
		} catch(Exception e) {
			
		}
	}
	
	void INSERT(int no, String name, String dept, String score) {
		// ����
		try {
			pstmt = conn.prepareStatement("INSERT INTO ScoreTbl VALUES(?,?,?,?)"); // �̸� �Է��� ������ ��
			pstmt.setInt(1,no);
			pstmt.setString(2,name);
			pstmt.setString(3,dept);
			pstmt.setString(4,score);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}
	
	}
	void UPDATE(int no, String name, String dept, String score) {
		try {
			pstmt = conn.prepareStatement("UPDATE ScoreTbl SET NAME=?, DEPT=?, SCORE=? WHERE NO=?");
			pstmt.setString(1,name);
			pstmt.setString(2,dept);
			pstmt.setString(3,score);
			pstmt.setInt(4,no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}
	}
	void DELETE(int no) {
		try {
			pstmt = conn.prepareStatement("DELETE ScoreTbl WHERE NO=?"); // �̸� �Է��� ������ ��
			pstmt.setInt(1,no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
		}
		
	}
	void SELECT(int no) {
		
	}
}