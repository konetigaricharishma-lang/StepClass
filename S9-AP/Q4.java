import java.util.Scanner;

abstract class Cab {
    double km;
    static final double MINIMUM_FARE = 100.0;

    Cab(double km) {
        this.km = km;
    }

    abstract double rate();

    double fare() {
        return Math.max(km * rate(), MINIMUM_FARE);
    }
}

interface NightService {
    double nightFare(double fare);
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    double rate() {
        return 10.0;
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double km) {
        super(km);
    }

    double rate() {
        return 14.0;
    }

    public double nightFare(double fare) {
        return fare * 1.20;
    }
}

class SUV extends Cab implements NightService {
    SUV(double km) {
        super(km);
    }

    double rate() {
        return 18.0;
    }

    public double nightFare(double fare) {
        return fare * 1.20;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            if (type.equals("MINI") && time.equals("NIGHT")) {
                System.out.println(
                    "MINI: night service not available"
                );
                continue;
            }

            Cab c;

            switch (type) {
                case "MINI":
                    c = new Mini(km);
                    break;
                case "SEDAN":
                    c = new Sedan(km);
                    break;
                default:
                    c = new SUV(km);
            }

            double amount = c.fare();

            if (time.equals("NIGHT")) {
                amount = ((NightService) c).nightFare(amount);
            }

            System.out.printf("%s: %.2f%n", type, amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}