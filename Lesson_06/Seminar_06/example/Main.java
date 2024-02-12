package Lesson_06.Seminar_06.example;

import java.util.*;

class Laptop {
    private static int count = 0;
    private int id;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Laptop(String model, int ram, int storage, String os, String color) {
        this.id = ++count;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Model 1", 8, 256, "Windows 10", "Black"));
        laptops.add(new Laptop("Model 2", 16, 512, "Windows 10", "Silver"));
        laptops.add(new Laptop("Model 3", 8, 512, "MacOS", "Grey"));
        laptops.add(new Laptop("Model 4", 16, 256, "Linux", "White"));
        laptops.add(new Laptop("Model 5", 8, 512, "Windows 10", "Black"));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "RAM");
        criteria.put(2, "Storage");
        criteria.put(3, "Operating System");
        criteria.put(4, "Color");

        Map<String, Integer> filterParams = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println("Enter minimum value for " + entry.getValue() + ":");
            int value = scanner.nextInt();
            filterParams.put(entry.getValue(), value);
        }

        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRam() >= filterParams.get("RAM") &&
                    laptop.getStorage() >= filterParams.get("Storage") &&
                    laptop.getOs().equals(filterParams.get("Operating System")) &&
                    laptop.getColor().equals(filterParams.get("Color"))) {
                filteredLaptops.add(laptop);
            }
        }

        System.out.println("\nFiltered Laptops:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}
