package Lesson_06.Seminar_06.home_work;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();
        notebook1.manufacturer = "Apple";
        notebook1.display_size = 14.0;
        notebook1.operating_system = "MacOS";
        notebook1.CPU_model = "Intel";
        notebook1.RAM = 12;
        notebook1.SSD_capacity = 256;
        notebook1.HDD_capacity = 1024;


        Notebook notebook2 = new Notebook();
        notebook2.manufacturer = "Asus";
        notebook2.display_size = 15.0;
        notebook2.operating_system = "Windows";
        notebook2.CPU_model = "AMD";
        notebook2.RAM = 4;
        notebook2.SSD_capacity = 512;
        notebook2.HDD_capacity = 1024;


        Notebook notebook3 = new Notebook();
        notebook3.manufacturer = "Apple";
        notebook3.display_size = 15.0;
        notebook3.operating_system = "MacOS";
        notebook3.CPU_model = "Intel";
        notebook3.RAM = 16;
        notebook3.SSD_capacity = 512;
        notebook3.HDD_capacity = 1024;


        Notebook notebook4 = new Notebook();
        notebook4.manufacturer = "Lenovo";
        notebook4.display_size = 16.0;
        notebook4.operating_system = "Windows";
        notebook4.CPU_model = "AMD";
        notebook4.RAM = 8;
        notebook4.SSD_capacity = 128;
        notebook4.HDD_capacity = 2048;


        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);



        Map<Integer, Notebook> nb = new HashMap<>();
        Iterator<Notebook> iterator = notebooks.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            nb.put(i, (Notebook) iterator.next());
        }
        Input.scanner(nb);





    }
}
