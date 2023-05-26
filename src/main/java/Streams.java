//Streams in Java helps to manipulate collections. Some array manipulations don't work with collect eg For loop

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Streams {
    protected String chant = "Go Go Arsenal";

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> nums = Arrays.asList(2,5,8,32,5,3,55,88,99,99);
        List<String> staff = Arrays.asList("Carlos", "Nico", "Albert", "Gary", "Mikel", "Mikel");

        System.out.println("Numbers -> " + numbers.stream().toList());
        System.out.println("Staff -> " + staff);
        System.out.println("numbers -> " + nums);


        //Filter
        List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).toList();
//        System.out.println("even numbers -> " + evenNumbers);
        List<Integer> oddNumbers = numbers.stream().filter(i -> i % 2 != 0).toList();
//        System.out.println("odd numbers -> " + oddNumbers);
        List<String> headCoach = staff.stream().filter(i -> i == "Mikel").distinct().toList();
//        System.out.println(headCoach);

        //Reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
//        System.out.println("Sum -> " + sum);
        String strSum = staff.stream().reduce(String::concat).toString();
//        System.out.println(strSum);


        // Map
        List<String> coachNameCount = staff.stream().map(String::toLowerCase).toList();
//        System.out.println("Coaches name-letter count-> " + staff + coachNameCount);
//        List<Integer> numbersGreaterThan18 = (List<Integer>) numbers.stream().map(i -> i > 18);
//        System.out.println(numbersGreaterThan18);
        // Know how to map integers


        //Sort
        List<Integer> sorted = nums.stream().sorted().toList();
//        System.out.println("Sorted numbers -> " + sorted);
        List<String> sortStaff = staff.stream().sorted().toList();
//        System.out.println("Sorted coaches -> " + sortStaff);



        //Distinct
        List<Integer> sortedNoDuplicateNum = sorted.stream().distinct().toList();
//        System.out.println("Sorted non-Duplicate numbers -> " + sortedNoDuplicateNum);
        List<String> sortedNoDuplicatesStaff = sortStaff.stream().distinct().toList();
//        System.out.println("Sorted non-Duplicate staff -> " + sortedNoDuplicatesStaff);
        //Find how to get the length of these collections


        System.out.println("=========================================");
//        int[] nums = {1, 2, 3, 4, 5};
//        List<Integer> oddNums = new ArrayList<>();
//        oddNums.add(1);
//        oddNums.add(2);
//        oddNums.add(3);
//        oddNums.add(4);
//        oddNums.add(5);
////        int i = 0;
////        while(i < nums.length) {
////            oddNums.add(nums[i]);
////            i++;
////        }
//        System.out.println("odd nums -> " + oddNums);
//        oddNums.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddNums);


        //Examples
        Random random = new Random();
        int[] rand = new Random().ints(10,1, 10).toArray();
        List<String> clubs = Arrays.asList("Arsenal", "Manchester Blue", "Barcelona", "Dortmund", "Brenford");
        List<Character> strChar = Arrays.asList('r','w','z','p','s','g','s','x','g','o','g');
//        sum(_numbers);
//        printFirstThree(_numbers);
//        printUpperCase(clubs);
//        maxNumber(rand);
        printVowelCount(strChar);
    }
    public static int[] sum(int[] arr) {
        int evenSum = Arrays.stream(arr).filter(i -> i % 2 == 0).sum();
        return new int[]{evenSum};
    }
    public static void printFirstThree(int[] arr) {
        String firstThreeNums = Arrays.toString(Arrays.stream(arr).filter(i -> i <= 3).toArray());
        System.out.println("The First Three Numbers of the Stream is " + firstThreeNums);

//        List<Integer> firstThreeNums = new ArrayList<>();
//        try{
//            int i = 0;
//            while(i < 3) {
//                firstThreeNums.add(arr[i]);
//                i++;
//            }
//        } catch(ArrayIndexOutOfBoundsException obe) {
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
    }
    public static void printUpperCase(List<String> arr) {
        List<String> uppercase = arr.stream().map(String::toUpperCase).toList();
        System.out.println("All clubs to upper-case - " + uppercase);
    }
    public static void maxNumber(int[] arr) {
//        System.out.println(Arrays.toString(new int[]{Arrays.stream(arr).sorted().toArray()[arr.length - 1]}));
        int maxNumber;
//        System.out.println(maxNumber);
    }

    //Use a stream to find the vowel.
    public static void printVowelCount(List<Character> charStr) {
        List<Character> vowels = Arrays.asList('a','e','i','o','u');

        int result = charStr.stream().filter(i -> vowels.contains(i)).toArray().length;
        System.out.println(result);
//        int count = 0;
//        for(int i = 0; i < charStr.size(); i++) {
//            if(vowels.contains(charStr.get(i))) {
//                count++;
//            }
//        }
//        System.out.println("The Number of Vowels is -> " + count);
    }
}
