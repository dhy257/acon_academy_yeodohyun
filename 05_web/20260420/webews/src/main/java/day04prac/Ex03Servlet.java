package day04prac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1차시 3번 문제를 mvc패턴으로 풀기
// servlet 
// view
// model - service , dao
// dto - 구조화된 데이터를 담아서 다른 계층으로 보낼 때 사용 ( User, Customer, Book )
// 

@WebServlet("/ex03")
public class Ex03Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 학생성적데이터(모델) 
		Ex03Service service = new Ex03Service();
		Score score = service.getScore();
		
		// controll 와 view가 함께 사용할 수 있는 저장소 request ( 요청 => 응답되기까지 사용할 수 있는 저장소 )
		req.setAttribute("data", score); // key를 기억해놨다가 꺼낼때 사용
		
		req.getRequestDispatcher("/WEB-INF/views/ex03view.jsp").forward(req, resp);
	}
}
