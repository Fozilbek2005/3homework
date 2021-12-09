 package com.company;

public class Main {

    public static void main(String[] args) {

        //создание переменной
        int num = 20;

        //команда для распечатки
        System.out.println(num);

        String word = "Hello world";
        System.out.println(word);

        //объявление константы
        final int constNum = 50;

        if  (num < 20){
            System.out.println("bolshe 15");
        }else {
            System.out.println("bolshe 15");
        }
        switch (num){
            case 10:
                System.out.println("znachenie povno 19");
                break;
            case 20:
                System.out.println("znachenie povno 29");
        }
    }
}