package Lesson_06.Seminar_06.home_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {
    public static void filter(Map<Integer, Notebook>filter, int input1, int input2, int input3){
        List<Notebook>result = new ArrayList<>();
        for(Map.Entry<Integer, Notebook> entry : filter.entrySet()){
            if(input1 <= entry.getValue().getRAM()&& input2 <= entry.getValue().getSSD_capacity()&&
                    input3 <= entry.getValue().getDisplay_size()){
                result.add(entry.getValue());
            }
        }
        if(result.isEmpty()){
            System.out.println("Ноутбуков по выбранным критериям нет");
        } else System.out.println(result);
    }
}
