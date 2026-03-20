package 실습_김민경_여도현;

public class CashPayment implements Payment{

	private int money = 80000;

	
    @Override
    public boolean pay(int amount) {
    	System.out.println("현재 잔액: " + money + "원");
    	System.out.println("결제 금액: " + amount + "원");
    	
        if(money >= amount){
        	money -= amount;
            System.out.println("현금 결제 성공 👍");
            System.out.println("남은 현금: " + money + "원");
            System.out.println();
            return true;
        } else {
            System.out.println("현금 부족 ❌");
            return false;
        }
    }
	
}
