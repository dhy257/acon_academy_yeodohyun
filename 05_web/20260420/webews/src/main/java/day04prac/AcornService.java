package day04prac;

import java.util.ArrayList;

public class AcornService {

	AcornDAO dao = new AcornDAO();

	public ArrayList<Acorn> getMembers() {
		return dao.selectAll();
	}
}
