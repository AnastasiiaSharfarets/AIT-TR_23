public class TaskBoolean {
    public static void main(String[] args) {
        //Задача 3.Даны два целые числа a и b. Написать логическое выражение, возвращающее true если одно из чисел равно 10
        // или их сумма равна 10. Использовать можно только логические операторы AND OR NOT XOR, операторы сравнения (==, >, <, != )
        //Ну и арифметические конечно тоже)
        System.out.println(numbers(10, 10));
        System.out.println(numbers(3, 7));
        System.out.println(numbers(30, 87));
        System.out.println(numbers(10, 0));
        System.out.println(numbers(1, 9));
        System.out.println(numbers(10000, 10));
    }

    public static boolean numbers(int a, int b) {
        boolean result = a == 10 || b == 10 || a + b == 10;
        return result;
    }

}