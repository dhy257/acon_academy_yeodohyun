package day1.builder;

public class ArticleMain {
    public static void main(String[] args) {
        // Article 객체를 빌더 패턴으로 생성
        Article article =Article.builder()
                .title("자바 빌더 패턴 사용 예제")
                .content("빌더 패턴을 사용하여 객체를 효율적으로 생성하는 방법. 생성자는 순서가 헷갈린다. 다양한 생성자를 만들어야 한다")
                .build();

        // 생성된 Article 객체 출력
        System.out.println(article);
    }
}
