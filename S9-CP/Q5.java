
import java.util.*;

abstract class Booking {
    double distance;
    static final double BOOKING_FEE = 50;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double totalFare() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends Booking {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 2;
    }
}

class Train extends Booking {
    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Booking {
    Flight(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + distance * 4;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            Booking b;

            switch (type) {
                case "BUS":
                    b = new Bus(distance);
                    break;
                case "TRAIN":
                    b = new Train(distance);
                    break;
                default:
                    b = new Flight(distance);
            }

            System.out.printf("%s: %.2f%n",
                              type, b.totalFare());
        }

        sc.close();
    }
}

