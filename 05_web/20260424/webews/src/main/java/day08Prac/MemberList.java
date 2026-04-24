package day08Prac;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listpage")
public class MemberList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int cureentPage = 1; // 현재 페이지

		if (req.getParameter("p") != null) { // listpage?p=2 이런거임
			cureentPage = Integer.parseInt(req.getParameter("p"));
		}

		// 사전에 정하는 것
		int pageSize = 4;
		int grpSize = 3;

		MemberService service = new MemberService();
		int totRecords = service.getTotalCnt();
		ArrayList<Member> list = service.getMemberPaging(cureentPage, pageSize);

		// 페이징 정보
		PagingHandler handler = new PagingHandler(pageSize, grpSize, totRecords, cureentPage);

		req.setAttribute("list", list); // 4줄 데이터 출력
		req.setAttribute("handler", handler);	// 하단 [1] [2] [3] [4]

		// view로 포워드
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);

	}
}
