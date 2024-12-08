import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeTest {

    @Test
    public void testGetCurrentDateTime() {
        assertNotNull(DateTimeUtils.getCurrentDateTime());
    }

    @Test
    public void testConvertToISOString() {
        LocalDate date = LocalDate.of(2024, 12, 3);
        String isoString = DateTimeUtils.convertToISOString(date);
        assertEquals("2024-12-03T00:00:00Z", isoString);
    }

    @Test
    public void testDaysBetweenDates() {
        LocalDate start = LocalDate.of(2024, 12, 1);
        LocalDate end = LocalDate.of(2024, 12, 5);
        assertEquals(4, DateTimeUtils.daysBetweenDates(start, end));
    }
}
