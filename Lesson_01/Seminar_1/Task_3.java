package Lesson_01.Seminar_1;// Дан массив nums = [3,2,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в 
// конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны
//  от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {3, 2, 7, 3, 5, 3};
        int val = 3;
        int[] result = sort(array, val);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] array, int val) {
        int[] array_1 = new int[array.length];
        Arrays.fill(array_1, val);
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != val) {
                array_1[j++] = array[i];
            }
        }
        return array_1;
    }
}