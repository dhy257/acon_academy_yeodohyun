package day1.매서드매개변수_와일드카드;

import java.util.*;

//가볍게 보기 



class Animal {
 void eat() { System.out.println("Animal eating"); }
}

class Dog extends Animal {
 void bark() { System.out.println("Dog barking"); }
}

class Cat extends Animal {
 void meow() { System.out.println("Cat meowing"); }
}

public class WildcardExample {
 public static void main(String[] args) {
	 
	 // ? extends Animal    :  읽기전용
	 // ? super  Animal     :  쓰기전용   ( Animal과 그 하위는 안전하게 add할 수 있다)
	 

     //   1.  ? extends Animal : Animal의 하위 타입 리스트 (읽기 전용)
     List<? extends Animal> animals = new ArrayList<Dog>();
     //“이 리스트에는 Animal을 상속받은 어떤 하위 타입의 리스트가 올 수 있다.”
     
     //  무엇을 들어갈지 모르기 때문에 add가 막혀있다
     //  animals.add(new Dog());   //   컴파일 에러 (무엇이 들어갈지 모르기 때문)
     //   animals.add(new Cat());   //    

     //   읽기 가능 — 최소한 Animal임이 보장됨
     // 하지만 Dog일 수도 Cat일 수도 있음
     Animal a = animals.get(0); //  가능 (Animal로 꺼내기)
     
     //위에거 하나만 이해해도 됨
     
     

     //  2.   ? super Animal : Animal의 상위 타입 리스트 (쓰기 전용)
   
     List<? super Animal> animals2 = new ArrayList<Object>();
     // 이 리스트(animals2)는 Animal 타입 또는 Animal의 상위 타입(Object, 생략된 다른 부모 등) 의 리스트일 수 있다는 뜻

     
     //   쓰기 가능 — 최소한 Animal 또는 그 하위 타입은 안전하게 쓰기 가능  
     animals2.add(new Dog());
     animals2.add(new Cat());
     animals2.add(new Animal());
     
   

     //  읽기 제한 — 어떤 상위 타입(Object, Animal, ...)인지 모르므로
     Object obj = animals2.get(0); //    Object로만 꺼낼 수 있음
   // Animal a2 = animals2.get(0); //  컴파일 에러

    
 }
}
