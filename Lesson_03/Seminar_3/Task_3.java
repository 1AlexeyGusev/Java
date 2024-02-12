package Lesson_03.Seminar_3;

import java.util.ArrayList;
import java.util.List;

// Каталог товаров книжного магазина сохранен в виде двумерного списка 
// List<ArrayList<String>>так,что на 0 й позиции каждого внутреннего списка 
// содержится название жанра,а на остальных позициях-названия книг.Напишите 
// метод для заполнения данной структуры.
public class Task_3 {
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Сказка", "Золотой ключик");
        addBook(shopBook, "Роман", "Мастер и Маргарита");
        addBook(shopBook, "Сказка", "Репка");
        addBook(shopBook, "Фентези", "Гарри Поттер");
        addBook(shopBook, "Роман", "Война и Мир");
        addBook(shopBook, "Фентези", "Ночной дозор");
        
        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> bookshelf = shopBook.get(i);
            if (bookshelf.get(0).equals(genre)) {
                bookshelf.add(nameBook);
                return;
            }

        }
        List<String> newBookshelf = new ArrayList<>();
        newBookshelf.add(genre);
        newBookshelf.add(nameBook);
        shopBook.add(newBookshelf);
        
    }
}
