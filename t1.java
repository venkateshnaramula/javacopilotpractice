import java.util.ArrayList;
import java.util.List;

public class t1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");

        // Task: Use Copilot to complete the code to print each word in uppercase
        for (String word : words) {
            String upperCaseWord = word.toUpperCase();
            System.out.println(upperCaseWord);
        }
    }
}
