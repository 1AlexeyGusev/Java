package DZ;
// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

// Напишите свой код в методе printPrimeNums класса Answer.
public class DZ_1 {
    public void printPrimeNums() {
        int num = 1000;
        for (int i = 2; i < num; i++) {
            boolean check = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
   }

}
       