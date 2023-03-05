import java.util.Arrays;

public class Homework19 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        arr[0] = 2;
        arr[1] = 5;
        System.out.println("array length is " + arr.length);
        System.out.println(Arrays.toString(arr));
        int[] ints = arrToReverse();
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }

    }

    private static int[] arrToReverse() {
        // в переменной а будет храниться значение длинны массива. Мы получаем его с помощью подсчета встречающихся
        // в цикле от 1 до 99 чисел
        int a = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                a++;
            }
        }
        //теперь в а записано кол-во всех нечет чисел, использует его в качестве длинны
        System.out.println("Length of odd munbers array is " + a);
        //создаем массив и с помощью цикла заполняем его ячейки нечетными числами
        int[] arr = new int[a];
        for (int i = 1, j = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                System.out.println(arr[i] + " ");
                j++;
            }
        }
        return arr;
    }

}
