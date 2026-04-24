package day08Prac.eljstl;

import java.util.ArrayList;

public class AcornService {
	public ArrayList<Acorn> getMemberList() {
		ArrayList<Acorn> list = new ArrayList<Acorn>();
		list.add(new Acorn("t1", "1111", "고지연"));
		list.add(new Acorn("t2", "2222", "김민정"));
		list.add(new Acorn("t3", "3333", "이현겸"));
		list.add(new Acorn("t4", "4444", "이용찬"));

		return list;
	}

}
