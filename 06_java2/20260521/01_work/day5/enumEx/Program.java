package day5.enumEx;

public class Program {
    private Fruit fruit  ;
     
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    } 
    
    
    public void printFruit() {
    	System.out.println( fruit);
    	
    	
    }
    public static void main(String[] args) {		
    	Program p = new Program();
    	p.setFruit( Fruit.BANANA);
    	p.printFruit();
	}
     
}