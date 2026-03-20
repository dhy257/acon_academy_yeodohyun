package 실습_김민경_여도현;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment p;

		
        p = new CardPayment();
        p.pay(3000);
        
        
        p = new KakaoPay();
        p.pay(9000);
       
        
        p = new CashPayment();
        p.pay(3000);
        
        
	}

}
