import java.util.*;
public class WordFrequency {
    static void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "")
                           .replace(",", "");
        String[] words = feedback.split("\\s+");
        Set<String> stopWords = new HashSet<>(
            Arrays.asList("the", "was", "and", "a", "is", "of", "in")
        );
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!stopWords.contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(frequency.entrySet());
        list.sort((x, y) -> y.getValue() - x.getValue());
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }    public static void main(String[] args) {
        String feedback =
                "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(feedback);
    }
}
