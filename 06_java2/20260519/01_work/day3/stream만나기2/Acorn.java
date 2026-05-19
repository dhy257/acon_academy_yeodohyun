package day3.stream만나기2;

public class Acorn {
    private String name;
    private String password;
    private String id;

    public Acorn(String name, String password, String id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Acorn{name='" + name + "', password='" + password + "', id='" + id + "'}";
    }

    // equals()와 hashCode() 메서드도 구현하여 Set에서 중복 처리가 되도록 해야 합니다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acorn acorn = (Acorn) o;
        return id.equals(acorn.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
