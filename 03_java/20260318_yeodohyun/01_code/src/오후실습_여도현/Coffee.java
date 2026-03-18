package 오후실습_여도현;

public class Coffee {
    String name;

    public Coffee(String name) {
        this.name = name;
    }

    public void make() {
        System.out.println("커피를 만들었다!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}