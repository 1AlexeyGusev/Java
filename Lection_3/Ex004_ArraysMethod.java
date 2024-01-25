package Lection_3;

import java.util.Arrays;
import java.util.List;

public class Ex004_ArraysMethod {
    public static void main(String[] args) {
        // int day = 29;
        // int month = 9;
        // int year = 1990;
        // Integer[] date = { day, month, year };
        // List<Integer> d = Arrays.asList(date);
        // System.out.println(d);


        //2.Через StringBuilder================================================
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[] { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [28, 9, 1990]
        date[1] = new StringBuilder("09");  // [28, 09 ,1990]
        System.out.println(d);

    }
}
