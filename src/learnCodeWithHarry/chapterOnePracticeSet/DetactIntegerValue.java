package learnCodeWithHarry.chapterOnePracticeSet;

import java.util.Scanner;

public class DetactIntegerValue {
    /*
    Write a java program to detect whether a number entered by the users is integer or not.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("Enter any Value: ");
            if(input.hasNextInt()){
                int value = input.nextInt();
                System.out.println("you enter valid Interger: "+ value);
            }else{
                System.out.println("you not enter valid integer");
                input.next();
            }
            System.out.print("Want to run again? (enter 1 or 0) : ");
            flag = false;
            if(input.hasNextInt()){
                int choice = input.nextInt();
                if(choice == 1){
                    flag = true;
                }
            }
        }
    }
}
