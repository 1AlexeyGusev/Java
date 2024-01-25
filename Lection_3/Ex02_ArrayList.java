package Lection_3;

import java.util.ArrayList;

public class Ex02_ArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>();  //явно указан тип Integer (Safe Type)
        ArrayList list = new ArrayList();  // Тип как Object (Row Type)
        list.add(2809);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
