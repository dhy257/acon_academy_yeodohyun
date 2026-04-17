package 실습;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gymReg")
public class 헬스장등록Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/gymForm.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
System.out.println("post");
		
		// 데이터 꺼내기 전에 인코딩
		req.setCharacterEncoding("utf-8");
		String workout_id = req.getParameter("workout_id");
		String member_id = req.getParameter("member_id");
		String trainer_id = req.getParameter("trainer_id");
		String exercise_id = req.getParameter("exercise_id");
		String sets = req.getParameter("sets");
		String reps = req.getParameter("reps");
		String weight = req.getParameter("weight");
		
		헬스장Service service = new 헬스장Service();

		헬스장 gym = new 헬스장();
		gym.setWorkout_id(workout_id);
		gym.setMember_id(member_id);
		gym.setTrainer_id(trainer_id);
		gym.setExercise_id(exercise_id);
		gym.setSets(Integer.parseInt(sets));
		gym.setReps(Integer.parseInt(reps));
		gym.setWeight(Integer.parseInt(weight));

		service.register(gym);
		
		System.out.println(workout_id);
		System.out.println(member_id);
		System.out.println(trainer_id);
		System.out.println(exercise_id);
		System.out.println(sets);
		System.out.println(reps);
		System.out.println(weight);
		
		 resp.sendRedirect("/0417/memberlist");
	}
}
