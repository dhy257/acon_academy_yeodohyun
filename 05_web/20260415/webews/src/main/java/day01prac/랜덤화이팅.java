package day01prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fighting/random")
public class 랜덤화이팅 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8"); // 서버 => 인코딩 utf-8 (실제 서버가 보낼때 인코딩 )
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 ( 웹브라우저 )에게 해석에 대한 정
		
		// 응답하기
		PrintWriter out = resp.getWriter();
		
		String[] msg = {
	            "화이팅1",
	            "화이팅2",
	            "화이팅3",
	            "화이팅4",
	            "화이팅5"
	        };

	        int idx = (int)(Math.random() * msg.length);

	        out.println("<h2>" + msg[idx] + "</h2>");
	}
}
