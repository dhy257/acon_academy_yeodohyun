package day04prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornList")
public class AcornUrlServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 모델 가져오기
		AcornService service = new AcornService();
		ArrayList<Acorn> list = service.getMembers(); // 에이콘 학생 정보 => Model
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/views/acornView.jsp").forward(req, resp);
	}
}
