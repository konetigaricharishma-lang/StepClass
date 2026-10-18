import java.util.*;
import java.util.regex.*;
abstract class Question {
    String correct, answer;
    double points;
    Question(String c, String a, double p) {
        correct = c;
        answer = a;
        points = p;
    }
    abstract double grade();
}
class MCQ extends Question {
    MCQ(String c, String a, double p) {
        super(c, a, p);
    }
    double grade() {
        return answer.equals(correct) ? points : 0;
    }
}
class TF extends Question {
    TF(String c, String a, double p) {
        super(c, a, p);
    }
    double grade() {
        return answer.equals(correct) ? points : 0;
    }
}
class Essay extends Question {
    Essay(String c, String a, double p) {
        super(c, a, p);
    }
    double grade() {
        String[] words = correct.split(",");
        int count = 0;
        for (String word : words) {
            if (answer.toLowerCase().contains(
                    word.trim().toLowerCase())) {
                count++;
            }
        }
        if (count >= 2)
            return points * 0.75;
        else if (count == 1)
            return points * 0.50;
        else
            return 0;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;
        for (int i = 0; i < n; i++) {
            Matcher m = Pattern.compile(
                    "\"([^\"]*)\"|(\\S+)")
                    .matcher(sc.nextLine());
            ArrayList<String> data = new ArrayList<>();
            while (m.find()) {
                data.add(m.group(1) != null
                        ? m.group(1) : m.group(2));
            }
            String type = data.get(0);
            String correct = data.get(2);
            String answer = data.get(3);
            double points = Double.parseDouble(data.get(4));
            Question q;
            switch (type) {
                case "MCQ":
                    q = new MCQ(correct, answer, points);
                    break;
                case "TF":
                    q = new TF(correct, answer, points);
                    break;
                default:
                    q = new Essay(correct, answer, points);
            }
            double score = q.grade();
            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }
        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}
