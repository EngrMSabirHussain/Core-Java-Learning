package stringProblems;

import java.util.Scanner;

public class ReplaceMethord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = input.nextLine();
        System.out.print("Word to censor: ");
        String censorWord = input.nextLine();
        input.close();

        System.out.println("Output: " + sentence.replace(censorWord,"*".repeat(censorWord.length())));
    }
}
