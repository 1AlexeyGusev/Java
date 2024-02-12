package Lesson_03.Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100));

        }
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
