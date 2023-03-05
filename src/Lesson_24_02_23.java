import java.util.*;

public class Lesson_24_02_23 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 234);
        map.put(2, 234);
        map.put(3, 234);
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        map1.put(1, "Yellow");
        map1.put(2, "Red");
        map1.put(3, "Black");
        map2.put(4, "White");
        map2.put(5, "Orange");
        map2.put(6, "Blue");

        System.out.println(map.getOrDefault(1, 0));
        System.out.println(map.getOrDefault(4, 1));
        System.out.println(map.get(5));

        System.out.println(copyMap(map1, map2));

        List<String> names = List.of("vani", "ivan", "petr", "terp", "navi", "maria");
        System.out.println(anagramList("ivan", names));//->vani, ivan, navi
        System.out.println(anagramList("pert", names));//->petr, terp
        System.out.println(anagramList("maria", names));//->maria
        System.out.println(anagramList("Nick", names));//->No such name in the list


    }

    /*
    1. Написать метод, копирующий все элементы из одной мапы в другую мапу
    2. Написать метод, проверяющий содержит ли мапа Map<Integer, String> заданный элемент
    3. Написать метод, проверяющий содержит ли мапа данный ключ
    4. Написать метод, проверяющий содержит ли мапа данное значение
    5*.Написать метод, который принимает список имеи и их анаграмм и имя, по которому
    он выдает список всех анаграмм этого имени, включая само имя
    [vani, ivan, petr, terp, navi, maria], ivan->vani, ivan, navi;
     */
    //1
    public static Map<Integer, String> copyMap(Map<Integer, String> map1, Map<Integer, String> map2) {
        map2.putAll(map1);
        return map2;
    }

    //5*
    public static List<String> anagramList(String name, List<String> strings) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s: strings){
            String sortedKey = sortAnagram(s);
            if (anagrams.containsKey(sortedKey)) {
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            }
            else {
                List<String>value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }
            //System.out.println(anagrams);
        }
        return anagrams.getOrDefault(sortAnagram(name),Arrays.asList("No such name in the list"));
    }

    private static String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
