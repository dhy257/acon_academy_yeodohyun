package 학생.여도현;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cute/img")
public class 귀여운이미지 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        // 서비스 사용
        이미지Service service = new 이미지Service();
        String title = service.get제목();
        String imgPath = service.get이미지경로();

        out.println("<h1>" + title + "</h1>");
        out.println("<img src=\"" + imgPath + "\">");
    }
}