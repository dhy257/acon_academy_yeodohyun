package j0312;

public class UserEntity {
    private boolean isAdmin;
    private String name;
    private Long id;
    private String password;
    private int Age;


    void introduce(){
        System.out.println("내 이름은 :"+this.name+" 내 나이는 :"+this.Age);
    }

    UserEntity(boolean isAdmin, String name, Long id, String password, int Age){
        this.isAdmin=isAdmin;
        this.name=name;
        this.id=id;
        this.password=password;
        this.Age=Age;
    }
    UserEntity(){

    }
}
