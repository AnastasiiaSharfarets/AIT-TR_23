public class Homework18 {
    /*
    Написать метод, который проверяет равенство двух массивов целых чисел.
public static boolean areEqual( int[] numbers,int[]numbers1)
пример: {1,2,3} и {1,2,3} равны. {1,2,3} и {1,3,2} нет
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers1 = {1, 2, 3};
        //int[] numbers1 = {1, 2, 3, 5, 3};
        areEqual(numbers1, numbers1);
    }

    private static boolean areEqual(int[] numbers, int[] numbers1) {
        if (numbers.length != numbers1.length) {
            System.out.println("Lengths are different");
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {

        }
        return true;
    }
}
