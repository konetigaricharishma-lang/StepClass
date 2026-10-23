import java.util.Scanner;

abstract class Student {
    String name;
    static final double TRANSPORT = 12000.0;

    Student(String name) {
        this.name = name;
    }

    abstract double tuition();

    abstract boolean usesBus();

    double extraFee() {
        return 0.0;
    }

    double fee() {
        return tuition() + extraFee()
             + (usesBus() ? TRANSPORT : 0.0);
    }
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    double tuition() {
        return 40000.0;
    }

    boolean usesBus() {
        return true;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    double tuition() {
        return 40000.0;
    }

    boolean usesBus() {
        return false;
    }

    double extraFee() {
        return 60000.0;
    }
}

class Scholar extends Student {
    Scholar(String name) {
        super(name);
    }

    double tuition() {
        return 20000.0;
    }

    boolean usesBus() {
        return true;
    }
}

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Student s;

            switch (type) {
                case "DAY_SCHOLAR":
                    s = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    s = new Hosteller(name);
                    break;
                default:
                    s = new Scholar(name);
            }

            double amount = s.fee();

            System.out.printf("%s: %.2f%n", name, amount);
            total += amount;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}
