package day1prac.오늘의요리사;

class Cook{
    String name;
   
    public Cook() {
    	System.out.println("부모 기본생성자");
    }
    
	public Cook(String name ) {
		super();
		this.name = name;
		System.out.println("부모의 매개변수 있는 생성자");
	}
	@Override
	public String toString() {
		return "Cook [name=" + name + " ]";
	}
     
    
  
}
