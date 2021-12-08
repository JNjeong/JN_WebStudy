package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	//1. DBMS와의 연동 (JDBC) => 공통로직 : JDBCUtil 클래스에서 불러와 사용
	//2. 비즈니스 메소드(CRUD) => 각각의 DAO마다 사용하는 로직
	
	Connection conn = null;
	PreparedStatement pstmt= null;
	
	String sql_selectAll = "select * from board order by bid desc";
	String sql_selectOne = "select * from board where bid=?";
	String sql_insert = "insert into board values((select NVL(MAX(bid),0)+1 from board),?,?,?)";
	String sql_update = "update board set title=?, writer=?, content=? where bid=?";
	String sql_delete = "delete from board where bid=?";
	
	
	public ArrayList<BoardVO> selectAll(){
		conn = JDBCUtil.connect();
		
		ArrayList<BoardVO> datas = new ArrayList<BoardVO>();
		
		try {
			pstmt=conn.prepareStatement(sql_selectAll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				
				vo.setBid(rs.getInt("bid"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
				
				datas.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return datas;
	}
	
	public BoardVO selectOne(BoardVO vo) {		//JSP식 코드
		conn=JDBCUtil.connect();
		BoardVO data = null;
		try {
			
			pstmt=conn.prepareStatement(sql_selectOne);
			pstmt.setInt(1, vo.getBid());
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				data = new BoardVO();
				
				data.setBid(rs.getInt("bid"));
				data.setTitle(rs.getString("title"));
				data.setWriter(rs.getString("writer"));
				data.setContent(rs.getString("content"));
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return data;
	}
	
	public boolean insert(BoardVO vo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(sql_insert);
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return true;
	}
	
	public boolean update(BoardVO vo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(sql_update);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.setInt(4, vo.getBid());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return true;
	}
	public boolean delete(BoardVO vo) {
		conn = JDBCUtil.connect();
		try {
			System.out.println("daoDelet입장");
			pstmt = conn.prepareStatement(sql_delete);
			pstmt.setInt(1, vo.getBid());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(pstmt, conn);
		}
		return true;
	}
	
	
}
