package pro0311;

import java.util.Random;

public class 함수만들기실습_김태준 {
	
	static class monster{
		int hp = 2000;
		int ad = 10;
	}
	static class player{
		int hp = 1000;
		int ad = 15;
	}
	
	public static void 전투하기(player p,monster m) {
		
		Random ran = new Random();
		int a = 0;
		while(p.hp > 0 && m.hp > 0) {
			m.hp -= p.ad;
			System.out.println("플레이어의 공격! 몬스터는 "+ p.ad+"만큼 피해를 입었다.");
			
			a = (ran.nextInt(10)-2);
			p.ad += a;
			
			if(a>=0) {
				System.out.println("플레이어는 전투 중에 더 많은 힘을 획득하였다. "+a+"의 공격력을 획득했다.");
			}else{
				System.out.println("플레이어는 전투 중에 힘을 소진했다. "+a+"의 공격력을 잃었다.");
			}
			
			p.hp -= m.ad;
			System.out.println("몬스터의 공격! 플레이어는 "+ m.ad+"만큼 피해를 입었다.");
			
			a=(ran.nextInt(5)-1);
			m.ad += a;
			
			if(a>=0) {
				System.out.println("몬스터는 전투 중에 더 많은 힘을 획득하였다. "+a+"의 공격력을 획득했다.");
			}else{
				System.out.println("몬스터는 전투 중에 힘을 소진했다. "+a+"의 공격력을 잃었다.");
			}
			System.out.println();
			
			System.out.println("플레이어의 남은 hp:"+p.hp);
			System.out.println("몬스터의 남은 hp:"+m.hp);
			
			System.out.println();
		}
		
		if(p.hp>m.hp) {
			System.out.println("플레이어가 승리했습니다!");
			System.out.println();
			System.out.println("플레이어의 남은 hp:"+p.hp);
			System.out.println("몬스터의 남은 hp:"+m.hp);
		}else {
			System.out.println("플레이어가 패배했습니다!");
			System.out.println();
			System.out.println("플레이어의 남은 hp:"+p.hp);
			System.out.println("몬스터의 남은 hp:"+m.hp);
		}
		
		
	}
	
	public static void main(String[] args) {
		player myPlayer = new player();
		monster myMonster = new monster();
		
		전투하기(myPlayer,myMonster);
	}
}
