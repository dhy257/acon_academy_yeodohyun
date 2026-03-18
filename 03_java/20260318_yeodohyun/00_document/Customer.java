package javaprj.day12.생성자호출;

public class Customer {
	     String name;   
	     String email;
	     String phoneNumber;
	 
	     
	     
	     public Customer() {}
	     
	     //매개변수가 있는  생성자
	     public Customer( String name, String email, String phoneNumber ) {
	    	 this.name= name;
	    	 this.email= email;
	    	 this.phoneNumber= phoneNumber;
	    	 
	     }
	     
	     
	     //
	     public String toString() {	    	 
	    	 return  name + "  " + email +"  "+  phoneNumber;
	    	 
	     }
	     
	     
}
