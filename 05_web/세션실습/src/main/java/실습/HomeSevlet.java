package 실습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeSevlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/실습/home.jsp").forward(req, resp);
	}
}
// 로그인
// 1. Servlet에서 로그인 요청 받음 ( id, pw )
// 2. Service에서 Login 호출
// 3. DAO에서 DB조회하고 Acorn 객체 생성하고 반환
// 4. Service에서 Servlet에 반환
// 5. Servlet에서 Session에 저장하고 사용

// 정보 조회
// 1. Session에서 id 가져옴
// 2. Service.getById(id) 호출
// 3. DAO.findById(id) 호출
// 4. Acorn 생성
// 5.Servlet에서 JSP로 전달 ( request.setAttribute )

// 회원 정보 수정
// 1. MyInfoServlet에서 POST로 수정 요청 받음 ( pw, point )
// 2. Service.modify(acorn)
// 3. DAO.update(acorn)
// 4. 1반환(성공)
// 5. Service에서 ==1 기준으로 true, false
// 6. Servlet에서 ReDirect ( /myinfo.do )

// 회원 탈되
// 1. MyInfoServlet에서 Delete 요청
// 2. Service.delete(id)
// 3. DAO.delete(id)
// 4. Session.invalidate()
// 5. login페이지로 이동
