package day5.di_injection.service;

public class JDBCDAO    implements MyDAOInterface{

	@Override
	public void selectAll() {
		System.out.println(" jdbc 이용해서  전체 조회하기");
		
	}

	@Override
	public void selelctOne() {
		System.out.println(" jdbc 이용해서  하나 조회하기");
		
	}

	@Override
	public void insert() {
		System.out.println(" jdbc 이용해서  삽입하기");
		
	}

	@Override
	public void delete() {
		System.out.println(" jdbc 이용해서  삭제하기");
		
	}

	@Override
	public void update() {
		System.out.println(" jdbc 이용해서  변경하기");
		
	}

}
