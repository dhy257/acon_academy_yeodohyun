package 실습;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memberlist")
public class 회원Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		헬스장Service service = new 헬스장Service();
		
		ArrayList<회원조회> list  = service.getMemberListReal();
//		System.out.println( list.get(0).getWorkout_id());
		
		req.setAttribute("list", list);		
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}
	
	
}
