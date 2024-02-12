package Lesson_05.Seminar_5.Ex_4;
/*
Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
Слова с одинаковой длиной не должны “потеряться”.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        sortByLength(s);
    }

    static void sortByLength(String s){
        Map<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        String[] words = s.split(" ");
        for (String word: words){
            int len = word.length();
            if (treeMap.containsKey(len)){
                List<String> list = treeMap.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                treeMap.put(len, list);
            }
        }
        System.out.println(treeMap);
    }
}
