package day06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	static Connection conn = null;
	static Statement stmt = null;
	static int searchInt = 0;
	static String searchName = "";
	
	public static void main(String[] args) {
			
		//유지 보수에 용이하도록 아래와 같이 관리하는 편이 좋다.
		String oracleD="oracle.jdbc.OracleDriver";
//		String mysqlD="com.mysql.driver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="system";
		String password="0000";
		String sql = "select * from test" ;
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("찾고싶은 번호 입력 : "); 
//		searchInt = sc.nextInt();
	
		System.out.print("검색 : ");
		searchName = sc.nextLine();
		
		
//		1. JDBC 드라이버를 JVM에 로드
//		2. DB에 연결
//		3. DBMS에 데이터를 read, write == SQL문을 수행
//		4. DB연결 해제
		try {
			Class.forName(oracleD);
			System.out.println("JDBC 드라이버 로드 성공!");

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("오라클에 연결 성공");
			System.out.println(searchName);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql+" where b like '%" +searchName+ "%'");
			
			while(rs.next()) {
				System.out.println(rs.getInt("a") +" : "+rs.getString("b"));
			}
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
