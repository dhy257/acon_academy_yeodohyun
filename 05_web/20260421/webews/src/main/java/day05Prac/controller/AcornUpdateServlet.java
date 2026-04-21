package day05Prac.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day05Prac.dto.Acorn;
import day05Prac.service.AcornService;

@WebServlet("/acorn/update")
public class AcornUpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		int point = Integer.parseInt(req.getParameter("id"));

		Acorn acorn = new Acorn();
		acorn.setId(id);
		acorn.setPw(pw);
		acorn.setPoint(point);

		AcornService sevice = new AcornService();
		sevice.modifyAcornStudent(acorn);

		//
		resp.sendRedirect("/0421/acorn/list");
	}
}
