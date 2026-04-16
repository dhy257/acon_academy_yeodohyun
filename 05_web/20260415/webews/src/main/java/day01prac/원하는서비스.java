package day01prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/custom")
public class 원하는서비스 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        // 화이팅 메시지
        String[] msg = {
                "화이팅1",
                "화이팅2",
                "화이팅3",
                "화이팅4",
                "화이팅5"
        };

        // 이미지 목록
        String[] imgs = {
                "/0415/imgs/cute.jpg",
                "/0415/imgs/cute2.png",
                "/0415/imgs/cute3.jpg"
        };

        // 각각 랜덤 선택
        int msgIdx = (int)(Math.random() * msg.length);
        int imgIdx = (int)(Math.random() * imgs.length);

        // 출력
        out.println("<h1>오늘의 응원</h1>");
        out.println("<h2>" + msg[msgIdx] + "</h2>");
        out.println("<img src=\"" + imgs[imgIdx] + "\">");
    }
}