import java.util.Scanner;
public class Task4 {
    //В банкомате есть банкноты 1,5,10 долларов. Посчитать минимальное количество банкнот,
    //            необходимых для выдачи суммы денег n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int a = n / 10;     //кол-во 10$ купюр
        int b = n % 10 / 5; //кол-во 5$
        int c = b % 5 / 1;  //кол-во 1$
        int amount = a + b + c;
        System.out.println("Amount of banknotes: " + amount);

    }
    //Задача 3. По желанию, для тех, у кого уже стоит IDE.
    //Даны два целые числа a и b. Написать логическое выражение, возвращающее true если одно из чисел равно 10 или их сумма равна 10.
    //Использовать можно только логические операторы AND OR NOT XOR, операторы сравнения (==, >, <, != )
    //Ну и арифметические конечно тоже)

}
