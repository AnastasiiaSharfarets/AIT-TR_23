import java.util.Scanner;

public class Consultation5 {
    // 1.Найти и вывести на экран сумму двух целых чисел, значения
    //        // которых вводятся с клавиатуры
    //
    //        // 2. написать программу, которая находит площадь и периметр круга,
    //        // радиус вводится с клавиатуры
    //        // perimetr = 2*PI*radius
    //        // area = pi radius^2
    //
    //        // 3.найти минимальное из двух чисел, введенных с клавиатуры  без учета знака
    //        // (использовать методы  класса Math)
    public static void main(String[] args) {
        /*
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The sum: "+ (num1+num2));
        */
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter radius: ");
        int radius = scanner.nextInt();
        double perimetr = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("For radius " + radius + " circle perimetr=" + perimetr + " ,circle area=" + area);
*/
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        System.out.println(absA);
        System.out.println(absB);




    }
}
