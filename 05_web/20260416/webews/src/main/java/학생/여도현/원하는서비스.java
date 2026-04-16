package 학생.여도현;

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

        // 서비스 사용
        응원Service service = new 응원Service();
        String message = service.get랜덤메시지();
        String img = service.get랜덤이미지();

        // 출력
        out.println("<h1>오늘의 응원</h1>");
        out.println("<h2>" + message + "</h2>");
        out.println("<img src=\"" + img + "\">");
    }
}