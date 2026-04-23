package 실습;

import java.util.ArrayList;

public class AcornService {

	private AcornDAO dao = new AcornDAO();

	// 전체 회원 조회
	public ArrayList<Acorn> getMembers() {
		return dao.selectAll();
	}

	// 회원가입
	public boolean register(Acorn acorn) {
		return dao.insert(acorn) == 1;
	}

	// ID로 회원 조회
	public Acorn getById(String id) {
		return dao.findById(id);
	}

	// 회원 수정
	public boolean modify(Acorn acorn) {
		return dao.update(acorn) == 1;
	}

	// 회원 삭제
	public boolean delete(String id) {
		return dao.delete(id) == 1;
	}

	// 로그인
	public Acorn login(String id, String pw) {
		return dao.login(id, pw);
	}
}