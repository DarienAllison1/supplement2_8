import java.time.LocalDate;

/**
 * Main class to demonstrate the usage of DateTimeUtils utility methods.
 */
public class Main {
    /**
     * Entry point of the application. Demonstrates various utility methods for working with dates.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Current Date and Time: " + DateTime.getCurrentDateTime());

        LocalDate start = LocalDate.of(2024, 12, 14);
        LocalDate end = LocalDate.of(2025, 5, 12);

        System.out.println("Days between 2024-12-14 and 2025-05-12: " + DateTime.daysBetweenDates(start, end));
        System.out.println("ISO String for Start Date (2024-12-14): " + DateTime.convertToISOString(start));
        System.out.println("ISO String for End Date (2025-05-12): " + DateTime.convertToISOString(end));
    }
}
