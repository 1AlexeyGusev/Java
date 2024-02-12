package Lesson_06.Seminar_06.Task_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
import java.util.Set;

//        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set
//вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Main {
    public static void main(String[] args) {
        Integer[] array = fill(1000, 0, 24);
        double p = percent(array);
        System.out.println(p);
    }


    static Integer[] fill(int count, int first, int last) {
        Integer[] arr = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt(first, last + 1);
        }
        return arr;
    }
    static double percent(Integer[]arr){
        Set<Integer>set=new HashSet<>(Arrays.asList(arr));
        return set.size()*100.0/arr.length;
    }

}
