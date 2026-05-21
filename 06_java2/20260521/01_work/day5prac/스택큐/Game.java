package day5prac.스택큐;

//Comparable 인터페이스 구현하기
class Game implements Comparable<Game> {
	String name;
	int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int prices) {
		this.price = price;
	}

	public Game(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}

	public Game() {
		// TODO Auto-generated constructor stub
	}

	@Override // 5 3 8 1
	public int compareTo(Game o) { // 오름차순, 결정 내가크면 정렬 -> 오름차순, 반대)내림차순
		// TODO Auto-generated method stub
		return this.price - o.price;
	}
}