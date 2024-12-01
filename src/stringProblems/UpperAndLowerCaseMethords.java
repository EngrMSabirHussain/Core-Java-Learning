package stringProblems;

import java.util.Scanner;

public class UpperAndLowerCaseMethords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String email = input.nextLine();
        input.close();

        System.out.println(email.substring(email.indexOf('@')+1));
    }
}
