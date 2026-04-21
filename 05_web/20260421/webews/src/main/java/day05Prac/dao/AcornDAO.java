package day05Prac.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class AcornDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott";
	String password = "tiger";

	public Connection dbcon() {
		Connection con = null;

		try {
			Class.forName(driver);
			DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		Connection con = dao.dbcon();
		// 올바른 연결이면 반환 OK, null반환이면 fail
		if (con != null) {
			System.out.println("DB OK");
		}
		System.out.println(con);
	}
}
