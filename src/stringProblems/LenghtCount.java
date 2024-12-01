package stringProblems;

import java.util.Scanner;

public class LenghtCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();
        String[] words = fullName.split(" ");


        int lengthOfName = 0;
        for (String word:words) {
            lengthOfName += word.length();
        }

        System.out.printf("Length of \"%s\" is: %d \n",fullName,lengthOfName);
        System.out.println(fullName.replace(" ","").length());
    }
}
