package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
//	    user.setName("Masha");
//	    user.setAge(100);
//      System.out.println(user.getName() + " " + user.getAge());


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваше имя: ");
            user.setName(input.nextLine());

            Scanner number = new Scanner(System.in);
            System.out.print("Введите ваш возраст: ");
            user.setAge(number.nextInt());
            try {
                System.out.println(user.getName());
                System.out.println(user.getAge());
            } catch (Exception e) {
                e.getMessage();
                break;
            }
        }
    }

}
