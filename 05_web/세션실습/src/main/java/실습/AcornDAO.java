package 실습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;

public class AcornDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public ArrayList<Acorn> selectAll() {
		ArrayList<Acorn> list = new ArrayList<Acorn>();

		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "select * from acorntbl";

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			// 데이터베이스 조회결과 => ArrayList<Acorn> 으로 만들고 반환하기
			while (rs.next()) {
				// rs => 조회결과 하나의 행 정보를 가짐
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int point = rs.getInt(4);
				Date birth = rs.getDate(5);

				Acorn acorn = new Acorn(id, pw, name, point, birth);
				list.add(acorn);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return list;
	}

	// 등록
	public int insert(Acorn acorn) {
		// acorn을 데이터베이스에 등록
		Connection con = dbcon();
		PreparedStatement pst = null;

		String sql = "insert into acorntbl(id,pw,name,point,birthday) values (?,?,?,?,?)";

		int rowCnt = 0;

		try {
			pst = con.prepareCall(sql);
			pst.setString(1, acorn.getId());
			pst.setString(2, acorn.getPw());
			pst.setString(3, acorn.getName());
			pst.setInt(4, acorn.getPoint());
			// java.sql.Date 랑 java.util.Date라서 달라서 그럼
			// util.Date => sql.Date로 변환 필요
			java.sql.Date sqlBirth = new java.sql.Date(acorn.getBirth().getTime());
			pst.setDate(5, sqlBirth);

			rowCnt = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowCnt;
	}

	public Acorn findById(String id) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		Acorn acorn = null;

		String sql = "select * from acorntbl where id = ?";

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			if (rs.next()) {
				String tid = rs.getString(1);
				String tpw = rs.getString(2);
				String tname = rs.getString(3);
				int tpoint = rs.getInt(4);
				Date tbirth = rs.getDate(5);

				acorn = new Acorn();
				acorn.setId(tid);
				acorn.setPw(tpw);
				acorn.setName(tname);
				acorn.setPoint(tpoint);
				acorn.setBirth(tbirth);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return acorn;
	}

	public Acorn login(String id, String pw) {

		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		Acorn acorn = null;
		// 아디+비번 일치해야함
		String sql = "select * from acorntbl where id=? and pw=?";

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pw);

			rs = pst.executeQuery();
			// 있는지 전부 확인
			if (rs.next()) {
				// DB에서 객체로 매핑해주고
				acorn = new Acorn();
				acorn.setId(rs.getString("ID"));
				acorn.setPw(rs.getString("PW"));
				acorn.setName(rs.getString("NAME"));
				acorn.setPoint(rs.getInt("POINT"));
				acorn.setBirth(rs.getDate("BIRTHDAY"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return acorn;
	}
	
	

//	변경하기 int update( Acorn)
//	삭제하기 Int delete( String id)

	public int update(Acorn acorn) {
		Connection con = dbcon();
		PreparedStatement pst = null;

		String sql = "update acorntbl set pw = ?, point = ? where id = ?";

		int rowCnt = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, acorn.getPw());
			pst.setInt(2, acorn.getPoint());
			pst.setString(3, acorn.getId());

			rowCnt = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

		return rowCnt;

	}

	public int delete(String id) {
		Connection con = dbcon();
		PreparedStatement pst = null;

		String sql = "delete from acorntbl where id = ?";
		int rowCnt = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rowCnt = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowCnt;

	}

	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		Connection con = dao.dbcon();
		// 올바른 연결이면 반환 OK, null반환이면 fail
		if (con != null) {
			System.out.println("DB OK");
		}
		System.out.println(con);

		Acorn acorn = new Acorn();
		acorn.setId("test");
		acorn.setPw("5555");
		acorn.setPoint(900000);

		int rowCnt = dao.delete("test0421");
		System.out.println(rowCnt);
	}
}
