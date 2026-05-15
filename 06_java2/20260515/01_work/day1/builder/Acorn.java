package day1.builder;

public class Acorn {
	
	String id;
	String pw;
 
	
	 
	private Acorn( Builder builder) {		
		this.id  = builder.id;
		this.pw  = builder.pw;
	}
	
	
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + "]";
	}

	
	public static Builder build() {
		return new Builder();
	}

	//클래스내부에 클래스 작성가능   inner class
	static class Builder{
		
		String id;
		String pw;
		
		
		
		
		Builder id( String id) {
			this.id  = id;			 
			return this;
		}
		
		
		Builder pw (String pw) {
			this.pw  = pw;
			return this;
		}
		
		
		
		Acorn build() { 
		 
			return new Acorn( this);
		}
		
		
	}
	

}
