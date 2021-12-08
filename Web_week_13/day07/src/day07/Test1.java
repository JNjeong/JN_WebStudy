package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {
	
	
	
	
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password="0000";
		String sql = "select * from test";
		String sqlinsert="insert into test values";
		
		Connection conn =null;
		Statement stmt = null;
		
		String userA = "";
		String userB = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("a값 입력 : "); userA = sc.nextLine();
		System.out.print("b값 입력 : "); userB = sc.nextLine();
		
		
		try {
			Class.forName(driver);
			
			conn= DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			//select문 말고 update문 사용하기
			stmt.executeUpdate(sqlinsert+ "(" + userA + ", '" + userB+ "')");
			
			//출력하기
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("a : " + rs.getInt("a") + " b : " + rs.getString("b"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
	

}
