import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "input.txt";

        int wordCount = countWords(filePath);
        System.out.println("Количество слов: " + wordCount);

        String longestWord = findLongestWord(filePath);
        System.out.println("Самое длинное слово: " + longestWord);

        Map<String, Integer> wordFreq = countWordFreq(filePath);
        System.out.println("Частота слов в файле: ");
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static int countWords (String filePath) throws IOException {
        int count = 0;
        try (FileInputStream fis = new FileInputStream(filePath)) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
        }
        return count;
    }

        // Поиск самого длинного слова в файле
    public static String findLongestWord (String filePath) throws IOException {
        String longestWord = "";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    // Вычисление частоты слов в файле
    public static Map<String, Integer> countWordFreq (String filePath) throws IOException {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
        return wordFrequency;

    }
}
