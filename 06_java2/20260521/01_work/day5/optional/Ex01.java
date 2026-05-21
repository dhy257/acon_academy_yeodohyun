package day5.optional;


public class Ex01 {
    public static void main(String[] args) {
        User user1 = new User("홍길동", "hong@example.com");
        User user2 = new User("김철수", null);

        // email 가져오기
        // 이메일이 있으면 이메일을 사용하고 없으면  orElse 값을 사용함 
        
        String email1 = user1.getEmail().orElse("이메	음");
        String email2 = user2.getEmail().orElse("이메일 없음");
        
        

        System.out.println(email1); // hong@example.com
        System.out.println(email2); // 이메일 없음
        
        
        
        if (user1.getEmail().isPresent()) {
            System.out.println("user1 이메일 존재: " + user1.getEmail().get());
        } else {
            System.out.println("user1 이메일이 없습니다.");
        }
        
        
        // 값이 없으면 예외 발생
        try {

            String email =
                    user2.getEmail()
                         .orElseThrow(() ->
                             new RuntimeException("이메일이 없습니다. 예외발생")
                         );

            System.out.println(email);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}