package arxangellos.app.testing.main.ess.biz;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

    public static ZonedDateTime parseDateTime(String dateTime) {
        return EesDateParser.parse(dateTime);
    }

    public static LocalDate parseDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
    }
}
