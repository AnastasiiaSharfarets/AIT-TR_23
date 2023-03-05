import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        //прерывание циклов break
        //continue statement
        //lesson16();
        //breakInside();
        //breakLabel();
        triangleNumbers(6);
    }

    public static void lesson16() {
        Scanner scanner = new Scanner(System.in);
        String str;
        for (; ; ) {           //бесконечный цикл
            System.out.println("Enter any word or 'exit' to end the program ");
            str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit"))//выход из бесконечного цикла
                break;
        }
        System.out.println("you entered 'exit'");
    }

    // Break inside nested loops
    public static void breakInside() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);

            System.out.println("Inner loop count: ");

            int j = 0;
            while (j < 100) {
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
                j++;
            }
            System.out.println("Completed");
        }
    }

    //Break label
    public static void breakLabel() {
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        System.out.println("it will not print");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");


        }
    }

    //задача. Написать метод, выводящий  на экран треугольник, состоящий из цифр до числа n
        /*
        1
        12
        123
        1234
        12345
        123456
         */
    public static void triangleNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
