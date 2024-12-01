package stringProblems.string.methord.practice;

public class replaceMehord {
    public static void main(String[] args) {
        String sentence = "    My   name is   sabir     HUSSAIN      ";
        System.out.println(sentence.trim().replaceAll("\\s+"," "));
    }
}
