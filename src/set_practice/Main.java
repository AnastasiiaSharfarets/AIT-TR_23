package set_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("John", "Jim", "Mary", "John", "Ann", "Jim"));
        System.out.println(removeDuplicates(names));
        System.out.println(getDuplicates(names));
    }

    // 1. Есть список с именами. Некоторые их них повторяются. С использованием множеств написатьь метод,
    // который вернет список без повторяющтхся элементов
    // ["John", "Jim", "Mary", "John", "Ann", "Jim"]->["John", "Jim", "Mary", "Ann"]
    public static List<String> removeDuplicates(List<String> input) {
        Set<String> set = new HashSet<>(input);
        List<String> res = new ArrayList<>(set);
        return res;//ArrayList<>(set)
    }

    //2.Есть список с именами. Некоторые их них повторяются.С использованием множеств написатьь метод,
    // который вернет список повторяющихся элементов исходного списка
    public static List<String> getDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        for (String s : input) {
            if (!set.add(s)) {//&&!duplicates.contains(s)
                duplicates.add(s);
            }
        }
        return duplicates;
    }
}
