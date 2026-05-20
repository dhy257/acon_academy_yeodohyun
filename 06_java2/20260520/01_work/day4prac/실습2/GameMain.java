package day4prac.실습2;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Random;

public class GameMain {

	public static void main(String[] args) {

		try {

			Properties p = new Properties();

			p.load(new FileReader(
					"C:\\Users\\user\\Desktop\\acon_academy_yeodohyun\\06_java2\\20260520\\01_work\\day4prac\\실습2\\config.txt"));

			String className = p.getProperty("weapon");
			String characterName = p.getProperty("characterName");

			System.out.println("현재 장착 무기 : " + className);

			// Reflection
			Class clazz = Class.forName(className);

			Weapon weapon = (Weapon) clazz.getDeclaredConstructor().newInstance();

			// 캐릭터 생성
			GameCharacter character = new GameCharacter(characterName);

			character.setWeapon(weapon);

			// 랜덤 적 생성
			Enemy enemy;

			Random r = new Random();

			int num = r.nextInt(3);

			if (num == 0) {
				enemy = new Goblin();
			} else if (num == 1) {
				enemy = new Orc();
			} else {
				enemy = new Dragon();
			}

			// 전투
			character.fight(enemy);

			// 히든 스킬
			Method m = clazz.getDeclaredMethod("medicalHeal");

			m.setAccessible(true);

			m.invoke(weapon);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}