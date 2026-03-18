package com.d0318.progress.inheritanceProgress01;

public class HSI extends AcornStudent{
    public HSI(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString(){
        return "이름 : " + name + "\n나이 : " + age;
    }

    @Override
    public void 음료마시기(){
        System.out.println("펩시 제로 콜라를 마신다.");
    }

    public static void main(String[] args) {
        HSI hsi = new HSI("황스일" , 25);
        System.out.println(hsi);
        hsi.음료마시기();
    }
}
