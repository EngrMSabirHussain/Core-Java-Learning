package stringProblems;

import java.util.Scanner;

public class reverseEachWordInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = input.nextLine();
        input.close();

        System.out.println("Output: "+ reverseWordString(sentence));


    }
    public static String reverseWordString(String input){
        String[] arr = input.trim().replaceAll("\\s+", " ").split(" ");
        StringBuilder output = new StringBuilder();
        StringBuilder reverseWord;
        for (String stringWord:arr) {
            reverseWord = new StringBuilder("");
            for (int i=(stringWord.length()-1); i>=0; i--) {
                reverseWord.append(stringWord.charAt(i));
            }
            output.append(reverseWord).append(" ");
        }

        return output.toString().trim();
    }
}
