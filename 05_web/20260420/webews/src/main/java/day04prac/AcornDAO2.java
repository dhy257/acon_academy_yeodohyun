package day04prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO 한 개가 => 테이블 한개
// 조인같은 경우에는? 중심테이블에 두면 된다.

// 1. 오라클드라이버 라이브러리 해당위치에 두기
// 2. Class.forName() 클래스 로딩
// 3. DriverManager를 통해서 DB연결 - 연결정보, 사용자, 비번, url => Connection 객체를 반환받음
// 4. Statement 얻어오기 ( PreparedStatement )
// 5. sql작성
// 6. sql실행하기, 조회
// 7. 실행결과를 자바객체로 변환 ( 여러개니까 ArrayList<Acorn> , Acorn )

public class AcornDAO2 {
	//
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "scott"; // system
	String password = "tiger"; // 1234

	// DB연결 메서드
	// 기능: DB연결정보를 이용해서 데이터베이스에 연결하기
	// 입력:
	// 반환: 연결객체 ( Connection )
	public Connection dbcon() {

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

	// 기능: 학생전체조회
	// 입력:
	// 반환: ArrayList<Acorn>

	public ArrayList<Acorn> selectAll() {
		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;

		String sql = "select * from acorntbl";
		ArrayList<Acorn> list = new ArrayList<Acorn>(); // 준비완료

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				// rs => 한 행 ( 테이블의 레코드 값이 담겨 있음 )
//				System.out.println(rs.getString(1));
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int point = rs.getInt(4);
				java.util.Date birth = rs.getDate(5);
				// Acorn ( String id, Strin pw, Strin name, int id, Date birth )
				Acorn acorn = new Acorn(id, pw, name, point, birth);
				list.add(acorn);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 자원 정리, 거꾸로 한다
			// con, pst, rs => rs, pst, con 종료하기

			close(rs, pst, con);

		}

		return list;
	}

	// close하기 메서드
	// 아래 3개의 객체는 모두 AutoClosable 인터페이스를 구현하였다
	// 입력: Connection, PreparedStatement, ResultSet => 타입의 객체, 가변인자
	// 반환: x
	public void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable a : autoCloseables) {
			if (a != null)
				try {
					a.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {

		AcornDAO2 dao = new AcornDAO2();
//		Acorn acorn = new Acorn();
//		acorn.setId("test");
//		acorn.setPw("test");
//		acorn.setName("테스트");
//		acorn.setPoint(1000);
//
//		int result = dao.insertMember(acorn);
//		System.out.println(result);

//		Acorn acorn = dao.selectOne("jyon");
//
//		System.out.println(acorn);

		Acorn acorn = new Acorn();
		acorn.setId("test");
		acorn.setPw("1234");
		acorn.setName("테스터");
		acorn.setPoint(10000);
		int result = dao.updateMember(acorn);
		System.out.println(result);
	}

	// 전체조회 ( 페이징 )

	// 한 개 조회

	// 하나 조회 selectOne()
	public Acorn selectOne(String id) {

		Connection con = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "select * from acorntbl where id =?";

		Acorn acorn = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();

			if (rs.next()) { // 조회결과 가져오기 , true =>해당id의 정보가 조회되었다는 것임

				String tid = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int point = rs.getInt(4);
				java.util.Date birth = rs.getDate(5);
				// Acorn(String id, String pw, String name, int point, Date birth) {
				acorn = new Acorn(tid, pw, name, point, birth);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, pst, con);
		}
		return acorn;

	}

	// 등록하기
	public int insertMember(Acorn acorn) {
		Connection con = dbcon();
		PreparedStatement pst = null;

		String sql = "insert into acorntbl(id, pw, name, point) values(?,?,?,?)";
		int resultRow = 0;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, acorn.getId()); // 왼쪽물음표부터 1시작
			pst.setString(2, acorn.getPw());
			pst.setString(3, acorn.getName());
			pst.setInt(4, acorn.getPoint());

			//

			resultRow = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pst, con);
		}

		return resultRow;
	}

	// 회원등록시 - 회원취미

	// 변경하기
	public int updateMember(Acorn acorn) {
		Connection con = dbcon();
		PreparedStatement pst = null;
		int resultRow = 0;

		String sql = "update acorntbl  set  pw=?  , point =?  where id=? ";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, acorn.getPw()); // 물픔표 채울 때 왼쪽부터 1      
			pst.setInt(2, acorn.getPoint());
			pst.setString(3, acorn.getId());

			resultRow = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultRow;

	}
	// 삭제하기
}
