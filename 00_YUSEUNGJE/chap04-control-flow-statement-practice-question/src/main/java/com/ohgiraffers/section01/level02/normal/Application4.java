package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Random;

public class Application4 {

    public static void main(String[] args) {

        Random rad = new Random();

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rad.nextInt(45) +1;

            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(arr);

        System.out.print("생성된 로또 번호");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */


    }
}
