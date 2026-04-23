package day07Prac.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order.do")
public class OrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 로그인 되어 있는지 확인하기
		HttpSession session = req.getSession(false);
		String id = (String) session.getAttribute("id");
		//

		if (session != null && id != null) {
			req.getRequestDispatcher("/WEB-INF/views/order.jsp").forward(req, resp);
		} else {
			req.setAttribute("error", "주문정보를 보려면 로그인이 필요합니다.");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
//			resp.sendRedirect(req.getContextPath() + "/login");
		}

	}
}
