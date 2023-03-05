public class Homework9 {
    //1. Даны две строки. Написать программу, выводящую в консоль строки, соединенные вместе,
    // но без последних букв. Все буквы в получившейся строке должны быть заглавными
    //Пример: Hello World -> HELLWORL

    //2. Написать программу, принимающую с клавиатуры слово, состоящее из не повторяющихся заглавных
    // или прописных (больших или маленьких) букв и принимающую затем также с клавиатуры одну из букв этого слова.
    // Программа заменяет эту букву в строке на звездочку и все буквы на прописные(маленькие) и выводит результат на экран
    //   Пример: было "AbCDe". Для буквы С стало: ab*de

    public static void main(String[] args) {
        //System.out.printf("%S%n", CapitalLetterString("Hello", "World"));//1 вариант через формат-е строки
        System.out.println(CapitalLetterString("Hello", "World"));// 2 вариант через метод toUpperCase
        System.out.println(ReplaceLetter("AbCDe", "C"));
    }
    public static String CapitalLetterString(String a, String b) {
        //return a.substring(0, a.length() - 1) + b.substring(0, b.length() - 1);
        return (a.substring(0, a.length() - 1) + b.substring(0, b.length() - 1)).toUpperCase();
    }
   public static String ReplaceLetter(String str, String letter) {
        return str.replace(letter,"*").toLowerCase() ;
    }
}

