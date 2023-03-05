public class Homework17 {
    /* Задача 1. Написать метод, который находит количество четных элементов в массиве целых чисел. Метод должен принимать
     массив целых чисел в качестве параметра и возвращать это число.
     public static int countEven( int[] numbers)
     пример: {1,2,4,5,8}-> результат 3, т.к. в массиве 3 числа четные
     Задача 2.
     Дан массив целых чисел. Написать метод, возвращающий разность между наибольшим и наименьшим элементами
     массива.
     public static int countDif(int[] ints)
     пример: {4,2,5,8} -> результат 6, т.к. 8 (максимальный)- 2(минимальный)=6
     */
    public static void main(String[] args) {
        System.out.println(countEven(new int[]{}));
        System.out.println(countDif(new int[]{}));
    }

    public static int countDif(int[] ints) {
        ints = new int[]{4, 2, 5, 8};
        int max = ints[0];
        int min = ints[0];
        for (int index = 1; index < ints.length; index++) {
            if (ints[index] > max) {
                max = ints[index];
            } else if
            (ints[index] < min) {
                min = ints[index];
            }
        }
        return max - min;
    }

    private static int countEven(int[] numbers) {
        numbers = new int[]{1, 2, 4, 5, 8};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


}
