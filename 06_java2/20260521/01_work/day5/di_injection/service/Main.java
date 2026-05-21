package day5.di_injection.service;

public class Main {

	public static void main(String[] args) {
		 
		
		
		//MyDAOInterface dao   = new JDBCDAO();
		 MyDAOInterface dao   = new BatisDAO();
		 MyService service  = new MyService( dao );
		
		
		service.getMembers();
	}

}
