package DZ;
// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

// Напишите свой код в методе printPrimeNums класса Answer.
public class Printer {
    public void printPrimeNums() {
        // Напишите свое решение ниже
        for (int i = 1; i < 1000; i++) {
            if (i % i == 0)
                ;
            System.out.println(i++);
        else i++;
            
        }
    }
    public static void main(String[] args) { 
      
        Answer ans = new Answer();      
        ans.printPrimeNums();
      }
}
