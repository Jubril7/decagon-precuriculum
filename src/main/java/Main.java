import java.util.Arrays;
import java.util.List;

 class Main extends Streams {
    int[] arr = {1,2,3,4,5,8};
    public String fname = "Jubril";
    public int iq = 88;

    public int sum() {
        return 1;
    }
//    public abstract void sleep();


}

class Junior extends Main {
    public int iq = 84;
    public void sleep() {
        System.out.println("sleep-in today!!!!");
    }
//    int num = scanner.nextInt();
    //create class attribute
//final double PI = 3.142;
//    int x;
//    private static String carName;
//    private static int theYearBought;
//    static String carColor;
//    //create constructor
//    public Main(String name, int yearBought, String color) {
//        this.carName = name;
//        this.theYearBought = yearBought;
//        this.carColor = color;
//    }
//
//    public String carHistory() {
//        return "The full description of the car is - The model of the car is a " + carName +
//                ", the car was bought in " + theYearBought + " and it is a " + carColor + " colored car";
//    }


//    public Main(int y) {
//        Scanner scanner = new Scanner(System.in);
//        x = scanner.nextInt();
//        x = 2 * y;
//        boolean isEven = true;
//
//    }


    List<Integer> nums = Arrays.asList(1, 23, 4, 6, 8);

    public static void brake() {
        System.out.println("The car will stop!!!");
    }

    public void brakeLight(int a) {
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
        if(a == 0) {
            System.out.println("Light is off");
        } else if(a == 1) {
            System.out.println("Light is on");
        } else {
            System.out.println("Light faulty ");
        }
    }

}
