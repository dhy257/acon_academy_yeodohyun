# 02. ArrayList&lt;Acorn&gt; 정렬

## 학습 목표

- `ArrayList<Acorn>` 형태의 객체 목록을 만들 수 있다.
- `Comparable<Acorn>`을 구현해서 기본 정렬 기준을 만들 수 있다.
- `Comparator<Acorn>`를 사용해서 여러 정렬 기준을 만들 수 있다.
- `Collections.sort()`와 `list.sort()`를 사용할 수 있다.

## 1. 객체 배열과 ArrayList

기본 자료형 배열은 정렬 기준이 단순하다.

```java
int[] numbers = {3, 1, 2};
```

숫자는 크고 작음이 명확하다. 하지만 객체는 다르다.

```java
class Acorn {
    String name;
    int age;
    int score;
}
```

`Acorn` 객체를 정렬할 때는 어떤 기준으로 정렬할지 정해야 한다.

- 이름순인가?
- 나이순인가?
- 점수순인가?

객체 정렬에서는 정렬 알고리즘보다 정렬 기준이 더 중요하다.

## 2. Acorn 클래스 만들기

```java
class Acorn {
    String name;
    int age;
    int score;

    Acorn(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Acorn{name='" + name + "', age=" + age + ", score=" + score + "}";
    }
}
```

`toString()`을 오버라이드하면 리스트를 출력했을 때 객체 내용이 보기 좋게 나온다.

```java
ArrayList<Acorn> list = new ArrayList<>();
list.add(new Acorn("김민경", 24, 90));
list.add(new Acorn("여도현", 28, 80));
list.add(new Acorn("정철진", 22, 95));

System.out.println(list);
```

## 3. Comparable로 기본 정렬 기준 만들기

`Comparable`은 객체 자신이 정렬 기준을 가지는 방식이다.

```java
class Acorn implements Comparable<Acorn> {
    String name;
    int age;
    int score;

    Acorn(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Acorn other) {
        return this.score - other.score;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + ", " + score + "]";
    }
}
```

`compareTo()`는 현재 객체와 다른 객체를 비교한다.

```java
return this.score - other.score;
```

이 코드는 점수 오름차순이다.

- 현재 점수가 더 크면 양수
- 점수가 같으면 0
- 현재 점수가 더 작으면 음수

정렬 코드는 다음과 같다.

```java
import java.util.ArrayList;
import java.util.Collections;

public class AcornComparableMain {
    public static void main(String[] args) {
        ArrayList<Acorn> list = new ArrayList<>();
        list.add(new Acorn("김민경", 24, 90));
        list.add(new Acorn("여도현", 28, 80));
        list.add(new Acorn("정철진", 22, 95));

        Collections.sort(list);

        System.out.println(list);
    }
}
```

`Collections.sort(list)`가 가능하려면 `Acorn`이 `Comparable<Acorn>`을 구현해야 한다.

## 4. 내림차순으로 바꾸기

점수 내림차순은 빼는 순서를 바꾸면 된다.

```java
@Override
public int compareTo(Acorn other) {
    return other.score - this.score;
}
```

기존 수업 코드의 `Student` 예제처럼 총점 내림차순을 기본 정렬로 만들고 싶을 때 이런 방식을 쓴다.

## 5. Comparator로 정렬 기준 따로 만들기

`Comparable`은 클래스 안에 기본 기준을 하나 정한다. 그런데 프로그램을 만들다 보면 상황마다 다른 기준이 필요하다.

- 점수순
- 나이순
- 이름순

이럴 때 `Comparator`를 사용한다.

```java
import java.util.Comparator;

Comparator<Acorn> byAge = new Comparator<Acorn>() {
    @Override
    public int compare(Acorn a1, Acorn a2) {
        return a1.age - a2.age;
    }
};
```

정렬할 때는 기준 객체를 함께 넘긴다.

```java
Collections.sort(list, byAge);
```

## 6. 익명 클래스로 Comparator 사용하기

```java
Collections.sort(list, new Comparator<Acorn>() {
    @Override
    public int compare(Acorn a1, Acorn a2) {
        return a1.age - a2.age;
    }
});
```

이 방식은 수업에서 본 익명 클래스와 같은 형태이다. `Comparator` 인터페이스를 구현하는 클래스를 따로 만들지 않고, 필요한 자리에서 바로 구현한다.

## 7. 람다식으로 Comparator 줄이기

`Comparator`는 구현해야 할 매서드가 `compare()` 하나뿐인 함수형 인터페이스이다. 그래서 람다식으로 줄일 수 있다.

```java
Collections.sort(list, (a1, a2) -> a1.age - a2.age);
```

이름순 정렬은 문자열의 `compareTo()`를 사용한다.

```java
Collections.sort(list, (a1, a2) -> a1.name.compareTo(a2.name));
```

점수 내림차순은 다음처럼 작성한다.

```java
Collections.sort(list, (a1, a2) -> a2.score - a1.score);
```

## 8. list.sort() 사용하기

`ArrayList` 자체에도 정렬 매서드가 있다.

```java
list.sort((a1, a2) -> a1.age - a2.age);
```

`Collections.sort(list, comparator)`와 `list.sort(comparator)`는 실제 학습 단계에서는 거의 같은 목적으로 사용한다고 보면 된다.

## 9. 전체 예제

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Acorn implements Comparable<Acorn> {
    String name;
    int age;
    int score;

    Acorn(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Acorn other) {
        return this.score - other.score;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + ", " + score + "]";
    }
}

public class AcornSortMain {
    public static void main(String[] args) {
        ArrayList<Acorn> list = new ArrayList<>();
        list.add(new Acorn("김민경", 24, 90));
        list.add(new Acorn("여도현", 28, 80));
        list.add(new Acorn("정철진", 22, 95));

        Collections.sort(list);
        System.out.println("점수 오름차순: " + list);

        Collections.sort(list, new Comparator<Acorn>() {
            @Override
            public int compare(Acorn a1, Acorn a2) {
                return a1.age - a2.age;
            }
        });
        System.out.println("나이 오름차순: " + list);

        list.sort((a1, a2) -> a1.name.compareTo(a2.name));
        System.out.println("이름 오름차순: " + list);
    }
}
```

## 10. Comparable과 Comparator 선택 기준

| 상황 | 사용 |
|---|---|
| 객체의 기본 정렬 기준이 하나 필요하다 | `Comparable` |
| 정렬 기준을 여러 개 만들고 싶다 | `Comparator` |
| `Collections.sort(list)`만 쓰고 싶다 | `Comparable` |
| `Collections.sort(list, 기준)`으로 정렬하고 싶다 | `Comparator` |

## 연습 문제

1. `Acorn`을 점수 오름차순으로 정렬해 보자.
2. `Acorn`을 점수 내림차순으로 정렬해 보자.
3. `Acorn`을 나이 오름차순으로 정렬해 보자.
4. `Acorn`을 이름 가나다순으로 정렬해 보자.
5. `Comparable`과 `Comparator`의 차이를 한 문장씩 정리해 보자.
