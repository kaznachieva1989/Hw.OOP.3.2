package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 7) {
            try {
                throw new Exception (name + " - Длина имени больше 7 символов");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            try {
                throw new IllegalAgeException ("Ошибка!!!  " + age + "  Ваш возраст за пределами 1-100");
            } catch (IllegalAgeException ilae) {
                ilae.printStackTrace();
            }
        }
        this.age = age;
    }
}
