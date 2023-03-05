public class Homework16 {
    //Задача 1
    //Написать метод, выводящий на экран все четные числа в диапазоне от 1 до 10 с использованием цикла for и оператора continue
    //Задача 2()*
    //Написать метод, выводящий на экран треугольник из 6 строк такого вида:
    //1
    //22
    //333
    //4444
    //55555
    //666666
    public static void main(String[] args) {
        //printEvenNumbers(10);
        printTriangle(6);
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printEvenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}

