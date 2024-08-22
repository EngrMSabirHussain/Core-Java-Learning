package learnCodeWithHarry.chapterOnePracticeSet;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many value u want to sum: ");
        int totalValue =input.nextInt();
        System.out.println("Sum : "+sumOfValue(totalValue));

    }
    public static float sumOfValue(int totalValues){
        float sum =0;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<totalValues; i++){
            System.out.print("Input "+(i+1)+" : ");
            float value = input.nextFloat();
            sum+=value;
        }
        return sum;
    }
}
