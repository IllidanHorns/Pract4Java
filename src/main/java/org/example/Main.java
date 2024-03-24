package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] firms = new String[] {"Casio", "Rolex", "Omega", "Seiko"}; //Массив фирм часов
        String [][] marks = new String[][]{ //Двумерный массив марок часов, связанный с массивом фирм часов
                {firms[0], "G-Shock GM-2100B-4A", "Edifice EFS-S560DC-1A"},
                {firms[1], "Submariner", "Yacht-Master"},
                {firms[2], "BREITLING A13313121B1A1", "TAG HEUER WBP201C.BA0632"},
                {firms[3], "Seiko SRPK33K1", "Seiko 5 SNK385K1"}
        };
        ArrayList<Object> user_infotmation = new ArrayList<>(); // Массив для храннения данных пользователя


        for (int i = 0; i<3; i++){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Создание переменной для счивания данных (для работы функции .readLine)
            Scanner sc = new Scanner(System.in); //Создание переменной для счивания данных (для работы функции .nextInt)
            System.out.println("В ассортименте магазина представлены следующие часы - ");
            System.out.println("1) Фирма - " + marks[0][0] + " Марки часов: " + "1) " + marks[0][1] + ", " + "2) " + marks[0][2]);
            System.out.println("2) Фирма - " + marks[1][0] + " Марки часов: " + "1) " + marks[1][1] + ", " + "2) "+ marks[1][2]);
            System.out.println("3) Фирма - " + marks[2][0] + " Марки часов: " + "1) " + marks[2][1] + ", " + "2) " + marks[2][2]);
            System.out.println("4) Фирма - " + marks[3][0] + " Марки часов: " + "1) " + marks[3][1] + ", " + "2) " + marks[3][2]);

            System.out.println("Введите своё ФИО");
            String a = br.readLine();
            user_infotmation.add(a); // Запись ФИО пользователя в массив user_infotmation
            System.out.println("Введите email");
            String b = br.readLine();
            user_infotmation.add(b); // Запись email пользователя в массив user_infotmation
            System.out.println("Введите номер телефона");
            String c = br.readLine();
            user_infotmation.add(c); // Запись номера телефона пользователя в массив user_infotmation
            System.out.println("Введите номер фирмы часов");
            int d = sc.nextInt();
            System.out.println("Введите номер марки часов");
            int e = sc.nextInt();
            user_infotmation.add(marks[d-1][e]); // Запись марки часов в массив user_infotmation
            System.out.println("Введите кол-во");
            int z = sc.nextInt(); // Запись кол-ва часов в массив user_infotmation
            user_infotmation.add(z);
            String s = sc.nextLine(); // Считывание строки для корректной работы функции .nextLine()

            // Вывод данных пользователя о заказе
            System.out.println("Информация о вашем заказе");
            System.out.println("Ваш ФИО - " + a);
            System.out.println("Ваши данные - " + b + " " + c);
            System.out.println("Часы - " + firms[d-1] + marks[d-1][e]);
        }
    }
}