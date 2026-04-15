package day01prac;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. HttpServlet 상속받기
// 2. 약속된 메서드 service 오버라이드
// 3. url-pattern 매핑하기
@WebServlet("/hello2")
public class HelloServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 내 요청에 대한 처리하기
		
		// 응답정보 데이터Content-type : text / html (기본), text/plain, application/json
		// 응답정보 인코딩방식 : 한글이면 utf-8
		// 반드시 출력스트림을 얻어오기 전에 설정해야함
		
		resp.setCharacterEncoding("utf-8"); // 서버 => 인코딩 utf-8 (실제 서버가 보낼때 인코딩 )
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 ( 웹브라우저 )에게 해석에 대한 정
		
		
		// 응답하기
		PrintWriter out = resp.getWriter();
		
//		LocalDate today = LocalDate.now();
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String result = now.format(formatter);
		
		out.println("<html>"); // html형식으로 보내야 함
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>hi servlet!!"+result+"</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
