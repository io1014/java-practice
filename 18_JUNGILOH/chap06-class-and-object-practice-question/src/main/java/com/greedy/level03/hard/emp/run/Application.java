package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO emp = new EmployeeDTO();
        System.out.print("직원 번호");
        emp.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("이름");
        emp.setName(sc.nextLine());

        System.out.print("부서");
        emp.setDept(sc.nextLine());

        System.out.print("직급");
        emp.setJob(sc.nextLine());

        System.out.print("나이");
        emp.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("성별");
        emp.setGender(sc.nextLine().charAt(0));

        System.out.print("급여");
        emp.setSalary(sc.nextInt());
        sc.nextLine();

        System.out.print("보너스 포인트");
        emp.setBounusPoint(sc.nextDouble());
        sc.nextLine();

        System.out.print("전화번호");
        emp.setPhone(sc.nextLine());

        System.out.print("주소");
        emp.setAddress(sc.nextLine());

        System.out.println(emp.getNumber());
        System.out.println(emp.getName());
        System.out.println(emp.getDept());
        System.out.println(emp.getJob());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
        System.out.println(emp.getSalary());
        System.out.println(emp.getBounusPoint());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());
    }
}
