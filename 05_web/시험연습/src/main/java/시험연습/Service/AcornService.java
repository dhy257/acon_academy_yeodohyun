package 시험연습.Service;

import java.util.ArrayList;

import 시험연습.DAO.AcornDAO;
import 시험연습.DTO.Acorn;

public class AcornService {
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<Acorn> getMembers(){
		ArrayList<Acorn> list = dao.selectAll();
		return list;
	}
}
