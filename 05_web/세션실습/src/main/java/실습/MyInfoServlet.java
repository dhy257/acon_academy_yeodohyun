package 실습;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/myinfo.do")
public class MyInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if (session == null || session.getAttribute("id") == null) {
			resp.sendRedirect(req.getContextPath() + "/login");
			return;
		}

		String id = (String) session.getAttribute("id");

		AcornService service = new AcornService();
		Acorn acorn = service.getById(id);

		req.setAttribute("acorn", acorn);

		req.getRequestDispatcher("/WEB-INF/views/실습/myinfo.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");

		HttpSession session = req.getSession(false);
		String id = (String) session.getAttribute("id");

		String action = req.getParameter("action");

		AcornService service = new AcornService();

		if ("update".equals(action)) {

			String pw = req.getParameter("pw");
			int point = Integer.parseInt(req.getParameter("point"));

			Acorn acorn = new Acorn();
			acorn.setId(id);
			acorn.setPw(pw);
			acorn.setPoint(point);

			service.modify(acorn);

			resp.sendRedirect(req.getContextPath() + "/myinfo.do");

		} else if ("delete".equals(action)) {

			service.delete(id);

			session.invalidate();

			resp.sendRedirect(req.getContextPath() + "/login");
		}
	}
}