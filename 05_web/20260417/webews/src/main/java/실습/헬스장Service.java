package 실습;

import java.util.ArrayList;

public class 헬스장Service {

    헬스장DAO dao = new 헬스장DAO();

    public ArrayList<회원조회> getMemberListReal() {
        return dao.selectMemberList();
    }

    public void register(헬스장 gym) {
        dao.insert(gym);
    }

    public ArrayList<헬스장> getList() {
        return dao.selectAll();
    }
}