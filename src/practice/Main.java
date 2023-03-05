package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 9, 8, 7);
        //System.out.println(withoutElementsMoreThanN(ints, 8));
        //System.out.println(withoutElementsMoreThanN(ints, 2));
        List<String> strings = List.of("aa", "bbb", "cccc", "d");
        List<String> strings1 = List.of("aa", "d", "bbb", "cccc");
        System.out.println(theFirstShortestString(strings));
        System.out.println(theFirstLongestString(strings1));

        List<String> strings2 = new ArrayList<>(List.of("aa", "bbbb", "c", "ddd"));
        System.out.println(findShortestOrLongest(strings2));//bbbb
        List<String> strings3 = new ArrayList<>(List.of("a", "bbbb", "c", "ddd"));
        System.out.println(findShortestOrLongest(strings3));
    }

    public static String findShortestOrLongest(List<String> list) {
        String minLengthElement = list.get(0);
        int indexMinElement = 0;
        String maxLengthElement = list.get(0);
        int indexMaxElement = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLengthElement.length()) {
                minLengthElement = list.get(i);
                indexMinElement = i;
            } else if (list.get(i).length() > maxLengthElement.length()) {
                maxLengthElement = list.get(i);
                indexMaxElement = i;
            }
        }
        if (indexMinElement<indexMaxElement)
            return minLengthElement;
        return maxLengthElement;
    }

    //2.Есть лист стрингов, в котором длины всех стрингов различны и он не пустой.
    //Написать метод, возврашающий элемент(строку), который встречается раньше в листе: самый короткий или самый длинный
    public static String theFirstShortestString(List<String> input) {
        String shortestString = input.get(0);
        for (String str : input) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }
        return shortestString;
    }

    private static String theFirstLongestString(List<String> input) {
        String longestStr = input.get(0);
        for (String str : input) {
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        return longestStr;
    }


    //Есть список цнлых чисел. Написать метод, который вернет список без элемеинтов больше заданного
    // [4,1,8,9] если заданное число 8, то результат  [4,1,8]
    //public static List<Integer> withoutElementsMoreThanN(List<Integer>input,int n)
    //алгоритм метода:
    //1. Создать новый лист целых чисел
    //2.Цикл For. В нем сравнить  через  if значение каждого элемента листа с числом n.
    //3.Если оно меньше либо равно n то добавить этот элемент в новый лист
    //После окончания цикла возврашаем новый лист
    public static List<Integer> withoutElementsMoreThanN(List<Integer> input, int n) {
        List<Integer> withoutMoreThan = new ArrayList<>();
        for (int number : input) {
            if (number <= n) {
                withoutMoreThan.add(number);
            }
        }
        return withoutMoreThan;
    }
}
