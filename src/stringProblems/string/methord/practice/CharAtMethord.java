package stringProblems.string.methord.practice;

import java.util.Scanner;

public class CharAtMethord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = input.nextLine();

        System.out.print("Character: ");
        char character = input.next().charAt(0);
        input.close();

        int count = 0;
        for (char c:sentence.toCharArray()) {
            if(c == character){
                count++;
            }
        }

        System.out.printf("The character \'%c\' appears %d times in the sentence.",character,count);
    }
}
