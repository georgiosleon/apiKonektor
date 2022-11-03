/**
 * Copyright 2020 European Union. All rights reserved.
 * European Union PROPRIETARY/CONFIDENTIAL.
 */
package arxangellos.app.testing.main.ess.biz;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import static java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EesDateParser {

    public static final String RE_DATE_TIME = "^[+-]?(\\d{4,9})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?";
    public static final String RE_DATE_TIME_WITH_ZONE = RE_DATE_TIME + "([zZ]|(\\+|\\-)(\\d{2}):(\\d{2}))";

    public static final Pattern MORE_THAN_4_DIGIT_YEAR = Pattern.compile("^(\\d{5,})");
    public static final Pattern DATE_TIME = Pattern.compile(RE_DATE_TIME);
    public static final Pattern DATE_TIME_WITH_ZONE = Pattern.compile(RE_DATE_TIME_WITH_ZONE);

    public static ZonedDateTime parse(String inputDate) {
        String dateToParse = inputDate;
        if (MORE_THAN_4_DIGIT_YEAR.matcher(inputDate).find()) {
            dateToParse = "+" + inputDate;
        }
        if (DATE_TIME_WITH_ZONE.matcher(dateToParse).matches()) {
            return ZonedDateTime.parse(dateToParse, ISO_ZONED_DATE_TIME);
        }
        if (DATE_TIME.matcher(dateToParse).matches()) {
            LocalDateTime localDateTime = LocalDateTime.parse(dateToParse, ISO_LOCAL_DATE_TIME);

            return ZonedDateTime.of(localDateTime, ZoneOffset.UTC);
        }

        Matcher m = DATE_TIME_WITH_ZONE.matcher(dateToParse);
        if (m.find()) {
            String group = m.group();
            try {
                return ZonedDateTime.parse(group, ISO_ZONED_DATE_TIME);
            } catch (DateTimeParseException e) {
                System.out.println( e) ;
            }
        }
        throw new RuntimeException("invalid date format:" + inputDate);
    }
}
