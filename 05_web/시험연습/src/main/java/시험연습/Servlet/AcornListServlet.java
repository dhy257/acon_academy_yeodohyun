package 시험연습.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import 시험연습.DTO.Acorn;
import 시험연습.Service.AcornService;

@WebServlet("/acorn/list")
public class AcornListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AcornService service = new AcornService();
		ArrayList<Acorn> list = service.getMembers();
		
		req.setAttribute("list", list);

		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}
}
