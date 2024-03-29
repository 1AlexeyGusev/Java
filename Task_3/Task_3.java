package Task_3;
// Напишите метод, который принимает на вход строку (String) и определяет является ли
//  строка палиндромом (возвращает boolean значение).
// Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа 
// налево.

public class Task_3 {
    public static void main(String[] args) {
        String s = "А роза упала на лапу Азора";
        System.out.println(polindromV2(s));
    }

    static Boolean polindrom(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    static boolean polindromV2(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);

    }
}
