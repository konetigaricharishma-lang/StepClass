import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return sum / 3.0;
    }

    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 75) {
            return 'B';
        } else if (avg >= 60) {
            return 'C';
        } else if (avg >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    void display() {
        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(),
                calculateAverage(),
                calculateGrade());
    }
}

public class Q10 {
    public static void main(String[] args) {
        Student s1 = new Student("Asha",
                new int[]{80, 90, 70});

        Student s2 = new Student("Ravi",
                new int[]{60, 55, 50});

        s1.display();
        s2.display();
    }
}
