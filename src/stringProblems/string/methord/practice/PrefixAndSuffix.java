package stringProblems.string.methord.practice;

import java.util.Scanner;

public class PrefixAndSuffix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = input.nextLine();

        System.out.print("Prefix: ");
        String prefix = input.next();

        System.out.print("Suffix: ");
        String suffix = input.next();
        input.close();

        System.out.println("Output:");
        System.out.printf("The sentence starts with \'%s\': %b", prefix,sentence.startsWith(prefix));
        System.out.printf("\nThe sentence ends with \'%s\': %b", prefix,sentence.endsWith(suffix));

    }
}
