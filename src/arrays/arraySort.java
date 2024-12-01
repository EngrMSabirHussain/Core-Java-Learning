package arrays;

import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4};
        System.out.println(arr);
        System.out.println("Actual Array: "+ arr);
        System.out.println("Sort Array: "+ Arrays.stream(arr).toArray());
    }
}
