package arrays;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] arr = new float[5];
        for(int i=0 ;i<arr.length; i++){
            System.out.printf("Enter %d Value: ",i+1);
            arr[i] = input.nextFloat();
        }
        input.close();

        float sum = 0;
        for(float num: arr){
            sum+=num;
        }

        System.out.println("Sum of Array: "+sum);
    }
}
