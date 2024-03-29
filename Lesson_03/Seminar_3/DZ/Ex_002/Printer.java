package Lesson_03.Seminar_3.DZ.Ex_002;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        List<Integer>list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(a -> a % 2 == 0);
        System.out.println(list);

//       for (int i =0; i< arr.length;i++) {
//         if (arr[i] % 2 != 0) {
//           list.add(arr[i]);
//         }
//       }
//       return list;


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);

    }
}