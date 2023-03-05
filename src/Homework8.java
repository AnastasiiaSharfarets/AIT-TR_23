public class Homework8 {
    //Даны две строки. Написать программу, выводящую в консоль строки, соединенные вместе, но без первых букв.
    //Пример: Hello There -> ellohere
    public static void main(String[] args) {
        System.out.println(concatString("Привет", "Медвед"));
    }

    public static String concatString(String s1, String s2) {
        return s1.substring(1) + s2.substring(1);
    }
}
