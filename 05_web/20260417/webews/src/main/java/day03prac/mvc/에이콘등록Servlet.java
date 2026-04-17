package day03prac.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/acornReg")
public class 에이콘등록Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/acornForm.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post");
		
		// 데이터 꺼내기 전에 인코딩
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		
		
		Acorn acorn = new Acorn(id,pw,name);
		// Service에서 DAO통해 데이버베이스 등롟하기
		에이콘서비스 service = new 에이콘서비스();
		service.acornRegister(acorn);
		// 응답
		req.getRequestDispatcher("/WEB-INF/views/reg_ok.jsp").forward(req, resp);
		
		
	}
}
