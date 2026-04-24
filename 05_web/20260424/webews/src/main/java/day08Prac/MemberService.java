package day08Prac;

import java.util.ArrayList;

public class MemberService {
	MemberDAO dao = new MemberDAO();

	// 전체레코드 수 가져오기
	public int getTotalCnt() {
		return dao.countAll();
	}

	// 페이징 조회
	public ArrayList<Member> getMemberPaging(int page, int pageSize) {
		return dao.findPaging(page, pageSize);
	}

}
