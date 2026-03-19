package 이용찬_여도현_실습;

import java.util.ArrayList;


public class Manage {
	
	static int date = (int) (Math.random()*30) + 1;

	private ArrayList<Product> list = new ArrayList<>();
	
	public Manage() {}
	
	
	public void addProduct(Product product) {
		list.add(product);
		
		System.out.print("현재 제품 리스트: ");
		for(int i=0; i<list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	public void remove() {
		System.out.println("현재 날짜: "+ date);
		
		//list size만큼 반복
		for(int i=0; i<list.size(); i++) {
			Product product = list.get(i);
			
			//만약 food라면
			if(product instanceof Food) {
				int productExp = ((Food) product).getExp();
				System.out.println("사과의 유통기한: "+productExp);
				
				//만약 유통기한이 지났다면
				if(productExp > date) {
					list.remove(i);//제거
					System.out.println(product.getName()+"이 제거됐습니다");
				}
			}
		}
	}
	
	public void refund(Product product) {
		if(product instanceof Goods) {
			Goods goods = (Goods) product;
			System.out.println(goods.getName()+" 환불기한: "+date);
			if(goods.getRefundPeriod() <= date) {
				System.out.println(goods.getName()+" 환불되었습니다");
				list.remove(goods);
			}else {
				System.out.println("환불기한이 지났습니다");
			}
			
		}
	}
	
	public void showInfo() {
		System.out.print("현재 제품 리스트: ");
		for(int i=0; i<list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
}
