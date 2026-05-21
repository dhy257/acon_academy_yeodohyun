package day5prac.실습;

public class BookMain {

    public static void main(String[] args) {

        Book b1 =
                new Book("자바의 정석", "남궁성", BookGenre.과학);

        Book b2 =
                new Book("삼국지", "나관중", BookGenre.역사);

        b1.printInfo();

        System.out.println();

        b2.printInfo();

    }
}