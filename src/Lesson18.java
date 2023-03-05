public class Lesson18 {
    public static void main(String[] args) {
        //forEachLoop(new int[]{});
        forEachLoopBreak(new int[]{});
    }

    //For-each loop используется, когда не важен индекс элемента
    //for(type iteration-var: array)
    //      statement(s)
    public static void forEachLoop(int[] ints) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += nums[i];
        }
        int sum1 = 0;
        for (int x : nums) {
            sum1 += x;
            System.out.println("x=" + x);
        }
        System.out.println("Sum of elements is " + sum);
        System.out.println("Sum of elements is " + sum1);

    }

    //break with for each
    public static void forEachLoopBreak(int[] ints) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            sum += x;
            System.out.println("x=" + x);
            if (x == 5) break;
        }
        System.out.println("Sum of elements is " + sum);
    }

    public static void findElt(int[] ints, int value) {
        boolean found = false;
        for (int x : ints) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");
    }

}
