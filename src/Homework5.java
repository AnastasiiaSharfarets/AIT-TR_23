import java.util.Scanner;

public class Homework5 {
    //Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа) и
    // выводит в консоль эту информацию в следующем виде:
    //First name: John
    //Last name: Smith
    //Age: 25
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("First name: " + str1 + "\n" + "Last name: " + str2 + "\n" + "Age: " + age);
    }
}
