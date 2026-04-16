package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@localhost:1521:testdb"; // 오라클 XE 기준
        String USER = "scott";
        String PASSWORD = "tiger";
		
		// 1.오라클 드라이버 로딩
		Class.forName(driver);
		
		// 2.데이터베이스 연결
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 3.문장(statement) 얻어오기
		Statement st = con.createStatement();
		
		// 4.필요한 sql 작성
		String sql = "select * from movie0416";
		
		// 5.최종적으로 실행하고 결과 가져오기
		ResultSet rs= st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.print(rs.getString(1)+"	");
			System.out.print(rs.getString(2));
		}
		
		// 6.자원 정리하기
		rs.close();
		st.close();
		con.close();
		
	}
}
