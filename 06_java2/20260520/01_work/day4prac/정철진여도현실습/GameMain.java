package day4prac.정철진여도현실습;

import java.lang.reflect.Method;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("              GAME START		         ");
        System.out.println("=========================================");
        
        GameContainer container = new GameContainer();
        GameCharacter player = container.getCharacter();
        
        if (player == null) {
            System.out.println("[시스템] 캐릭터 생성에 실패하여 게임을 종료합니다.");
            return;
        }

        System.out.println("\n[시스템] 게임 인게임 진입 완료! 즐거운 시간 되세요.");
        System.out.println("-----------------------------------------");
        
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n[행동 선택] 1: 일반 공격 | 2: 무기 정보 분석(Reflection) | 3: 히든 스킬 발동(Reflection) | 0: 게임 종료");
            System.out.print(">> 선택: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.println("\n⚔️ [전투 발생] 몬스터가 나타났습니다!");
                    player.doAttack();
                    break;
                    
                case "2":
                    Class<?> weaponClass = container.getWeaponClass();
                    
                    if (weaponClass != null) {
                        System.out.println("=========================================");
                        System.out.println("[클래스명] " + weaponClass.getName());
                        System.out.println("[설계된 메서드 목록]");
                        
                        Method[] methods = weaponClass.getDeclaredMethods();
                        for (Method m : methods) {
                            System.out.println(" -> 코드: " + m.getModifiers() + " | 메서드명: " + m.getName());
                        }
                        System.out.println("=========================================");
                    } else {
                        System.out.println("[시스템] 장착된 무기가 없어 분석할 수 없습니다.");
                    }
                    break;
                    
                case "3":
                    Class<?> targetClass = container.getWeaponClass();
                    Object targetInstance = container.getWeaponInstance();

                    if (targetClass != null && targetInstance != null) {
                        try {
                            System.out.println("실행할 히든 메서드 입력:");
                            System.out.print(">> ");

                            String methodName = scanner.nextLine();

                            Method hiddenMethod =
                                    targetClass.getDeclaredMethod(methodName);

                            hiddenMethod.setAccessible(true);

                            hiddenMethod.invoke(targetInstance);

                        } catch (Exception e) {
                            System.out.println("[오류] 히든 스킬 실행 실패");
                        }
                    } else {
                        System.out.println("[시스템] 오류");
                    }
                    break;
                    
                case "0":
                    System.out.println("\n[시스템] 게임을 종료합니다.");
                    isRunning = false;
                    break;
                    
                default:
                    System.out.println("\n[경고] 잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
            System.out.println("-----------------------------------------");
        }
        
        scanner.close();
    }
}