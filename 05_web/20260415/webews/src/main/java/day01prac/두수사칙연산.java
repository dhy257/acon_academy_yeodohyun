package day01prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class 두수사칙연산 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8"); // 서버 => 인코딩 utf-8 (실제 서버가 보낼때 인코딩 )
		resp.setContentType("text/html;charset=utf-8"); // 클라이언트 ( 웹브라우저 )에게 해석에 대한 정
		
		// 응답하기
		PrintWriter out = resp.getWriter();
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		out.println("<h2>덧셈: " + (num1 + num2) + "</h2>");
        out.println("<h2>뺄셈: " + (num1 - num2) + "</h2>");
        out.println("<h2>곱셈: " + (num1 * num2) + "</h2>");
        out.println("<h2>나눗셈: " + (num1 / (double)num2) + "</h2>");

	}
}
