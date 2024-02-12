package Lesson_06.Seminar_06.home_work;

import java.util.Map;
import java.util.Scanner;

public class Input {
    public static void scanner(Map<Integer, Notebook>nb){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1- Отсортировать ноутбуки: \n" +
                    "0 - Выйти.");
            int input = scanner.nextInt();
            if(input == 1){
                System.out.println("Введите объем памяти:");
                int input1 = scanner.nextInt();
                System.out.println("Введите объем SSD");
                int input2 = scanner.nextInt();
                System.out.println("Введите диагональ");
                int input3 = scanner.nextInt();
                System.out.println("Поиск 0");
                int exit = scanner.nextInt();
                if(exit == 0){
                    Filter.filter(nb, input1, input2, input3);
                }
            }
            if (input == 0){
                System.out.println("Выход");
                flag = false;
            }

        }
    }
}
