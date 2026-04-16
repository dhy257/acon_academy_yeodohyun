package day01prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cute/img/random")
public class 랜덤귀여운이미지 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter  out  =resp.getWriter();
		
		String[] imgs = {
                "/0415/imgs/cute.jpg",
                "/0415/imgs/cute2.png",
                "/0415/imgs/cute3.jpg"
        };

        // 랜덤 선택
        int idx = (int)(Math.random() * imgs.length);

        out.println("<h1>랜덤 귀여운 이미지</h1>");
        out.println("<img src=\"" + imgs[idx] + "\">");
	}
}
