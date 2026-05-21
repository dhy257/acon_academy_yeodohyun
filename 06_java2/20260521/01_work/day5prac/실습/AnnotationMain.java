package day5prac.실습;

public class AnnotationMain {

	public static void main(String[] args) {

		Class<Program> clazz = Program.class;

		Author author = clazz.getAnnotation(Author.class);

		Version version = clazz.getAnnotation(Version.class);

		System.out.println("작성자 : " + author.value());
		System.out.println("버전 : " + version.number());

	}
}