package day1.builder;

public class Article {
    private String title;
    private String content;

    // private 생성자: 외부에서 Article 객체를 직접 생성할 수 없도록 막음
    private Article(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // toString 메서드 (객체 출력 시 유용)
    @Override
    public String toString() {
        return "Article{title='" + title + "', content='" + content + "'}";
    }

    
    //
    public  static  Builder builder() {
    	return  new Builder();
    }
    
    
    // 정적 내부 클래스 Builder 정의
    public static class Builder {
        private String title;
        private String content;

        // 빌더 메서드: 각 필드를 설정하는 메서드
        public Builder title(String title) {
            this.title = title;
            return this;  // 메서드 체이닝을 위해 Builder 객체를 반환
        }

        public Builder content(String content) {
            this.content = content;
            return this;  // 메서드 체이닝을 위해 Builder 객체를 반환
        }

        // build() 메서드: 실제 Article 객체를 생성
        public Article build() {
            return new Article(this);  // Builder를 사용하여 Article 객체를 생성
        }
    }
}
