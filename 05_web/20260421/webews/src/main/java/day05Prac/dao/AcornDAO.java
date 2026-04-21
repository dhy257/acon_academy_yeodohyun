package day05Prac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import day05Prac.dto.Acorn;

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

	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		Connection con = dao.dbcon();
		// 올바른 연결이면 반환 OK, null반환이면 fail
		if (con != null) {
			System.out.println("DB OK");
		}
		System.out.println(con);

		ArrayList<Acorn> list = dao.selectAll();
		System.out.println(list);
	}
}
