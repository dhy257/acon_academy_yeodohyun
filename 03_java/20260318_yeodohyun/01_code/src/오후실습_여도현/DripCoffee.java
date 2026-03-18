package 오후실습_여도현;

public class DripCoffee extends Coffee {

    public DripCoffee(String name) {
        super(name);
    }

    @Override
    public void make() {
        System.out.println("드립커피를 내렸다!");
    }

    public void addFilter() {
        System.out.println("필터를 추가했다!");
    }
}