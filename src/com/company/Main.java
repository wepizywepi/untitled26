package com.company;

public class Main {

    public static void main(String[] args) {
        Father ObjectA = new Father(EyeColor.GRAY, "Дио", 44, new Job("Юрист"));
        Son ObjectB = new Son(EyeColor.GREEN, "Джорно", 16, new Job("Ученик"));
        Son ObjectC = new Son(EyeColor.BLACK, "Джотаро", 22, new Job("Студент"));

        ObjectA.getInfo();
        ObjectB.getInfo();
        ObjectC.getInfo();
    }
    }

