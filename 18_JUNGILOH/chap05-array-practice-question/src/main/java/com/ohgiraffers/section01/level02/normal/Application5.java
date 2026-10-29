package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해 주세요");
        String result = sc.nextLine();

        char[] arr = result.toCharArray();

        System.out.print("검색할 문자를 알려주세요");
        char search = sc.next().charAt(0);

        int num = 0;
        String num2 = "";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                num++;
                num2 += i + " ";
            }
        }
        System.out.println("존자해는 위치 :" + num2);
        System.out.println(search + "의 개수" + num);

        /*
         * 문자열을 입력받아 / 문자 하나하나를 배열에 / 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */
    }
}
