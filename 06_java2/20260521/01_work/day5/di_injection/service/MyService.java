package day5.di_injection.service;

public class MyService {
	
	//
	//의존성
	MyDAOInterface dao ;
	
	 
	//의존성 주입 
	// 생성자, 세터주입 
	
	public MyService(MyDAOInterface dao) {
		super();
		this.dao = dao;
	}
	
	public MyService() {
		// TODO Auto-generated constructor stub
	}
	
	//고객전체조회
	
	public void getMembers() {		
		dao.selectAll();
		
	}


	

}
