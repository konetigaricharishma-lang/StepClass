import java.util.*;
import java.time.*;
abstract class LibraryItem {
    String title;
    LibraryItem(String title) {
        this.title = title;
    }
    abstract int getLoanPeriod();
    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26)
                .plusDays(getLoanPeriod());
    }
}
class Book extends LibraryItem {
    Book(String t) {
        super(t);
    }
    int getLoanPeriod() {
        return 14;
    }
}
class DVD extends LibraryItem {
    DVD(String t) {
        super(t);
    }
    int getLoanPeriod() {
        return 7;
    }
}
class Magazine extends LibraryItem {
    Magazine(String t) {
        super(t);
    }
    int getLoanPeriod() {
        return 3;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int pos = line.indexOf(' ');
            String type = line.substring(0, pos);
            String title = line.substring(pos + 1)
                    .replace("\"", "");
            LibraryItem item;
            switch (type) {
                case "BOOK":
                    item = new Book(title);
                    break;
                case "DVD":
                    item = new DVD(title);
                    break;
                default:
                    item = new Magazine(title);
            }
            System.out.println(item.title + ": " + item.getDueDate());
        }
        sc.close();
    }
}
