public class Lesson4 {
    public static void main(String[] args) {
        /*Написать программу, определяющую является ли год високосным.
        Год является високосным если год делится на 4.
        Но при этом год, который делится без остатка на 100 является високосным
        только если он без остатка делится на 400.*/
        System.out.println(leapYear(2020));
        System.out.println(leapYear(1999));
        System.out.println(leapYear(400));
        System.out.println(leapYear(1900));//false
    }

    public static boolean leapYear(int a) {
        boolean res = a % 400 == 0 || a % 4 == 0 ^ a % 100 == 0;
        return res;

    }


}
