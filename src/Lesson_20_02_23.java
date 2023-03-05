

import java.util.HashSet;
import java.util.Set;

public class Lesson_20_02_23 {
    public static void main(String[] args) {
        //Set-множество
        //


        Set<String> hashSet = new HashSet<>();
        boolean isAdded = hashSet.add("Brown");
        System.out.println("element is added "+ isAdded);
        isAdded = hashSet.add("Brown");



        //isEmpty() - checks if the set is empty
        System.out.println(hashSet.isEmpty());//false
        //contains()
        boolean containsBlue = hashSet.contains("Blue");
        System.out.println(containsBlue);

    }

}
