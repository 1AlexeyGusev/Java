package Lesson_03.Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
public class Task_2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(123);
        list.add(321);
        list.add(null);
        list.add("string");
        list.add(3.14);
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) instanceof Integer) {
        //         list.remove(i--);   // -- нужен, чтобы уменьшить индекс на 1, тк при удалении эл-та следующему эл-ту присваивается его индекс
        //     }
        // }
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
