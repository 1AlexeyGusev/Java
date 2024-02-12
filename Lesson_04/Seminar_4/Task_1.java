package Lesson_04.Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
         List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        test(list1);
        test(list2);

        test2(list1);
        test2(list2);
    }

    private static void test(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": " + (timeFinish - timeStart));
    }

    static void test2(List<Integer> list){
        long sum = 0;
        long timeStart = System.currentTimeMillis();
        for (Integer integer : list) {
            sum += integer;
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(list.getClass().getSimpleName() + ": " + (timeFinish - timeStart));
    }
}

