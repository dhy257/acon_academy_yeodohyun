package day01prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fighting")
public class 화이팅 extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	resp.setCharacterEncoding("utf-8"); // 서버 => 인코딩 utf-8 (실제 서버가 보낼때 인코딩 )
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 ( 웹브라우저 )에게 해석에 대한 정
		
		// 응답하기
		PrintWriter out = resp.getWriter();

        out.println("<h2>화이팅</h2>");
    }
}
