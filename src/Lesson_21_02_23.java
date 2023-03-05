import java.util.HashMap;
import java.util.Map;

public class Lesson_21_02_23 {
    public static void main(String[] args) {

        String[] strings = new String[]{"a", "b", "a", "c", "b"};
        String[] strings1 = new String[]{"a", "b", "c"};
        String[] strings2 = new String[]{"c", "c", "c"};

        System.out.println("[a,b,a,c,b]" + mapStringBoolean(strings));
        System.out.println("[a,b,c]" + mapStringBoolean(strings1));
        System.out.println("[c,c,c]" + mapStringBoolean(strings2));

        System.out.println(mapTrueFalse(strings));
        System.out.println(mapTrueFalse(strings1));
        System.out.println(mapTrueFalse(strings2));

        Map map = new HashMap();
        //Map<K,V> map = new HashMap<K,V>();
        //K-тип ключа, V- тип значений
        HashMap<Integer, String> ourMap = new HashMap<>();
        ourMap.put(10, "Red");
        ourMap.put(5, "Green");
        ourMap.put(20, "Yellow");
        System.out.println(ourMap);
        ourMap.put(null, "Black");
        System.out.println(ourMap);

        System.out.println("element with key = 5 " + ourMap.get(5));

        String result = ourMap.get(5);
        System.out.println(result);
        //получить значение или вернуть заранее определенное нами значение по умолчанию getOrDefault
        ourMap.getOrDefault(17, "Pink");
        ourMap.getOrDefault(20, "Pink");
        //проверить существование в мапе ключа
        System.out.println(ourMap.containsKey(10));
        System.out.println(ourMap.containsKey(24));
        //проверить наличие значения в мапе
        boolean hasValue = ourMap.containsValue("Green");
        System.out.println(hasValue);
        hasValue = ourMap.containsValue("Brown");
        System.out.println(hasValue);

        // for (int key : ourMap.keySet()) {
        //   System.out.println("key is " + key + "and value is" + ourMap.get(key));
        //
        // }
//Дана Map<String,String>map написать метод, который вернет мапу, такую что если в исходной мапе

        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");

        System.out.println(ab(mapAB));
    }

    // есть ключи "a" и "b", то нужно создать новый элемент с ключом "ab" и с суммой значений  от ключей a и b
    //в качестве значения. Если таких ключей нет, то ничего не менять
    //AB {"a":"Hi" , "b": "There"} -> {"a":"Hi", "ab":"HiThere", "b":"There"}
    //AB {"a":"Hi"} ->  {"a":"Hi"}
    //AB {b:There} -> {b:There}
    public static Map<String, String> ab(Map<String, String> mapAB) {
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            String key = "ab";
            String value = mapAB.get("a").concat(mapAB.get("b"));
            mapAB.put(key, value);
        }
        return mapAB;
    }

    // Есть массив строк. Не пустой.  Написать метод, возвращающий мапу Map<String, Boolean> где каждая строка
// является ключом, а значением является  true  если строка в массиве встречается больше одного раза
// и false если только один раз
// Map<String,Boolean> mapStringBoolean( String[] strings
    /*
    [a,b,a,c,b] -> {a:true, b: true, c: false}
     [a,b,c,] -> {a:false, b: false, c: false}
     [c,c,c,] -> {c: true}
*/
    public static Map<String, Boolean> mapStringBoolean(String[] strings) {
        HashMap<String, Boolean> mapStringBoolean = new HashMap<>();
        for (int j = 0; j < strings.length; j++) {
            boolean occursTwice = false;
            for (int i = 0; i < strings.length; i++) {
                if (strings[j].equals(strings[i]) && !(i == j)) {
                    occursTwice = true;
                    break;
                }
            }
            mapStringBoolean.put(strings[j], occursTwice);
        }
        return mapStringBoolean;
    }

    public static Map<String, Boolean> mapTrueFalse(String[] strings) {
        HashMap<String, Boolean> nameToBoolean = new HashMap<>();
        for (String s : strings) {
            if (nameToBoolean.containsKey(s)){
                nameToBoolean.put(s,true);
            }else{
                nameToBoolean.put(s,false);
            }
        }
        return nameToBoolean;
    }
}
