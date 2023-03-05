public class Lesson20 {
    public static void main(String[] args) {
        String number = "10";
        int num = Integer.parseInt(number);
        System.out.println("String " + (number + 1));
        System.out.println("number " + (num + 1));

        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result;
    }
}
