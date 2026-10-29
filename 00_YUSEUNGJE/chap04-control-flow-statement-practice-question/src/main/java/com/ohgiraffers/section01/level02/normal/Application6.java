package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요");
        String result = sc.nextLine();

        String[] menu = {"양념","불닭","뿌링클"};

        for (int i = 0; i < menu.length; i++) {
            if(menu[i].equals(result)){
                System.out.println(result + "치킨 배달 가능");
                return;
            }
        }
        System.out.println(result + "치킨은 없는 치킨입니다");
        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */


    }
}
