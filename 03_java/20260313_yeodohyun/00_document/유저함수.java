package j0312;

public class 유저함수 {
    public static void main(String[] args) {
        UserEntity user = new UserEntity();
        /*
        user.Age=25;
        user.isAdmin=true;
        user.name="김재민";
        user.id=1l;
        */
        user.introduce();  //  introduce(  user)

        UserEntity kim = new UserEntity(false,"jaemin",2l,"123123",20);
        kim.introduce();
    }
}
