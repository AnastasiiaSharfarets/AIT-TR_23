import java.util.Scanner;

public class Lesson19 {
    public static void main(String[] args) {
//     Написать метод, который проверяет есть ли заказаная машина в салоне.
//     пример:String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
        String[] cars = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        System.out.println("Enter car mark: ");
        Scanner sc = new Scanner(System.in);
        String carToFind = sc.nextLine();
        searchCar(cars, carToFind);
    }

    private static void searchCar(String[] cars, String carToFind) {
        int length = cars.length;
        for (int i = 0; i < length; i++) {
            if (cars[i].equalsIgnoreCase(carToFind)) {
                System.out.println("Car " + carToFind + " is found");
                return;//break
            }
        }
        System.out.println("Car " + carToFind + " is  not found");
    }

}
