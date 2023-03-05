public class Homework15 {
    public static void main(String[] args) {
        //Задача 1. С помощью цикла For написать метод, возвращаюший сумму всех четных целых чисел от 1 до заданного числа n
        //Задача 2()*
        //С помощью вложенного цикла For (цикл в цикле) вывести на экран таблицу умножения
        //System.out.println(sumOfEvenNumbers(8));
        //System.out.println(sumOfEvenNumbers2(8));
        //multiplicationTable();
        multiplicationAsTable();
    }

    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumOfEvenNumbers2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                sum = sum + i;
        }
        return sum;
    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(i + "*" + j + "=" + j * i);
        }
        System.out.println("***************************");
    }

    public static void multiplicationAsTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}
