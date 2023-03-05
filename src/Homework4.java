public class Homework4 {
    /*Задача 1.
Даны два целые числа a и b. Написать логическое выражение, возвращающее true если они равны

Задача 2* ( не обязательно)
Воспитательница в детском саду знает, что если Петя и Вася оба смеются или оба очень серьезные,
то они что-то затевают и надо быть внимательной. Помогите воспитательнице и напишите логическое
выражение,дающее true когда оба мальчика смеются или ходят мрачные.*/
    public static void main(String[] args) {
        System.out.println(sum(1, 1));
        System.out.println(sum(1, 2));
        System.out.println(sum(-11, -11));

        System.out.println(kindergartener(false, false));//->true
        System.out.println(kindergartener(true, true));//->true
        System.out.println(kindergartener(false, true));//->false
        System.out.println(kindergartener(true, false));//->false
    }

    public static boolean sum(int a, int b) {
        boolean result = a == b;
        return result;
    }

    public static boolean kindergartener(boolean smilePetya, boolean smileVasya) {
        boolean res;
        res = smilePetya & smileVasya || !smilePetya & !smileVasya;
        return res;
    }
}
