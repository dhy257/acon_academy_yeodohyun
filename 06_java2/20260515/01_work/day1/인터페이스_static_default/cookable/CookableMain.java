package day1.인터페이스_static_default.cookable;

public class CookableMain {

	public static void main(String[] args) {
		 
		Cookable pastaChef = new 파스타요리사();
        Cookable riceChef = new 밥요리사();

        System.out.println("🍝 파스타 요리사:");
        pastaChef.cook();

        System.out.println("\n🍚 밥 요리사:");
        riceChef.cook();
		
	}

}
