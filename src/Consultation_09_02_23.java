public class Consultation_09_02_23 {
    public static void main(String[] args) {
        /* Написать метод, проверяющий повторяются ли две подстроки одна длиной 3 другая длиной 4 одинаковое
        количество раз в данной строке
        String str =blueredredredcampdfgblueghhblue
        str3 = red
        str4 =blue
        public boolean checkStrings (String str,String str3, String str4)
        Использовать цикл for  и методы класса String  substring, length, equals

         */
        System.out.println(checkStrings("blueredredredcampdfgblueghhblue", "red", "blue"));
    }

    public static boolean checkStrings(String str, String strA, String strB) {
        int l = str.length();
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < l - 2; i++) {
            String tmp = str.substring(i, i + 3);
            if (tmp.equals(strA))
                countA++;
        }
        for (int i = 0; i < l - 3; i++) {
            String tmp = str.substring(i, i + 4);
            if (tmp.equals(strB))
                countB++;
        }
        return countA == countB;

    }
    //Написать метод, проверяющий являются две строки анаграммами. привет - рпиетв
    //  public static boolean isAnsgram(String str1, String str2
    //Arrays.sort(arrayName)
}
