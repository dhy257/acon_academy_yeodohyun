package 실기시험여도현;

class MyClass {

	public int getTotal(int su) {
		int sum = 0;
		for (int i = 1; i <= su; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m = new MyClass();
		int result = m.getTotal(10);
		System.out.println(result);
	}
}