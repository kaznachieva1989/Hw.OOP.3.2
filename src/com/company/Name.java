package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:  ");
        String name = scanner.nextLine();
        try {
            if (name.length() < 20) {
                System.out.println(name + " - имя соответствует заданным параметрам");
            } else {
                throw new IllegalNameLengthException( name + " - Длина имени больше 20 символов");
            }
        } catch (IllegalNameLengthException inle) {
            inle.printStackTrace();
        }
    }
}