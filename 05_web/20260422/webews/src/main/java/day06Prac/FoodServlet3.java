package day06Prac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.google.gson.Gson;

// 메뉴 추천 이름, 가격

@WebServlet("/food3")
public class FoodServlet3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 응답하기
		// ArrayList<Food> => json
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json;charset=utf-8");

		FoodService s = new FoodService();
		JSONArray list = s.getFoodList();

		resp.getWriter().print(list.toString());

	}
}
