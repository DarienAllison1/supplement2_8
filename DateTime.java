import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Utility class for Java time operations.
 */
public class DateTime {

    /**
     * Returns the current date and time as a ZonedDateTime.
     * 
     * @return the current date and time
     */
    public static ZonedDateTime getCurrentDateTime() {
        return ZonedDateTime.now();
    }

    /**
     * Converts a LocalDate to an ISO 8601 UTC time string.
     * 
     * @param date the date to convert
     * @return the ISO 8601 UTC time string
     */
    public static String convertToISOString(LocalDate date) {
        return date.atStartOfDay().atZone(java.time.ZoneId.of("UTC")).format(DateTimeFormatter.ISO_INSTANT);
    }

    /**
     * Returns the number of days between two LocalDate objects.
     * 
     * @param start the start date
     * @param end   the end date
     * @return the number of days between the two dates
     */
    public static long daysBetweenDates(LocalDate start, LocalDate end) {
        return ChronoUnit.DAYS.between(start, end);
    }
}
