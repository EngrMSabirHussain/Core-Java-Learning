package learnCodeWithHarry.chapterOnePracticeSet;

import java.util.Scanner;

public class GreatingMessage {
    /*
    Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.
     */
    public static void main(String[] args) {
        String greetingMessage = "Hello <name>, have a good day.";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        greetingMessage = greetingMessage.replace("<name>",name);
        System.out.println(greetingMessage);
    }
}
