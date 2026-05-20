package day4.계산기_느슨한결합;

public class C  implements Calculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println( "C   add");
		return su1 + su2;
	}

}
