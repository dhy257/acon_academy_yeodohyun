package com.d0312.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 메뉴 아이템
class MenuItem {
    String name;
    int price;
}

public class StructuringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 객체 생성
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(createItem("아메리카노", 3000));
        menuItems.add(createItem("카페라떼", 3500));
        menuItems.add(createItem("바닐라라떼", 4000));
        menuItems.add(createItem("카푸치노", 3800));
        menuItems.add(createItem("에스프레소", 2500));
        menuItems.add(createItem("자몽에이드", 4500));
        menuItems.add(createItem("페퍼민트차", 3500));

        // 2. 메뉴판 출력
        printMenu(menuItems);

        // 3. 주문 처리
        System.out.println("주문 할 메뉴의 이름을 입력하시오.");
        String input = sc.nextLine();
        System.out.println("수량을 입력하시오");
        int count = sc.nextInt();

        processOrder(menuItems, input, count);
    }

    private static MenuItem createItem(String name, int price) {
        MenuItem item = new MenuItem();
        item.name = name;
        item.price = price;
        return item;
    }

    private static void printMenu(List<MenuItem> items) {
        System.out.println("--- 키오스크 메뉴판 ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).name + " : " + items.get(i).price + "원");
        }
    }

    private static void processOrder(List<MenuItem> items, String input, int count) {
        MenuItem selectedItem = null;

        for (MenuItem item : items) {
            if (item.name.equals(input)) {
                selectedItem = item;
                break;
            }
        }

        if (selectedItem != null) {
            System.out.println("\n주문: " + selectedItem.name + " " + count + "잔");
            System.out.println("총 결제 금액: " + (selectedItem.price * count) + "원");
        } else {
            System.out.println("해당 메뉴가 존재하지 않습니다.");
        }
    }
}
