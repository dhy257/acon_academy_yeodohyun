package day1.builder;

public class Movie {

    private String name;
    private String director;
 
    
    
    

    @Override
	public String toString() {
		return "Movie [name=" + name + ", director=" + director + "]";
	}



	private Movie(Builder builder) {
        this.name = builder.name;
        this.director = builder.director;
      
    }
    

    
    public String getName() {
		return name;
	}



	public String getDirector() {
		return director;
	}


	//빌더객체생성하기
	public static Builder builder() {
        return new Builder();
    }
	

	//
    public static class Builder {

        private String name;
        private String director;
    

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder director(String director) {
            this.director = director;
            return this;
        }

       
        public Movie build() {
            return new Movie(this);
        }
    }
}