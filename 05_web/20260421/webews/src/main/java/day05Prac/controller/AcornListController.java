package day05Prac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acorn/list")
public class AcornListController extends HttpServlet{ // C

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		// M
		
		req.getRequestDispatcher("/WEB-INF/views/acorn/list.jsp").forward(req, resp); // V
	}
}
