package 실습;

import java.sql.*;
import java.util.ArrayList;

public class 헬스장DAO {

    String driver="oracle.jdbc.driver.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:testdb";
    String user="scott";
    String password="tiger";

    public Connection dbcon() {
        Connection con=null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    // 등록
    public void insert(헬스장 gym) {
        Connection con = dbcon();
        PreparedStatement pst = null;

        String sql = "insert into WORKOUT_LOG "
                + "(workout_id, member_id, trainer_id, exercise_id, sets, reps, weight, exercise_date) "
                + "values (?, ?, ?, ?, ?, ?, ?, sysdate)";

        try {
            pst = con.prepareStatement(sql);

            pst.setString(1, gym.getWorkout_id());
            pst.setString(2, gym.getMember_id());
            pst.setString(3, gym.getTrainer_id());
            pst.setString(4, gym.getExercise_id());
            pst.setInt(5, gym.getSets());
            pst.setInt(6, gym.getReps());
            pst.setInt(7, gym.getWeight());

            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        close(pst, con);
    }

    // 전체조회
    public ArrayList<헬스장> selectAll() {
        ArrayList<헬스장> list = new ArrayList<>();

        Connection con = dbcon();
        PreparedStatement pst = null;
        ResultSet rs = null;

        String sql = "select * from WORKOUT_LOG";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()) {
                헬스장 g = new 헬스장(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getDate(8)
                );

                list.add(g);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        close(rs, pst, con);
        return list;
    }
    
    public ArrayList<회원조회> selectMemberList(){

        ArrayList<회원조회> list = new ArrayList<>();

        Connection con = dbcon();
        PreparedStatement pst = null;
        ResultSet rs = null;

        String sql = "SELECT MEMBER_ID, NAME, " +
                "TRUNC(MONTHS_BETWEEN(SYSDATE, AGE) / 12) || '살', " +
                "to_char(Registration_Date, 'yyyy-mm-dd'), " +
                "TRAINER_ID, CHEST, BACK, ARM, SHOULDER, LEG " +
                "FROM GYM_MEMBER";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()){
                회원조회 g = new 회원조회(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)
                );

                list.add(g);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        close(rs, pst, con);
        return list;
    }

    public void close(AutoCloseable... a) {
        for(AutoCloseable item : a) {
            try { item.close(); } catch(Exception e) { e.printStackTrace(); }
        }
    }
}