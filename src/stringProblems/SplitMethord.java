package stringProblems;


public class SplitMethord {
    public static void main(String[] args) {
        String input = "Java programming is fun and challenging.";
        String[] wordArray = input.split(" ");
        System.out.printf("Output: The sentence has %d words.",wordArray.length);
    }
}
