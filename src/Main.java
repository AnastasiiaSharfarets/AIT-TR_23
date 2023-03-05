public class Main {
    public static void main(String[] args) {
        /*Задача 1.
        Написать программу, выводящую на экран результат деления двух целых чисел     25 и 3.
        Результат не должен быть округлен до целых. Посчитать также остаток от деления этих чисел.
        */
        int a = 25;
        int b = 3;
        double res = a / (double) b;//  или (double) a/b, нужно закастить в дабл один из интов
        double resModulo = a % b;
        System.out.println(res);
        System.out.println(resModulo);

        /*Задача 2.
        Написать программу, выводящую на экран значение переменной типа инт в квадрате. Предварительно обьявите эту
         переменную и задайте ее значение
         */
        int c = 4;
        int result = c * c;
        System.out.println(result);
    }

}