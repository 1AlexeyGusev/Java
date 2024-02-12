package Lesson_06.Seminar_06.home_work;
/*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
    отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    Например:
    “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        5 - поиск
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
    также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

    Частые ошибки:
    1. Заставляете пользователя вводить все существующие критерии фильтрации
    2. Невозможно использовать более одного критерия фильтрации одновременно
    3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
    4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков
    или добавить еще ноутбук, то программа начинает работать некорректно
    */
public class Notebook {
    String manufacturer;
    Double display_size;
    String operating_system;
    String CPU_model;
    Integer RAM;
    Integer SSD_capacity;
    Integer HDD_capacity;

    public String getManufacturer(){
        return manufacturer;
    }
    public Double getDisplay_size(){
        return display_size;
    }
    public String getOperating_system(){
        return operating_system;
    }
    public String getCPU_model(){
        return CPU_model;
    }
    public Integer getRAM(){
        return RAM;
    }
    public Integer getSSD_capacity(){
        return SSD_capacity;
    }
    public Integer getHDD_capacity(){
        return HDD_capacity;
    }



    public String toString(){
        return "Ноутбук " + manufacturer + "/" + display_size+ "'/" + operating_system + "/CPU "
                + CPU_model + "/RAM " + RAM + "Gb/SSD " + SSD_capacity + "Gb/HDD " + HDD_capacity + "Gb/GPU "
                + ".";
    }


}
