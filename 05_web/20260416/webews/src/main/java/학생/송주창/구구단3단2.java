package 학생.송주창;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dan32")
public class 구구단3단2 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");   
		resp.setContentType("text/html;charset=utf-8");  
		
		PrintWriter out = resp.getWriter();  
		
		구구단Service service = new 구구단Service();
		String[] result = service.get구구단3();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		// 3단 제공
		for(int i = 0; i < result.length; i++) {
		    out.println(result[i] + "<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
