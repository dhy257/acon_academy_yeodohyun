package day5.annotation.sample3;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class 사용자등록검증하기 {
    public static void main(String[] args) {
        User user = new User(20, "gildong", "gildong@example.com");
        try {
            validateUser(user);
            System.out.println("유저 등록이 완료되었습니다.");
        } catch (Exception e) {
            System.out.println("유저 등록 실패: " + e.getMessage());
        }
    }

    public static void validateUser(User user) throws Exception {
    	
        Field[] fields = user.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // private 필드에 접근할 수 있도록 설정
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof AgeValidation) {
                    validateAge(field, user);
                } else if (annotation instanceof NameValidation) {
                    validateName(field, user);
                } else if (annotation instanceof EmailValidation) {
                    validateEmail(field, user);
                }
            }
        }
    }

    
    private static void validateAge(Field field, User user) throws Exception {
        try {
            int age = (int) field.get(user);            
            if (age < 18) {
                throw new Exception("나이가 18세 미만입니다.");
            }
        } catch (Exception e) {
            throw new Exception("애너테이션 검증 중 오류 발생: " + e.getMessage());
        }
    }

    private static void validateName(Field field, User user) throws Exception {
        try {
            String name = (String) field.get(user);
            if (name.isEmpty()) {
                throw new Exception("이름이 비어 있습니다.");
            }
        } catch (Exception e) {
            throw new Exception("애너테이션 검증 중 오류 발생: " + e.getMessage());
        }
    }

    private static void validateEmail(Field field, User user) throws Exception {
        try {
            String email = (String) field.get(user);
            if (!isValidEmail(email)) {
                throw new Exception("유효하지 않은 이메일 형식입니다.");
            }
        } catch (Exception e) {
            throw new Exception("애너테이션 검증 중 오류 발생: " + e.getMessage());
        }
    }

    public static boolean isValidEmail(String email) {
        // 이메일 유효성 검사는 간단한 형식으로 하겠습니다.
        // @가 포함되어 있으면 유효한 이메일로 판단합니다.
        return email.contains("@");
    }
}

class User {
    @AgeValidation( )
    private int age;

    @NameValidation
    private String name;

    @EmailValidation
    private String email;

    public User(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface AgeValidation {

	 
 
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NameValidation {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface EmailValidation {
}

 