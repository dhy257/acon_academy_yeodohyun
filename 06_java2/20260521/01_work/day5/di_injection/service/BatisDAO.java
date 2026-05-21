package day5.di_injection.service;

public class BatisDAO   implements MyDAOInterface{

	@Override
	public void selectAll() {

		System.out.println( " batis이용해서 전체조회하기");
		
	}

	@Override
	public void selelctOne() {
		// TODO Auto-generated method stub
		System.out.println( " batis이용해서 하나 조회하기");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println( " batis이용해서  추가하기");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println( " batis이용해서 삭제하기");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( " batis이용해서 변경하기");
	}

}
