import java.util.Scanner;

public class Lesson5_24_01_23 {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner("Hello!");
        String s = scanner.nextLine();
        //System.out.println(s);
        Scanner scanner1 = new Scanner(System.in);//считывает данные с клавиатуры
        System.out.println("Enter your name: ");
        String str1 = scanner1.nextLine();
        System.out.println("Your name is " + str1);
        scanner1.close();
        scanner.close();

       */
        //Scanner scanner2 = new Scanner(System.in);

        //System.out.println("Enter your name: ");
        //String word = scanner2.next();// читает до пробела
        //String word = scanner2.nextLine();// читает все
        //System.out.println("Your full name is " + word);
        /*System.out.println("Enter first number: ");
        int num = scanner2.nextInt();
        System.out.println("You entered " + num);
        System.out.println("Enter second number: ");
        int num2 = scanner2.nextInt();
        System.out.println("You entered: " + num2);
        System.out.println("The sun of your numbers is " + (num + num2));

        int abs = Math.abs(-10);//абсолютное значение
        System.out.println(abs);
        int x1 = 10;
        System.out.println(Math.abs(x1));

        int min = Math.min(10, 23);
        System.out.println(min);
        int max = Math.max(10, 23);
        System.out.println(max);

        double random = Math.random();
        System.out.println(random);

        double round = Math.round(random);
        System.out.println("Rounded random: " + round);

//округление
        double roundDown = Math.round(24.2);
        double roundUp = Math.round(25.7);
        System.out.println("roundDown " + roundDown);
        System.out.println("roundUp " + roundUp);

        double power = Math.pow(2, 3);//степень
        System.out.println(power);

        double sqrt = Math.sqrt(4);//корень числа
        System.out.println("square root is " + sqrt);
*/
        int hour = 7;
        boolean singing = true;
        boolean vasyaInTrouble = singing && (hour < 7 || hour > 20);
        System.out.println(vasyaInTrouble);


    }
}
