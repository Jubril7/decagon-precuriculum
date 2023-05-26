//Collections allows data manipulation; The 3 main types in Java are *LIST *SET  *MAP


import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //LIST: ordered collection that allows duplicate
//        List<String> names = new ArrayList<>();
//        names.add("White");
//        names.add("Jakub");
//        names.add("Sol");
//        names.add("1");
//        System.out.println(names.get(1));
//        boolean isName = names.contains("Jakub");
//        if(isName){
////            System.out.println("Owanbe");
//        }
//        System.out.println(isName);
//        System.out.println(names.get(1));
//        names.remove(2);
//        try{
//            System.out.println(names.get(2));
//        }catch(IndexOutOfBoundsException ibe) {
//            System.out.println("Out of Bound");
//        }
//      ARRAY:
        int[] nums = {1,2,3,4,5};
//        System.out.println(nums);
//        System.out.println(nums.length);
//        System.out.println(nums[4]);

//        Player[] players = { new Player("Saka"),new Player("Eddie"), };
//        System.out.println(Arrays.toString(players));


//            System.out.println(Arrays.toString(nums));

//        try{
//            for(int i : nums) {
//                System.out.println(i);
//            }
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Out of Bound");
//        }


    // SET: unordered collection that does not allow duplicate

//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(3);
////        System.out.println(numbers);
//        numbers.add(4);
//        System.out.println(numbers.size());

        //MAP: collection of key-value pairs
//        Map<String, Integer> players = new HashMap<>();
//        players.put("Jakub", 23);
//        players.put("Wilo", 22);
//        players.put("Zinni", 26);
//        System.out.println(players.get("Wilo"));
//        System.out.println(players.remove("Zinni"));
//        System.out.println(players.size());
//        System.out.println(players);

//===================================================================================

        //====EXAMPLES=====//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number you are searching for followed by the Enter Key: ");

        int[] array = {1, 3, 5, 2, 6, 2, 4};
//        sumArr(array);
//        smallestNum(array);
//        System.out.println(itemIndex(array, scanner.nextInt()));
//        sortArray(array);
//        removeDuplicates(array);
//        reverseArray(array);
    }
    public static void sumArr(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        System.out.println(sum);
    }

    public static void smallestNum(int[] arr) {
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }

//     Use when the method returns void
    public static String itemIndex(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                return "The index of the number " + n + " is " + i;
            }
        }
        return "The number " + n + " is Not Found";
    }

    public static void sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int store = arr[i];
                    arr[i] = arr[j];
                    arr[j] = store;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void removeDuplicates(int[] arr) {
        Set<Integer> noDuplicates = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            noDuplicates.add(arr[i]);
        }
        System.out.println(noDuplicates);
    }

    // reverse and avoid duplicates
    public static void reverseArray(int[] arr) {
        List<Integer> reversedArray = new ArrayList<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            reversedArray.add(arr[i]);
        }
        System.out.println(reversedArray);
    }
}

