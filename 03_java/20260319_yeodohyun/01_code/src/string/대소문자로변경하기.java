package string;

public class 대소문자로변경하기 {
	public static void main(String[] args) {
		String str = "i love java"; // 문자열배열은 반드시 문자열객체.매서드 로만 사용
		
		String upperStr = str.toUpperCase();
		
		System.out.println(str);
		System.out.println(upperStr);
		
		String str2 ="JAVA";
		String lowerStr = str2.toLowerCase();
		
		System.out.println(str2);
		System.out.println(lowerStr);
	}
}
