package day4prac.정철진여도현실습;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class GameContainer {
    private Map<String, String> configMap = new HashMap<>();
    private GameCharacter character;
    private Object weaponInstance; 
    private Class<?> weaponClass;

    public GameContainer() {
        loadConfig();
        assembleDependencies();
    }

    private void loadConfig() {
        String configPath = "C:\\Users\\user\\Desktop\\acon_academy_yeodohyun\\06_java2\\20260520\\01_work\\day4prac\\정철진여도현실습\\config.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(configPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty() || line.startsWith("#")) continue;
                
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    configMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            System.out.println("성공 (경로: " + configPath + ")");
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
            System.out.println("-> 현재 설정된 경로가 올바른지 확인: " + configPath);
        }
    }

    private void assembleDependencies() {
        try {
            String charName = configMap.getOrDefault("characterName", "기본캐릭터");
            String weaponClassName = configMap.get("weaponClass");

            // 캐릭터 객체 생성
            this.character = new GameCharacter(charName);

            if (weaponClassName != null && !weaponClassName.isEmpty()) {
                this.weaponClass = Class.forName(weaponClassName);
                
                this.weaponInstance = this.weaponClass.getDeclaredConstructor().newInstance();

                this.character.setWeapon((Weapon) this.weaponInstance);
                System.out.println("[완료] " + charName + " 캐릭터에 " + weaponClassName + " ");
            }
        } catch (Exception e) {
            System.out.println("의존성 주입 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public GameCharacter getCharacter() {
        return this.character;
    }

    public Class<?> getWeaponClass() {
        return this.weaponClass;
    }

    public Object getWeaponInstance() {
        return this.weaponInstance;
    }
}