package 실습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServelt extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/실습/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		// Sevice 사용
		AcornService service = new AcornService();
		Acorn acorn = service.login(id, pw);

		if (acorn != null) { // 로그인 성공
			HttpSession session = req.getSession();

			session.setAttribute("id", acorn.getId());
			session.setAttribute("name", acorn.getName());
			session.setAttribute("point", acorn.getPoint());

			resp.sendRedirect(req.getContextPath() + "/home");

		} else { // 로그인 실패
			req.setAttribute("error", "아이디 또는 비밀번호가 틀렸습니다.");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		}
	}
}
