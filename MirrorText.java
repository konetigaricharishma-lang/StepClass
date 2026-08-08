public class MirrorText {

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }

            result.append(sb).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String sentence = "hello club";

        System.out.println(reverseEachWord(sentence));
    }
}