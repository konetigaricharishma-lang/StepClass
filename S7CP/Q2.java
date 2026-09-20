class Scorecard {
    private final boolean[] results;
    private int recordedAnswers;
    private int score;

    Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        recordedAnswers = 0;
        score = 0;
    }

    void recordAnswer(boolean correct) {
        if (recordedAnswers < results.length) {
            results[recordedAnswers] = correct;

            if (correct) {
                score++;
            }

            recordedAnswers++;
        } else {
            System.out.println("Cannot record more answers");
        }
    }

    int getScore() {
        return score;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score: " + sc.getScore());
    }
}
