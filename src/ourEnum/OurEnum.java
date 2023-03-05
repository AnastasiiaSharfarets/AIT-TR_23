package ourEnum;

public class OurEnum {
    public static void main(String[] args) {
        System.out.println(Directions.EAST);
        System.out.println(Directions.NORTH);
        System.out.println(Directions.WEST);
        System.out.println(Directions.SOUTH);

        Directions tr = Directions.WEST;
        switch (tr) {
            case EAST:
                System.out.println("This is east");
                break;
            case WEST:
                System.out.println("This is west");
                break;
            case NORTH:
                System.out.println("This is north");
                break;
            case SOUTH:
                System.out.println("This is south");
                break;
            default:
                System.out.println("You can go wherever you want");
        }
        //методы класса Enum(enumeration): values()- содериит список всех констант нашего энума
        System.out.println("_____________________________________________");
        Directions.values();
        for (Directions dir:Directions.values()){
            System.out.println(dir);
        }

        // метод valueOf() - возвращает ту из констант енума, значение которой соотвествует строке, передаваемой в этом методе
        System.out.println(Directions.valueOf("SOUTH"));
        Directions south = Directions.valueOf("SOUTH");


    }
}
