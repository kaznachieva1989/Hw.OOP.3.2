package com.company;

import java.util.Random;

public class Age {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(200) + 1;
        try {
            if (age > 1 && age < 100) {
                System.out.println("Все верно, ваше число =  " + age);
            } else {
                throw new IllegalAgeException("Ошибка!!!  " + age + "  Ваше число за пределами 1-100");
            }
        } catch (IllegalAgeException iae) {
            System.out.println(iae.getMessage());
        }
    }
}

