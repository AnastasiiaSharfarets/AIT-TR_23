public class ConsultationTasks9 {
    //// Homework for Monday consultation- Task 0 is not compulsory
    //        //0- есть строка  в которой нужно поменять местами две заданные буквы.
    //        // Известно, что эти буквы в строке есть.
    //        //пример: String str = "asDfghjklRre";  поменять D и R
    //
    //        //1- есть строка четной длины и нужно вывести на экран эту строку но при этом первая половина
    //        // букв будет в нижнем регистре а вторая в верхнем
    //        // Helloh -> helLOH
    //
    //        //2- Имеется строка. Нужно вывести на экран эту строку без символа, находящегося по индексу index
    //        // int index =3
    //        // String str = "Hello"
    //        // -> Helo
    public static void main(String[] args) {
        System.out.println(ReplaceTwoLetters("asDfghjklRre", "D", "R"));
        System.out.println(HalfString("Helloh"));
        System.out.println(StringOutOfIndex("Hello", 3));
    }

    public static String ReplaceTwoLetters(String str, String s1, String s2) {
        return str.substring(0, str.indexOf(s1)) + s2 + str.substring(str.indexOf(s1) + 1, str.indexOf(s2)) +
                s1 + str.substring(str.indexOf(s2) + 1);
    }

    public static String HalfString(String a) {
        return a.substring(0, a.length() / 2).toLowerCase() + a.substring(a.length() / 2).toUpperCase();
    }

    public static String StringOutOfIndex(String b, int i) {
        return b.substring(0, i) + b.substring(i + 1);
    }
}
